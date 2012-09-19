/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sge.vista;

import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import sge.entidades.Localidad;
import sge.entidades.Provincia;
import sge.exception.ConectividadException;
import sge.servicio.GestionEnvioServicios;

/**
 *
 * @author Marcos
 */
public class JABMLocalidadesPresenter {
    private Localidad aLocalidad;
    private List<Provincia> provinciaList;
    
    public JABMLocalidadesPresenter(JABMLocalidadesViewer vista) {
        this.vista = vista;
    }
    
    private JABMLocalidadesViewer vista;
    private GuardarLocalidadHandler guardarLocalidad = new GuardarLocalidadHandler();
    private BuscarProvinciaHandler provinciaHandler = new BuscarProvinciaHandler();
    private BuscarLocalidadHandler localidadHandler = new BuscarLocalidadHandler();

    public BuscarLocalidadHandler getLocalidadHandler() {
        return localidadHandler;
    }

    public BuscarProvinciaHandler getProvinciaHandler() {
        return provinciaHandler;
    }
    
    public GuardarLocalidadHandler getGuardarLocalidad() {
        return guardarLocalidad;
    }
    
    class GuardarLocalidadHandler  implements ChangeListener{
        
        @Override
        public void stateChanged(ChangeEvent ce) {   
            boolean resultado = false;
            Integer modo = vista.getModo();
          
            if (modo == 1){
                resultado =crearLocalidad();
            }else{
                resultado =eliminarLocalidad();
            }
 
            if(resultado){
                ///Limpio los campos de texto
                vista.getTxtCodPostal().setText("");
                vista.getTxtDscLocalidad().setText("");

                ///Reinicializo los combos
                vista.getCboProvincia().setSelectedIndex(0);
            }
            ///Notifico el resultado
            vista.notificar(resultado);

        }


        private boolean crearLocalidad() {
            boolean resultado = false;
            
            aLocalidad = new Localidad();
            Provincia aProvincia=null;
            aLocalidad.setCodigoPostal(vista.getTxtCodPostal().getText().trim()); 
            aLocalidad.setNombre(vista.getTxtDscLocalidad().getText().trim());
            aProvincia = provinciaList.get(vista.getCboProvincia().getSelectedIndex());
            aLocalidad.setProvincia(aProvincia);  
            
            try {
                resultado = GestionEnvioServicios.guardarLocalidad(aLocalidad);
                if (!resultado){
                    vista.notificarMensaje("La Localidad ya existe en los registros",JOptionPane.ERROR_MESSAGE);
                    resultado=false;
                }
            } catch (ConectividadException ex) {
                notificarException(ex);
            }
        
            return resultado;
        }

        private boolean eliminarLocalidad() {
            boolean resultado = false;
            
            aLocalidad = new Localidad();
            Provincia aProvincia=null;
            aLocalidad.setCodigoPostal(vista.getTxtCodPostal().getText().trim()); 
            aProvincia = provinciaList.get(vista.getCboProvincia().getSelectedIndex());
            aLocalidad = aProvincia.getLocalidades().get(vista.getCboLocalidad().getSelectedIndex());
            
            aLocalidad.setProvincia(aProvincia);  
            
            try {
                resultado = GestionEnvioServicios.eliminarLocalidad(aLocalidad);
                if (!resultado){
                    vista.notificarMensaje("La Localidad ya existe en los registros",JOptionPane.ERROR_MESSAGE);
                    resultado=false;
                }
            } catch (ConectividadException ex) {
                notificarException(ex);
            }
        
            return resultado;
        }
     }
     
     class BuscarProvinciaHandler  implements ChangeListener{

        @Override
        public void stateChanged(ChangeEvent ce) { 
            Provincia aProvincia=null;
            List<Localidad> localidadList=null;
            Localidad aLocal = null;

            try {
                provinciaList = GestionEnvioServicios.buscarProvincia();
            } catch (ConectividadException ex) {
                notificarException(ex);
            }
            for (Iterator<Provincia> it = provinciaList.iterator(); it.hasNext();) {
                Provincia provincia = it.next();             
                vista.getCboProvincia().addItem(provincia.getNombre());
            }
        aProvincia =   provinciaList.get(vista.getCboProvincia().getSelectedIndex());         
        localidadList = aProvincia.getLocalidades();
        for (Iterator<Localidad> it = localidadList.iterator(); it.hasNext();) {
                Localidad localidad = it.next();
                vista.getCboLocalidad().addItem(localidad.getNombre());
        }
        aLocal = localidadList.get(vista.getCboLocalidad().getSelectedIndex());
        
        if (vista.getModo()==2||vista.getModo()==3){
            
            vista.getTxtCodPostal().setEditable(true);
            vista.getTxtCodPostal().setText(aLocal.getCodigoPostal());
            vista.getTxtDscLocalidad().setEditable(true);  
            vista.getTxtDscLocalidad().setText(aLocal.getNombre());
        }  
        }     
     }
    
        class BuscarLocalidadHandler  implements ChangeListener{

            @Override
            public void stateChanged(ChangeEvent ce) { 
                List<Localidad> localidadList=null;
                Provincia aProvincia = null;
                Localidad aLocal = null;

                vista.getCboLocalidad().removeAllItems();

                aProvincia = provinciaList.get(vista.getCboProvincia().getSelectedIndex());

                localidadList = aProvincia.getLocalidades();
                for (Iterator<Localidad> it = localidadList.iterator(); it.hasNext();) {
                    Localidad localidad = it.next();
                    vista.getCboLocalidad().addItem(localidad.getNombre());
                }
                aLocal = localidadList.get(vista.getCboLocalidad().getSelectedIndex());
                
                if (vista.getModo()==2||vista.getModo()==3){
                    vista.getTxtCodPostal().setEditable(true);
                    vista.getTxtCodPostal().setText(aLocal.getCodigoPostal());
                    vista.getTxtDscLocalidad().setEditable(true);  
                    vista.getTxtDscLocalidad().setText(aLocal.getNombre());
                }   
            }
        }
    
     private void notificarException(Exception ex){
            vista.notificarException(ex);
   
     }
    
}

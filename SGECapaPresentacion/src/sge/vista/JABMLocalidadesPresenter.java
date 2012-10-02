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
          
            resultado =crearLocalidad();
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
       
        }     
     }
 
    
     private void notificarException(Exception ex){
            vista.notificarException(ex);
   
     }
    
}

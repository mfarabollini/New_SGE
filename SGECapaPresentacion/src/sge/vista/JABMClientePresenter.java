/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sge.vista;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import sge.entidades.Cliente;
import sge.entidades.Envio;
import sge.entidades.Localidad;
import sge.entidades.Provincia;
import sge.exception.ConectividadException;
import sge.servicio.GestionEnvioServicios;

/**
 *
 * @author Marcos
 */
public class JABMClientePresenter {
    private Cliente aCliente;
    private List<Provincia> provinciaList;
    
    private JABMClienteViewer vista;
    private BotonClickHandler pres = new BotonClickHandler();
    private BuscarProvinciaHandler provinciaHandler = new BuscarProvinciaHandler();
    private BuscarClienteHandler clienteHandler = new BuscarClienteHandler();
    private BuscarLocalidadHandler localidadHandler = new BuscarLocalidadHandler();
    
    public JABMClientePresenter(JABMClienteViewer vista) {        
        this.vista = vista;
    }
     
    public BotonClickHandler getPres() {
        return pres;
    }

    public BuscarProvinciaHandler getProvinciaHandler() {
        return provinciaHandler;
    }
    
    public BuscarClienteHandler getClienteHandler() {
        return clienteHandler;
    }

    public BuscarLocalidadHandler getLocalidadHandler() {
        return localidadHandler;
    }
    


    
    class BotonClickHandler  implements ChangeListener{
        
        @Override
        public void stateChanged(ChangeEvent ce) {    
            boolean resultado = false;
            Integer modo = vista.getModo();
          
            if (modo == 1){
                resultado =crearCliente();
            }
            if (modo == 2){
                resultado =actualizarCliente();
            }
            if (modo == 3){
                resultado =eliminarCliente();
            }
            
            if(resultado){
                ///Limpio los campos de texto
                vista.getTxtId().setText("");
                vista.getTxtCuit().setText("");
                vista.getTxtRazonSocial().setText("");
                vista.getTxtDir().setText("");
                vista.getTxtTel().setText("");
                vista.getTxtTel2().setText("");
                vista.getTxtMail().setText("");

                ///Reinicializo los combos
                vista.getCboProvincia().setSelectedIndex(0);
                vista.getCboLocalidad().setSelectedIndex(0);
            }
            ///Notifico el resultado
            vista.notificar(resultado);

        }
    }
    class BuscarProvinciaHandler  implements ChangeListener{
        
        @Override
        public void stateChanged(ChangeEvent ce) { 
            Provincia aProvincia=null;
            List<Localidad> localidadList=null;
            
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
        }       
    }
    
    class BuscarLocalidadHandler  implements ChangeListener{
        
        @Override
        public void stateChanged(ChangeEvent ce) { 
            List<Localidad> localidadList=null;
            Provincia aProvincia = null;
            
            vista.getCboLocalidad().removeAllItems();
           
            aProvincia = provinciaList.get(vista.getCboProvincia().getSelectedIndex());
                       
            localidadList = aProvincia.getLocalidades();
            for (Iterator<Localidad> it = localidadList.iterator(); it.hasNext();) {
                 Localidad localidad = it.next();
                 vista.getCboLocalidad().addItem(localidad.getNombre());
            }
        }       
    }
    
    class BuscarClienteHandler  implements ChangeListener{
        @Override
        public void stateChanged(ChangeEvent ce) {     
            boolean esNumero = true;
            Integer codigoC  ;
            List<Cliente> clientes = null;
            JBuscarEntidadPresenter buscarEntPresenter;
            ClienteTableModel aTableModel;
            
            String codigo = vista.getTxtClienteBusq().getText();
                        
            for (int i=0;i<codigo.length();i++){
                if (!Character.isDigit(codigo.charAt(i))){
                    esNumero=false;
                }
            }
            
            if(esNumero){
                codigoC = Integer.valueOf(codigo);
                try {
                    aCliente = GestionEnvioServicios.buscarClientePorCodigo(codigoC,true);
                } catch (ConectividadException ex) {
                    notificarException(ex);
                }
            }else{
                try {
                    clientes = GestionEnvioServicios.buscarClientesPorRazonSocial(codigo,true);
                } catch (ConectividadException ex) {
                    notificarException(ex);
                }
                if(clientes.size()== 1){
                   aCliente = clientes.get(0);                   
                }else{
                    buscarEntPresenter = new JBuscarEntidadPresenter();
                    aTableModel = new ClienteTableModel(clientes);
                    buscarEntPresenter.setClase(Cliente.class);
                    buscarEntPresenter.setResultado(clientes);
                    buscarEntPresenter.setHabilitado(true);
                    buscarEntPresenter.setModel(aTableModel);
                    buscarEntPresenter.mostrar();   
                    aCliente = (Cliente) buscarEntPresenter.getEntidad();  
                }                    
            } 
            if(aCliente!= null){
                vista.getTxtClienteBusq().setText("");
                vista.getTxtId().setText(aCliente.getNroCliente().toString());
                vista.getTxtRazonSocial().setText(aCliente.getRazonSocial());
                vista.getTxtCuit().setText(aCliente.getCuit());
                vista.getTxtDir().setText(aCliente.getDireccion());                
                vista.getCboProvincia().setSelectedItem(aCliente.getLocalidad().getProvincia().getNombre());     
                vista.getCboLocalidad().setSelectedItem(aCliente.getLocalidad().getNombre());
                vista.getTxtTel().setText(aCliente.getTelefono());
                vista.getTxtTel2().setText(aCliente.getTelefonoAlternativo());
                vista.getTxtMail().setText(aCliente.getEmail());
            }   
        }
       
    }
    private void notificarException(Exception ex){
        vista.notificarMensaje(ex.toString(),JOptionPane.ERROR);
    }
    
    private boolean crearCliente(){
        Localidad aLocalidad=null;
        Provincia aProvincia=null;
        
        boolean resultado = false;
        //Validar si existe el nro de cliente
        aCliente = new Cliente();
        
        aCliente.setNroCliente(Integer.valueOf(vista.getTxtId().getText()));
        aCliente.setRazonSocial(vista.getTxtRazonSocial().getText());
        aCliente.setCuit(vista.getTxtCuit().getText());
        aCliente.setDireccion(vista.getTxtDir().getText());
        aCliente.setTelefono(vista.getTxtTel().getText());
        aCliente.setTelefonoAlternativo(vista.getTxtTel2().getText());
        aCliente.setEmail(vista.getTxtMail().getText());
        aCliente.setHabilitado(true);
        aProvincia = provinciaList.get(vista.getCboProvincia().getSelectedIndex());
        aLocalidad=aProvincia.getLocalidades().get(vista.getCboLocalidad().getSelectedIndex());
        aCliente.setLocalidad(aLocalidad);
        
        try {
            resultado = GestionEnvioServicios.guardarCliente(aCliente);
            if (!resultado){
                vista.notificarMensaje("El cliente ya existe en los registros",JOptionPane.ERROR_MESSAGE);
                resultado=false;
            }
        } catch (ConectividadException ex) {
            notificarException(ex);
        }
        
        return resultado;
    }
    
    private boolean actualizarCliente(){
        boolean resultado = false;
        Localidad aLocalidad=null;
        Provincia aProvincia=null;
        
        aCliente.setNroCliente(Integer.valueOf(vista.getTxtId().getText()));
        aCliente.setRazonSocial(vista.getTxtRazonSocial().getText());
        aCliente.setCuit(vista.getTxtCuit().getText());
        aCliente.setDireccion(vista.getTxtDir().getText());
        aCliente.setTelefono(vista.getTxtTel().getText());
        aCliente.setTelefonoAlternativo(vista.getTxtTel2().getText());
        aCliente.setEmail(vista.getTxtMail().getText());
        aCliente.setHabilitado(true);
        aProvincia = provinciaList.get(vista.getCboProvincia().getSelectedIndex());
        aLocalidad= aProvincia.getLocalidades().get(vista.getCboLocalidad().getSelectedIndex());
        aCliente.setLocalidad(aLocalidad);
        
        try {
            resultado = GestionEnvioServicios.actualizarCliente(aCliente);
        } catch (ConectividadException ex) {
            notificarException(ex);
        }
        
        return resultado;
    }
    
    private boolean eliminarCliente(){
        boolean resultado = false;
        
        aCliente.setHabilitado(false);
        try {
            resultado = GestionEnvioServicios.actualizarCliente(aCliente);
        } catch (ConectividadException ex) {
            notificarException(ex);
        }
        return resultado;
    }
    
}


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sge.vista;


import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import sge.entidades.Cliente;
import sge.entidades.Envio;
import sge.entidades.LineaEnvio;
import sge.entidades.MedioEnvio;
import sge.entidades.Parametro;
import sge.exception.ConectividadException;
import sge.servicio.GestionEnvioServicios;

/**
 *
 * @author mboni
 */
public class JModificarEnvioPresenter {
    private Envio aEnvio;
    private MedioEnvio aMedio;
    private Cliente aCliente;
    private JModificarEnvioViewer vista;
    private List lineasDeEnvioMap;
    private int posLinea;    
    private TransporteChangeHandler handler= new TransporteChangeHandler();
    private CancelarHandler cancelarHandler = new CancelarHandler();
    private ClienteChangeHandler handlerCliente = new ClienteChangeHandler();    
    private GuardarHandler guardarHandler = new GuardarHandler();
    private BuscarEnvioHandler buscarEnvioHandler = new BuscarEnvioHandler();
    private BorrarHandler borrarHandler = new BorrarHandler();
    
    public JModificarEnvioPresenter(JModificarEnvioViewer vista) {
        aEnvio = new Envio();
        lineasDeEnvioMap = new ArrayList();
        this.vista = vista;
        Parametro aParametro= GestionEnvioServicios.getParametro("LNMULT");
        
        vista.setMultiplesLineas(Boolean.valueOf( aParametro.getDetalle().get(0).getValor()));
    }

    public BuscarEnvioHandler getBuscarEnvioHandler() {
        return buscarEnvioHandler;
    }
    
    public TransporteChangeHandler getHandler() {
        return handler;
    }
    public ClienteChangeHandler getClienteHandler() {
        return handlerCliente;
    }

    /**
     * @return the cancelarHandler
     */
    public CancelarHandler getCancelarHandler() {
        return cancelarHandler;
    }

    public GuardarHandler getGuardarHandler() {
        return guardarHandler;
    }

    public BorrarHandler getBorrarHandler() {
        return borrarHandler;
    }


    public class TransporteChangeHandler  implements ChangeListener{
        @Override
        public void stateChanged(ChangeEvent ce) {   
            JBuscarEntidadPresenter buscarEntPresenter;
            MedioEnvioTableModel aTableModel;
            List<MedioEnvio> medios = null;
            boolean esNumero = true;
            String codigo = vista.getTxtCodTransporte().getText();
             
            for (int i=0;i<codigo.length();i++){
                if (!Character.isDigit(codigo.charAt(i))){
                    esNumero=false;
                }
            }
            if(esNumero){
                Integer codigoT = Integer.valueOf(codigo);
                try {
                    aMedio = GestionEnvioServicios.buscarMedioEnvioPorCodigo(codigoT,false);
                } catch (Exception ex) {
                    notificarException (ex);
                }
            }else{
                try {
                    medios = GestionEnvioServicios.buscarMediosEnvioPorRazonSocial(codigo,false);
                } catch (Exception ex) {
                    notificarException (ex);
                }
                if(medios.size()== 1){
                    aMedio = medios.get(0);                   
                }else{
                    buscarEntPresenter = new JBuscarEntidadPresenter();
                    aTableModel = new MedioEnvioTableModel(medios);
                    buscarEntPresenter.setClase(MedioEnvio.class);
                    buscarEntPresenter.setResultado(medios);
                    buscarEntPresenter.setHabilitado(false);
                    buscarEntPresenter.setModel(aTableModel);
                    buscarEntPresenter.mostrar();   
                    aMedio = (MedioEnvio) buscarEntPresenter.getEntidad();                     
                }                    
            }  
            if(aMedio!=null){                
                vista.getTxtCodTransporte().setText(aMedio.getId().toString());
                vista.getTxtRazonSocial().setText(aMedio.getRazonSocial());
                vista.getTxtNroFactura().requestFocus();
            }else{              
                vista.notificarMensaje("El Transporte/comisionista no se há encontrado o a cancelado la busqueda" ,JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
        class BuscarEnvioHandler  implements ChangeListener{

        @Override
        public void stateChanged(ChangeEvent e) {         
            
            Integer codigoCli = Integer.valueOf(vista.getTxtCodCliente().getText().trim());
            
            JMuestraEnviosViewer dialog = new JMuestraEnviosViewer(new javax.swing.JFrame(), true, codigoCli,"NC");
            
            if (dialog.getFind()){
                aEnvio = dialog.showDialog();
                if (aEnvio!=null){
                    List<LineaEnvio> lineas = aEnvio.getLineaEnvioList();
                    SimpleDateFormat formatea = new SimpleDateFormat("dd/MM/yyyy");  
                    for (Iterator<LineaEnvio> it = lineas.iterator(); it.hasNext();) {
                            LineaEnvio lineaEnvio = it.next();
                            posLinea++;
                            vista.getTxtFecha().setText(formatea.format(aEnvio.getFechaCreacion()));
                            
                            if(aEnvio.getFechaSalida()!=null){
                                vista.getTxtFechaDesp().setText(formatea.format(aEnvio.getFechaSalida()));
                                vista.getTxtFechaDesp().setEnabled(true);
                            }else{
                                vista.getTxtFechaDesp().setEnabled(false);
                            }    
                            vista.getTxtCodTransporte().setText(String.valueOf(aEnvio.getIdmedio().getId()));
                            vista.getTxtRazonSocial().setText(aEnvio.getIdmedio().getRazonSocial());     
                            vista.getTxtNroFactura().setText(lineaEnvio.getNroFactura());
                            vista.getTxtCantBultos().setText( String.valueOf(lineaEnvio.getCantBultos())); 
                            vista.getTxtFecha().requestFocus(); 
                            break;
                                        }
                }else{
                    vista.getTxtCodCliente().setText("");
                    vista.getTxtRazonSocialCli().setText("");
                    vista.getTxtFecha().setText("");
                    vista.getTxtFechaDesp().setText("");
                    vista.getTxtRazonSocial().setText("");
                    vista.getTxtCodCliente().setText("");
                    vista.getTxtNroFactura().setText("");        
                    vista.getTxtCantBultos().setText("");                    
                    vista.getTxtCodCliente().requestFocus(); 
                }
            }else{
                vista.notificarMensaje("No se encontraron envíos para el cliente",JOptionPane.ERROR_MESSAGE);
                vista.getTxtCodCliente().setText("");
                vista.getTxtRazonSocialCli().setText("");
                vista.getTxtRazonSocial().setText("");
                vista.getTxtCodCliente().setText("");
                vista.getTxtNroFactura().setText("");        
                vista.getTxtCantBultos().setText("");
            } 
        }
    }
    public class ClienteChangeHandler  implements ChangeListener{
        @Override
        public void stateChanged(ChangeEvent ce) {     
            vista.getTxtCodTransporte().setText("");
            vista.getTxtRazonSocial().setText("");
            vista.getTxtFecha().setText("");
            vista.getTxtFechaDesp().setText("");
            vista.getTxtNroFactura().setText("");
            vista.getTxtCantBultos().setText("");
            
            aEnvio= null;
            aMedio= null;
            aCliente= null;       
            lineasDeEnvioMap = null;
            
            aEnvio = new Envio();
            lineasDeEnvioMap = new ArrayList();
            
            
            boolean esNumero = true;
            Integer codigoC  ;
            List<Cliente> clientes = null;
            JBuscarEntidadPresenter buscarEntPresenter;
            ClienteTableModel aTableModel;
            
            String codigo = vista.getTxtCodCliente().getText();
                        
            for (int i=0;i<codigo.length();i++){
                if (!Character.isDigit(codigo.charAt(i))){
                    esNumero=false;
                }
            }
            
            if(esNumero){
                codigoC = Integer.valueOf(codigo);
                try {
                    aCliente = GestionEnvioServicios.buscarClientePorCodigo(codigoC,false);
                } catch (Exception ex) {
                    notificarException (ex);
                }
            }else{
                try {
                    clientes = GestionEnvioServicios.buscarClientesPorRazonSocial(codigo,false);
                } catch (Exception ex) {
                    notificarException (ex);
                }
                if(clientes.size()== 1){
                   aCliente = clientes.get(0);                   
                }else{
                    buscarEntPresenter = new JBuscarEntidadPresenter();
                    aTableModel = new ClienteTableModel(clientes);
                    buscarEntPresenter.setClase(Cliente.class);
                    buscarEntPresenter.setResultado(clientes);
                    buscarEntPresenter.setHabilitado(false);
                    buscarEntPresenter.setModel(aTableModel);
                    buscarEntPresenter.mostrar();   
                    aCliente = (Cliente) buscarEntPresenter.getEntidad();  
                }                    
            } 
            if(aCliente!= null){
                vista.getTxtCodCliente().setText(aCliente.getNroCliente().toString().trim());
                vista.getTxtRazonSocialCli().setText(aCliente.getRazonSocial().trim());
                vista.getCmdBuscarEnvio().requestFocus();
            }else{                
                vista.notificarMensaje("No se encontro el Cliente o a cancelado la busqueda" ,JOptionPane.INFORMATION_MESSAGE);
            }    
        }
    }

   public class CancelarHandler  implements ChangeListener{

        @Override
        public void stateChanged(ChangeEvent ce) {
            aEnvio= null;
            aMedio= null;
            aCliente= null;       
            lineasDeEnvioMap = null;
            
            aEnvio = new Envio();
            lineasDeEnvioMap = new ArrayList();
        }
       
   }
   public class GuardarHandler implements ChangeListener{

        @Override
        public void stateChanged(ChangeEvent ce) {
            boolean resultado=true;
            Date fechaCrea= null;
            Date fechaDesp= null;
           
           if(existeNumeroFactura(vista.getTxtNroFactura().getText().trim(), aEnvio.getIdenvio())){
                return;
            }
                     
            SimpleDateFormat formatea = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
            try {
                if(vista.getTxtFechaDesp().getText().trim().length()!=0){
                    fechaDesp = formatea.parse(vista.getTxtFechaDesp().getText().trim());
                    aEnvio.setFechaSalida(fechaDesp);
                }else{
                    if(aEnvio.getFechaSalida()!=null){
                        if (vista.preguntar("Esta borrando el despacho del envío. Esta seguro?", JOptionPane.YES_NO_OPTION)==0) {
                            aEnvio.setFechaSalida(null);
                        }else{
                            return;
                        }
                    }
                }
                
                fechaCrea = formatea.parse(vista.getTxtFecha().getText().trim());
                aEnvio.setFechaCreacion(fechaCrea); 
                
            }catch(Exception ev){
                 vista.notificarMensaje(ev.getMessage(),JOptionPane.ERROR_MESSAGE);
                 return;
            }
            
            Map item = new HashMap();
            item.put("CLI", aCliente);
            item.put("FAC", vista.getTxtNroFactura().getText().trim());
            item.put("BUL", vista.getTxtCantBultos().getText().trim());
                        
            lineasDeEnvioMap.add(item);

            if(aMedio==null){
                aMedio = aEnvio.getIdmedio();
            }
            aEnvio.setIdmedio(aMedio);
            aEnvio.getLineaEnvioList().clear();
 
            for (Iterator it = lineasDeEnvioMap.iterator(); it.hasNext();) {
                Map aItem = (Map) it.next();                
                aEnvio.agregarLinea(aItem);
            }        
            
            try {
                GestionEnvioServicios.guardarEnvioModif(aEnvio);
            } catch (Exception ex) {
                notificarException (ex);
            }
            reinciciarTransaccion();
            vista.notificarEnvio(resultado);
        }    
    }
   
   public class BorrarHandler implements ChangeListener{

        @Override
        public void stateChanged(ChangeEvent ce) {
            boolean resultado=true;
                     
            aEnvio.se; 
                
            
            Map item = new HashMap();
            item.put("CLI", aCliente);
            item.put("FAC", vista.getTxtNroFactura().getText().trim());
            item.put("BUL", vista.getTxtCantBultos().getText().trim());
                        
            lineasDeEnvioMap.add(item);

            if(aMedio==null){
                aMedio = aEnvio.getIdmedio();
            }
            aEnvio.setIdmedio(aMedio);
            aEnvio.getLineaEnvioList().clear();
 
            for (Iterator it = lineasDeEnvioMap.iterator(); it.hasNext();) {
                Map aItem = (Map) it.next();                
                aEnvio.agregarLinea(aItem);
            }        
            
            try {
                GestionEnvioServicios.guardarEnvioModif(aEnvio);
            } catch (Exception ex) {
                notificarException (ex);
            }
            reinciciarTransaccion();
            vista.notificarEnvio(resultado);
        }    
    }
   
   private void notificarException(Exception ex){
       vista.notificarException(ex);
   }
   
   public boolean existeNumeroFactura(String nroFactura, Integer nroEnvio){
        boolean resultado = false;
        Envio aEnvioLoc=null;
        Parametro aParam = GestionEnvioServicios.getParametro("VALFAC");
        boolean permite =Boolean.parseBoolean(aParam.getDetalle().get(0).getValor());
        try{        
            aEnvioLoc = GestionEnvioServicios.buscarEnvioPorFactura(nroFactura);
        }catch(ConectividadException ex){
            notificarException (ex);
        }        
        if(aEnvioLoc != null && !permite && aEnvioLoc.getIdenvio().intValue()!=nroEnvio.intValue())          {
            for (Iterator it = aEnvioLoc.getLineaEnvioList().iterator(); it.hasNext();) {
                LineaEnvio linea = (LineaEnvio) it.next();
                if(linea.getNroFactura().equals(vista.getTxtNroFactura().getText().trim())){
                    vista.notificarMensaje("El número de factura ya fue registrado en envío nro: " + linea.getCodigoDeBarra()  ,JOptionPane.ERROR_MESSAGE);
                    resultado=true;
                    break;
                }
            }
        }
        return resultado;
    } 
    private void reinciciarTransaccion(){
        this.getCancelarHandler().stateChanged(new ChangeEvent(this));
    }
}


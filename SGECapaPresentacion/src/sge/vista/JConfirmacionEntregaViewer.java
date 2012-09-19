/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JConfirmacionEntregaViewer.java
 *
 * Created on 02/06/2012, 20:47:38
 */
package sge.vista;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.*;
import javax.swing.event.ChangeEvent;

/**
 *
 * @author Propietario
 */
public class JConfirmacionEntregaViewer extends javax.swing.JInternalFrame {
    private JConfirmacionEntregaPresenter presenter;
    private boolean resultadoEnvio = false;
    
    /** Creates new form JConfirmacionEntregaViewer */
    public JConfirmacionEntregaViewer() {
       
        initComponents();
        
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();  
        Dimension ventana = this.getSize();  
        this.setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);  
        
        presenter= new JConfirmacionEntregaPresenter(this);
        presenter.getCargarMotivos().stateChanged(new ChangeEvent(this));

        this.txtCodCliente.requestFocus();
        this.cmbMotivo.setEnabled(false);
        this.txtCantDevuelta.setEnabled(false);
        this.txtObservaciones.setEnabled(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCodCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtRazonSocialCli = new javax.swing.JTextField();
        cmdBuscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblFecha = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRazonSocial = new javax.swing.JTextField();
        txtFechaViaje = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFechaEntrega = new javax.swing.JTextField();
        txtNroFactura = new javax.swing.JTextField();
        txtCantBultos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNroGuia = new javax.swing.JTextField();
        cmdCancelar = new javax.swing.JButton();
        cmdEnviar = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmbMotivo = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtCantDevuelta = new javax.swing.JTextField();
        chkConDevoluciones = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        txtObservaciones = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setName("CONENV"); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Búsqueda de envío"));

        txtCodCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodClienteActionPerformed(evt);
            }
        });

        jLabel7.setText("Cliente:");

        txtRazonSocialCli.setBackground(new java.awt.Color(255, 255, 204));
        txtRazonSocialCli.setEditable(false);

        cmdBuscar.setText("Buscar Envíos");
        cmdBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRazonSocialCli, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cmdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRazonSocialCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmdBuscar))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Envío"));

        lblFecha.setText("Fecha:");

        jLabel3.setText("Transporte:");

        txtRazonSocial.setEditable(false);

        txtFechaViaje.setEditable(false);
        txtFechaViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaViajeActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha entrega:");

        txtNroFactura.setEditable(false);

        txtCantBultos.setEditable(false);

        jLabel8.setText("Factura:");

        jLabel9.setText("Cant. bultos:");

        jLabel10.setText("Nro. de guía:");

        txtNroGuia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroGuiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3)
                            .addComponent(lblFecha)
                            .addComponent(jLabel10))
                        .addGap(80, 80, 80)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRazonSocial)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNroGuia, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantBultos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(235, 235, 235))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFecha)
                    .addComponent(txtFechaViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtNroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantBultos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtNroGuia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        cmdCancelar.setText("Cancelar");
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });

        cmdEnviar.setText("Confirmar");
        cmdEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEnviarActionPerformed(evt);
            }
        });

        cmdSalir.setText("Salir");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Devoluciones"));

        jLabel2.setText("Motivo:");

        jLabel5.setText("Cant. devuelta:");

        txtCantDevuelta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantDevueltaKeyTyped(evt);
            }
        });

        chkConDevoluciones.setText("¿Linea con devoluciones?         ");
        chkConDevoluciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        chkConDevoluciones.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkConDevoluciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkConDevolucionesActionPerformed(evt);
            }
        });

        jLabel11.setText("Observaciones:");

        txtObservaciones.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkConDevoluciones, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtCantDevuelta, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(35, 35, 35)
                                .addComponent(cmbMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtObservaciones))))
                .addGap(45, 45, 45))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkConDevoluciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(cmbMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCantDevuelta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cmdCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(cmdEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(cmdSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdSalir)
                    .addComponent(cmdCancelar)
                    .addComponent(cmdEnviar))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkConDevolucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkConDevolucionesActionPerformed
        // TODO add your handling code here:
        if(this.chkConDevoluciones.isSelected()){
            this.cmbMotivo.setEnabled(true);
            this.txtCantDevuelta.setEnabled(true);
            this.txtObservaciones.setEnabled(true);
        }else{
            this.cmbMotivo.setEnabled(false);
            this.txtCantDevuelta.setEnabled(false);
            this.txtCantDevuelta.setText("");
            this.txtObservaciones.setText("");
        }
    
    }//GEN-LAST:event_chkConDevolucionesActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cmdSalirActionPerformed

    private void cmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarActionPerformed
        // TODO add your handling code here:
        this.txtCodCliente.setText("");
        this.txtFechaViaje.setText("");
        this.txtFechaEntrega.setText("");
        this.txtRazonSocial.setText("");
        this.txtCodCliente.setText("");
        this.txtNroFactura.setText("");        
        this.txtCantBultos.setText("");
        this.chkConDevoluciones.setSelected(false);
        this.txtCantDevuelta.setText("");        
        this.cmbMotivo.setEnabled(false);   
        this.txtObservaciones.setText("");        
        presenter.getCancelarEnvioHandler().stateChanged(new ChangeEvent(this));
        this.txtCodCliente.requestFocus();
    }//GEN-LAST:event_cmdCancelarActionPerformed

    private void cmdEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEnviarActionPerformed
        // TODO add your handling code here:
        int cantDev = 0;
        if(this.txtRazonSocial.getText().trim().length()==0){
            notificarMensaje("No há realizado ninguna búsqueda",JOptionPane.ERROR_MESSAGE);
            return;
        }
        int cantBultos = Integer.parseInt(this.txtCantBultos.getText());
        Date fecha= validarFecha(txtFechaEntrega.getText().trim());
        Date fechaViaje= validarFecha(txtFechaViaje.getText().trim());
        if(fecha==null){
            notificarMensaje("La fecha ingresada no es válida",JOptionPane.ERROR_MESSAGE);
            this.txtFechaEntrega.requestFocus();
            return;
        }
        if(fecha.before(fechaViaje)){
            notificarMensaje("La fecha de entrega no puede ser previa a la fecha del Envío",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(this.txtNroGuia.getText().trim().length()==0){
            notificarMensaje("Debe informar el nro. de guia",JOptionPane.ERROR_MESSAGE);
            this.txtNroGuia.requestFocus();
            return;
        }
        
        if(this.chkConDevoluciones.isSelected()){
            cantDev = Integer.parseInt(this.txtCantDevuelta.getText());
            if(cantDev<= 0){
                notificarMensaje("No há informado la cantidad de bultos en devolución",JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(cantBultos< cantDev){
                notificarMensaje("La cantidad de bultos en devolución supera la cantidad enviada",JOptionPane.ERROR_MESSAGE);
                return;
            }           
        }
        
        presenter.getRegistrarConfirmacionHandler().stateChanged(new ChangeEvent(this));
        if(!resultadoEnvio){
            return;
        }
        this.txtCodCliente.setText("");
        this.txtRazonSocialCli.setText("");
        this.txtFechaViaje.setText("");
        this.txtFechaEntrega.setText("");
        this.txtRazonSocial.setText("");
        this.txtCodCliente.setText("");
        this.txtNroFactura.setText("");        
        this.txtCantBultos.setText("");
        this.txtNroGuia.setText("");
        this.chkConDevoluciones.setSelected(false);
        this.txtCantDevuelta.setText("");      
        this.txtObservaciones.setText("");
        this.cmbMotivo.setEnabled(false);   
        this.txtCodCliente.requestFocus();        
    }//GEN-LAST:event_cmdEnviarActionPerformed

    private void txtCantDevueltaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantDevueltaKeyTyped
        // TODO add your handling code here:
        
      char caracter = evt.getKeyChar();
      // Verificar si la tecla pulsada no es un digito
      if( !Character.isDigit(caracter)){      
         evt.consume();  // ignorar el evento de teclado
      }
        
    }//GEN-LAST:event_txtCantDevueltaKeyTyped

    private void txtNroGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroGuiaActionPerformed
    
    }
        // TODO add your handling code here:         if (this.txtNroGuia.getText().trim().length() == 0) {             return;         }         if (this.tblEnvio.getSelectedRow() > -1) {             presenter.getSetNumeroGuiaHandler().stateChanged(new ChangeEvent(this));             this.txtNroGuia.setText("");             if (this.tblEnvio.getRowCount() == 1) {                 this.cmdEnviar.requestFocus();             } else {                 int fila = this.tblEnvio.getSelectedRow();                 if (fila < this.tblEnvio.getRowCount() - 1) {                     fila++;                     tblEnvio.changeSelection(fila, 1, false, false);                     this.txtNroGuia.requestFocus();                 } else {                     this.cmdEnviar.requestFocus();                 }              }         }     }//GEN-LAST:event_txtNroGuiaActionPerformed

    private void txtCodClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodClienteActionPerformed
            if(this.txtCodCliente.getText().trim().length()>0){
                this.getTxtRazonSocialCli().setText("");
                presenter.getClienteHandler().stateChanged(new ChangeEvent(this));
            }    

    }//GEN-LAST:event_txtCodClienteActionPerformed

    private void cmdBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarActionPerformed
            
            if(this.txtCodCliente.getText().trim().length()> 0){
                presenter.getBuscarEnvioHandler().stateChanged(new ChangeEvent(this));
                if(this.txtFechaViaje.getText().trim().length()>0){
                    this.txtCodCliente.setText("");
                    this.txtRazonSocialCli.setText("");
                    this.txtFechaEntrega.requestFocus();
                }
            } 
    }//GEN-LAST:event_cmdBuscarActionPerformed

    private void txtFechaViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaViajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaViajeActionPerformed


    public JTextField getTxtObservaciones() {
        return txtObservaciones;
    }

    public JTextField getTxtNroFactura() {
        return txtNroFactura;
    }

    public JTextField getTxtRazonSocialCliente() {
        return txtCodCliente;
    }

    public JTextField getTxtCantBultos() {
        return txtCantBultos;
    }

    public JTextField getTxtFechaEntrega() {
        return txtFechaEntrega;
    }

    public JCheckBox getChkConDevoluciones() {
        return chkConDevoluciones;
    }

    public JComboBox getCmbMotivo() {
        return cmbMotivo;
    }

    public JTextField getTxtCantDevuelta() {
        return txtCantDevuelta;
    }

    public JTextField getTxtFechaViaje() {
        return txtFechaViaje;
    }

    public JTextField getTxtNroGuia() {
        return txtNroGuia;
    }

    public JTextField getTxtRazonSocial() {
        return txtRazonSocial;
    }

    public JTextField getTxtCodCliente() {
        return txtCodCliente;
    }

    public void setTxtCodCliente(JTextField txtCodCliente) {
        this.txtCodCliente = txtCodCliente;
    }

    public JTextField getTxtRazonSocialCli() {
        return txtRazonSocialCli;
    }

    public void setTxtRazonSocialCli(JTextField txtRazonSocialCli) {
        this.txtRazonSocialCli = txtRazonSocialCli;
    }

    public JButton getCmdBuscar() {
        return cmdBuscar;
    }

    public void setCmdBuscar(JButton cmdBuscar) {
        this.cmdBuscar = cmdBuscar;
    }

    public void setTxtFechaEntrega(JTextField txtFechaEntrega) {
        this.txtFechaEntrega = txtFechaEntrega;
    }

    public void setTxtFechaViaje(JTextField txtFechaViaje) {
        this.txtFechaViaje = txtFechaViaje;
    }

    void notificarException(Exception ex) {
      Icon Icon = null;
      JOptionPane.showMessageDialog(this, ex.toString(), "Envios", JOptionPane.ERROR_MESSAGE,   Icon);  
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkConDevoluciones;
    private javax.swing.JComboBox cmbMotivo;
    private javax.swing.JButton cmdBuscar;
    private javax.swing.JButton cmdCancelar;
    private javax.swing.JButton cmdEnviar;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JTextField txtCantBultos;
    private javax.swing.JTextField txtCantDevuelta;
    private javax.swing.JTextField txtCodCliente;
    private javax.swing.JTextField txtFechaEntrega;
    private javax.swing.JTextField txtFechaViaje;
    private javax.swing.JTextField txtNroFactura;
    private javax.swing.JTextField txtNroGuia;
    private javax.swing.JTextField txtObservaciones;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtRazonSocialCli;
    // End of variables declaration//GEN-END:variables

    void notificarMensaje(String mensaje, int tipoMensaje) {
         Icon Icon = null;
        JOptionPane.showMessageDialog(this,mensaje, "Envios", tipoMensaje,   Icon);  
    }

    private Date validarFecha(String pFecha) {
        Date fecha = null;
        SimpleDateFormat formatea = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        
        
        
        if (pFecha.trim().length() != formatea.toPattern().length()){            
            return null;
        } 
        
        formatea.setLenient(false);

        try {
            fecha = formatea.parse(pFecha.trim());           
            
        }catch(Exception e){
            return null;
        }
        
        return fecha;
    }

    void setResultado(boolean b) {
        this.resultadoEnvio= b;
    }
}

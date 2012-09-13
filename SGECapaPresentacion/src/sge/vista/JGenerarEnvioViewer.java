/*  
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JGenerarEnvioViewer.java
 *
 * Created on 26/05/2012, 20:11:17
 */
package sge.vista;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;

/**
 *
 * @author Propietario
 */
public class JGenerarEnvioViewer extends javax.swing.JInternalFrame {
    private  JGenerarEnvioPresenter presenter= null;
    private boolean multiplesLineas;
    /** Creates new form JGenerarEnvioViewer */
    public JGenerarEnvioViewer() {
        initComponents();
        
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();  
        //obtenemos el tamaño de la ventana  
        Dimension ventana = this.getSize();  
        //para cntrar la ventana lo hacemos con el siguiente calculo  
        this.setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);  
        
        
        presenter= new JGenerarEnvioPresenter(this);
        this.jTable1.setModel(new LineaEnvioTableModel());
        //String fecha = GregorianCalendar.getInstance().get(GregorianCalendar.DATE)+ "/" + GregorianCalendar.getInstance().get(GregorianCalendar.MONTH)  + "/" + GregorianCalendar.getInstance().get(GregorianCalendar.YEAR);
        SimpleDateFormat formatea = new SimpleDateFormat("dd/MM/yyyy");
        this.txtFecha.setText(formatea.format(GregorianCalendar.getInstance().getTime()));
        
        this.getTxtCodTransporte().requestFocus();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCodCliente = new javax.swing.JTextField();
        txtRazonSocialCli = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNroFactura = new javax.swing.JTextField();
        txtCantBultos = new javax.swing.JTextField();
        cmdAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtRazonSocial = new javax.swing.JTextField();
        txtCodTransporte = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmdCancelar = new javax.swing.JButton();
        cmdEnviar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Generar envíos");
        setName("GENENV"); // NOI18N

        panelPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Cliente:");

        txtCodCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodClienteActionPerformed(evt);
            }
        });

        txtRazonSocialCli.setBackground(new java.awt.Color(255, 255, 204));
        txtRazonSocialCli.setEditable(false);

        jLabel3.setText("Nro. Factura:");

        jLabel4.setText("Cant. bultos:");

        txtNroFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroFacturaActionPerformed(evt);
            }
        });
        txtNroFactura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNroFacturaKeyTyped(evt);
            }
        });

        txtCantBultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantBultosActionPerformed(evt);
            }
        });

        cmdAgregar.setText("Agregar");
        cmdAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAgregarActionPerformed(evt);
            }
        });
        cmdAgregar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmdAgregarKeyTyped(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Pos", "Cliente", "Nro. Factura", "Cant. bultos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(20);
        jScrollPane1.setViewportView(jTable1);

        txtRazonSocial.setBackground(new java.awt.Color(255, 255, 204));
        txtRazonSocial.setEditable(false);

        txtCodTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodTransporteActionPerformed(evt);
            }
        });

        txtFecha.setMaximumSize(new java.awt.Dimension(10, 10));
        txtFecha.setMinimumSize(new java.awt.Dimension(10, 10));
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        txtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaKeyTyped(evt);
            }
        });

        lblFecha.setText("Fecha:");

        jLabel1.setText("Transporte:");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFecha)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(10, 10, 10)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodTransporte, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(txtCodCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(txtCantBultos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNroFactura))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmdAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRazonSocialCli, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRazonSocial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtRazonSocialCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantBultos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cmdAgregar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cmdCancelar.setText("Cancelar");
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });

        cmdEnviar.setText("Enviar");
        cmdEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEnviarActionPerformed(evt);
            }
        });
        cmdEnviar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmdEnviarKeyTyped(evt);
            }
        });

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(cmdCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(cmdEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmdCancelar)
                        .addComponent(cmdEnviar))
                    .addComponent(jButton3))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyTyped
        char caracter = evt.getKeyChar();

        if(txtFecha.getText().trim().length() > 9 ){
            evt.consume();  // ignorar el evento de teclado
            this.txtCodTransporte.requestFocus();
        }

    }
        
        // TODO add your handling code here:         char caracter = evt.getKeyChar();          if (txtFecha.getText().length() > 9) {             evt.consume();  // ignorar el evento de teclado             this.txtCodTransporte.requestFocus();         }     }//GEN-LAST:event_txtFechaKeyTyped

        private void txtCodTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodTransporteActionPerformed
            if(this.txtCodTransporte.getText().trim().length()>0){
                this.getTxtRazonSocial().setText("");
                presenter.getHandler().stateChanged(new ChangeEvent(this));
            }
        
        }    
        // TODO add your handling code here:         this.txtRazonSocial.setText("");         presenter.getHandler().stateChanged(new ChangeEvent(this));     }//GEN-LAST:event_txtCodTransporteActionPerformed

        private void txtCodClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodClienteActionPerformed
            if(this.txtCodCliente.getText().trim().length()>0){
                this.getTxtRazonSocialCli().setText("");
                presenter.getClienteHandler().stateChanged(new ChangeEvent(this));
            }    
        }    
        // TODO add your handling code here:         this.txtRazonSocialCli.setText("");         presenter.getClienteHandler().stateChanged(new ChangeEvent(this));     }//GEN-LAST:event_txtCodClienteActionPerformed

        private void txtNroFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroFacturaActionPerformed
            if(this.txtNroFactura.getText().trim().length()>0){
                this.getTxtCantBultos().requestFocus();
            }
            
        }    
        // TODO add your handling code here:         this.txtCantBultos.requestFocus();     }//GEN-LAST:event_txtNroFacturaActionPerformed

        private void txtNroFacturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNroFacturaKeyTyped
            if(txtNroFactura.getText().length() > 12 ){
                evt.consume();  // ignorar el evento de teclado
                this.txtCantBultos.requestFocus();
            }
        }    
        // TODO add your handling code here:         if (txtNroFactura.getText().length() > 12) {             evt.consume();  // ignorar el evento de teclado             this.txtCantBultos.requestFocus();         }     }//GEN-LAST:event_txtNroFacturaKeyTyped

        private void txtCantBultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantBultosActionPerformed
            this.cmdAgregar.requestFocus();
        }    
        // TODO add your handling code here:         this.cmdAgregar.requestFocus();     }//GEN-LAST:event_txtCantBultosActionPerformed

        private void cmdAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAgregarActionPerformed
            Icon Icon = null;
            if(this.jTable1.getModel().getRowCount()>0 && !this.multiplesLineas){
                JOptionPane.showMessageDialog(this, "No se permiten multiples lineas para el envío", "Envios", JOptionPane.ERROR_MESSAGE,   Icon);
                this.cmdEnviar.requestFocus();
                return;
            }
            
            if(this.getTxtCodCliente().getText().trim().length()==0){
                JOptionPane.showMessageDialog(this, "Debe seleccionar un cliente", "Envios", JOptionPane.ERROR_MESSAGE,   Icon);
                this.getTxtCodCliente().requestFocus();
                return;
            }
            if(this.getTxtNroFactura().getText().trim().length()==0 ){
                JOptionPane.showMessageDialog(this, "Debe informar el n° de factura", "Envios", JOptionPane.ERROR_MESSAGE,   Icon);
                this.getTxtNroFactura().requestFocus();
                return;
            }
            if(this.getTxtCantBultos().getText().trim().length()==0){
                JOptionPane.showMessageDialog(this, "Debe informar la cantidad de bultos", "Envios", JOptionPane.ERROR_MESSAGE,   Icon);
                this.getTxtCantBultos().requestFocus();
                return;
            }
            if(Integer.parseInt(this.getTxtCantBultos().getText())<=0){
                JOptionPane.showMessageDialog(this, "La cantidad ingresada debe ser mayor que cero", "Envios", JOptionPane.ERROR_MESSAGE,   Icon);
                this.getTxtCantBultos().requestFocus();
                return;
            }
            presenter.getAgregarHandler().stateChanged(new ChangeEvent(this));
            
            int rows = this.jTable1.getModel().getRowCount();
            if(rows ==0){
                return;
            }
            this.getTxtCodCliente().setText("");
            this.getTxtRazonSocialCli().setText("");
            this.getTxtNroFactura().setText("");
            this.getTxtCantBultos().setText("");
            if(!this.multiplesLineas){
                this.cmdEnviar.requestFocus();
            }else{
                this.getTxtCodCliente().requestFocus();
            }    
        }    
        // TODO add your handling code here:         presenter.getAgregarHandler().stateChanged(new ChangeEvent(this));         this.txtCodCliente.setText("");         this.txtRazonSocialCli.setText("");         this.txtNroFactura.setText("");         this.txtCantBultos.setText("");         this.txtCodCliente.requestFocus();     }//GEN-LAST:event_cmdAgregarActionPerformed

        private void cmdAgregarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmdAgregarKeyTyped
            java.awt.event.ActionEvent evt2 = null;
            this.cmdAgregarActionPerformed(evt2);

        }    
        // TODO add your handling code here:         java.awt.event.ActionEvent evt2 = null;         this.cmdAgregarActionPerformed(evt2);     }//GEN-LAST:event_cmdAgregarKeyTyped

        private void cmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarActionPerformed
            presenter.getCancelarHandler().stateChanged(new ChangeEvent(this));
            this.getTxtCodTransporte().setText("");
            this.txtRazonSocial.setText("");
            this.txtCodCliente.setText("");
            this.txtRazonSocialCli.setText("");
            this.txtNroFactura.setText("");
            this.txtCantBultos.setText("");
            LineaEnvioTableModel aModel= (LineaEnvioTableModel) this.getjTable1().getModel();
            aModel.limpiar();
            this.getjTable1().addNotify();
            this.txtCodTransporte.requestFocus();
        }    
        // TODO add your handling code here:         presenter.getCancelarHandler().stateChanged(new ChangeEvent(this));         this.getTxtCodTransporte().setText("");         this.getTxtRazonSocial().setText("");         this.getTxtCodCliente().setText("");         this.getTxtRazonSocialCli().setText("");         this.getTxtNroFactura().setText("");         this.getTxtCantBultos().setText("");         LineaEnvioTableModel aModel = (LineaEnvioTableModel) this.getjTable1().getModel();         aModel.limpiar();         this.getjTable1().addNotify();     }//GEN-LAST:event_cmdCancelarActionPerformed

        private void cmdEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEnviarActionPerformed
            Icon Icon = null;
            
            if(this.txtRazonSocial.getText().trim().length()==0){
                JOptionPane.showMessageDialog(this, "No há seleccionado el transporte/coomisionista, por favor hagalo", "Envios", JOptionPane.ERROR_MESSAGE,   Icon); 
                this.txtCodTransporte.requestFocus();
                return;
            }
            int rows = this.jTable1.getModel().getRowCount();
            if(rows ==0){
                JOptionPane.showMessageDialog(this, "El envío debe tener al menos una fila", "Envios", JOptionPane.ERROR_MESSAGE,   Icon); 
                return;
            }
      
            presenter.getEnviarHandler().stateChanged(new ChangeEvent(this));
            
        }    
        // TODO add your handling code here:         presenter.getEnviarHandler().stateChanged(new ChangeEvent(this));     }//GEN-LAST:event_cmdEnviarActionPerformed

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            this.dispose();
        }    
        // TODO add your handling code here:         System.exit(0);     }//GEN-LAST:event_jButton3ActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
        this.txtCodTransporte.requestFocus();
    }//GEN-LAST:event_txtFechaActionPerformed

    private void cmdEnviarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmdEnviarKeyTyped
        // TODO add your handling code here:
        java.awt.event.ActionEvent evt2 = null;
        this.cmdEnviarActionPerformed(evt2);

    }//GEN-LAST:event_cmdEnviarKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAgregar;
    private javax.swing.JButton cmdCancelar;
    private javax.swing.JButton cmdEnviar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextField txtCantBultos;
    private javax.swing.JTextField txtCodCliente;
    private javax.swing.JTextField txtCodTransporte;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNroFactura;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtRazonSocialCli;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the jTable1
     */
    public javax.swing.JTable getjTable1() {
        return jTable1;
    }

    /**
     * @return the txtCantBultos
     */
    public javax.swing.JTextField getTxtCantBultos() {
        return txtCantBultos;
    }

    /**
     * @return the txtCodCliente
     */
    public javax.swing.JTextField getTxtCodCliente() {
        return txtCodCliente;
    }

    /**
     * @return the txtCodTransporte
     */
    public javax.swing.JTextField getTxtCodTransporte() {
        return txtCodTransporte;
    }

    /**
     * @return the txtFecha
     */
    public javax.swing.JTextField getTxtFecha() {
        return txtFecha;
    }

    /**
     * @return the txtNroFactura
     */
    public javax.swing.JTextField getTxtNroFactura() {
        return txtNroFactura;
    }

    /**
     * @return the txtRazonSocial
     */
    public javax.swing.JTextField getTxtRazonSocial() {
        return txtRazonSocial;
    }

    /**
     * @return the txtRazonSocialCli
     */
    public javax.swing.JTextField getTxtRazonSocialCli() {
        return txtRazonSocialCli;
    }
    
    void notificarEnvio(boolean resultado) {
        if(resultado){
            Icon Icon = null;
            JOptionPane.showMessageDialog(this, "Envio generado exitosamente", "Envios", JOptionPane.INFORMATION_MESSAGE,   Icon);
            this.getTxtCodTransporte().setText("");
            this.getTxtRazonSocial().setText("");
            this.getTxtCodCliente().setText("");
            this.getTxtRazonSocialCli().setText("");
            this.getTxtNroFactura().setText("");
            this.getTxtCantBultos().setText("");
            LineaEnvioTableModel aModel= (LineaEnvioTableModel) this.getjTable1().getModel();
            aModel.limpiar();
            this.getjTable1().addNotify();         
            this.getTxtCodTransporte().requestFocus();
            
        }
    }

    void notificarException(Exception ex) {
      Icon Icon = null;
      JOptionPane.showMessageDialog(this, ex.toString(), "Envios", JOptionPane.ERROR_MESSAGE,   Icon);  
    }

    /**
     * @return the multiplesLineas
     */
    public boolean isMultiplesLineas() {
        return multiplesLineas;
    }

    /**
     * @param multiplesLineas the multiplesLineas to set
     */
    public void setMultiplesLineas(boolean multiplesLineas) {
        this.multiplesLineas = multiplesLineas;
    }

    void notificarMensaje(String mensaje, int tipoMensaje) {
        Icon Icon = null;
        JOptionPane.showMessageDialog(this, mensaje, "Envios", tipoMensaje,   Icon); 
    }
    
}
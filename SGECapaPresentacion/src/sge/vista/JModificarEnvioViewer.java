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
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;

/**
 *
 * @author Propietario
 */
public class JModificarEnvioViewer extends javax.swing.JInternalFrame {
    private  JModificarEnvioPresenter presenter= null;
    private boolean multiplesLineas;
    /** Creates new form JGenerarEnvioViewer */
    public JModificarEnvioViewer() {
        initComponents();
        
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();  
        //obtenemos el tamaño de la ventana  
        Dimension ventana = this.getSize();  
        //para cntrar la ventana lo hacemos con el siguiente calculo  
        this.setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);  
        
        presenter = new JModificarEnvioPresenter(this);
        
        this.getTxtFecha().requestFocus();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNroFactura = new javax.swing.JTextField();
        txtCantBultos = new javax.swing.JTextField();
        txtRazonSocial = new javax.swing.JTextField();
        txtCodTransporte = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtFechaDesp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmdCancelar = new javax.swing.JButton();
        cmdModificar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtCodCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtRazonSocialCli = new javax.swing.JTextField();
        cmdBuscarEnvio = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Modificar Envío");
        setName("GENENV"); // NOI18N

        panelPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        lblFecha.setText("Fecha Creación:");

        jLabel1.setText("Transporte:");

        txtFechaDesp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaDespActionPerformed(evt);
            }
        });

        jLabel2.setText("Fecha Despacho:");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFecha)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCantBultos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFechaDesp, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCodTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(145, 145, 145)
                            .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaDesp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantBultos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        cmdCancelar.setText("Cancelar");
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });

        cmdModificar.setText("Modificar");
        cmdModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdModificarActionPerformed(evt);
            }
        });
        cmdModificar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmdModificarKeyTyped(evt);
            }
        });

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Búsqueda de envío"));

        txtCodCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodClienteActionPerformed(evt);
            }
        });

        jLabel8.setText("Cliente:");

        txtRazonSocialCli.setBackground(new java.awt.Color(255, 255, 204));
        txtRazonSocialCli.setEditable(false);

        cmdBuscarEnvio.setText("Buscar Envíos");
        cmdBuscarEnvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarEnvioActionPerformed(evt);
            }
        });
        cmdBuscarEnvio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmdBuscarEnvioKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(32, 32, 32)
                        .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtRazonSocialCli))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cmdBuscarEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRazonSocialCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmdBuscarEnvio)
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cmdCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdCancelar)
                    .addComponent(cmdModificar)
                    .addComponent(jButton3))
                .addContainerGap(27, Short.MAX_VALUE))
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
            
        }    
        // TODO add your handling code here:         this.cmdAgregar.requestFocus();     }//GEN-LAST:event_txtCantBultosActionPerformed

        private void cmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarActionPerformed
            presenter.getCancelarHandler().stateChanged(new ChangeEvent(this));
            this.getTxtCodTransporte().setText("");
            this.txtRazonSocial.setText("");
            this.txtCodCliente.setText("");
            this.txtRazonSocialCli.setText("");
            this.txtNroFactura.setText("");
            this.txtCantBultos.setText("");
            this.txtFecha.requestFocus();
        }    
        // TODO add your handling code here:         presenter.getCancelarHandler().stateChanged(new ChangeEvent(this));         this.getTxtCodTransporte().setText("");         this.getTxtRazonSocial().setText("");         this.getTxtCodCliente().setText("");         this.getTxtRazonSocialCli().setText("");         this.getTxtNroFactura().setText("");         this.getTxtCantBultos().setText("");         LineaEnvioTableModel aModel = (LineaEnvioTableModel) this.getjTable1().getModel();         aModel.limpiar();         this.getjTable1().addNotify();     }//GEN-LAST:event_cmdCancelarActionPerformed

        private void cmdModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdModificarActionPerformed
            Icon Icon = null;   

            Date fechaCrea= validarFecha(this.txtFecha.getText().trim());
            
            if(fechaCrea==null){
                JOptionPane.showMessageDialog(this, "Fecha de Creación inválida", "Envios", JOptionPane.ERROR_MESSAGE,   Icon); 
                this.txtFecha.requestFocus();
                return;
            }
            
            if(fechaCrea.after(GregorianCalendar.getInstance().getTime())){
                JOptionPane.showMessageDialog(this, "Fecha de Creación en el futuro", "Envios", JOptionPane.ERROR_MESSAGE,   Icon); 
                this.txtFecha.requestFocus();
                return;
            }    
            if (this.txtFechaDesp.getText().trim().length() != 0){
         
                Date fechaDesp= validarFecha(this.txtFechaDesp.getText().trim());
                if(fechaDesp==null){
                    JOptionPane.showMessageDialog(this, "Fecha de Despacho inválida", "Envios", JOptionPane.ERROR_MESSAGE,   Icon); 
                    this.txtFecha.requestFocus();
                    return;
                } 

                if(fechaDesp.before(fechaCrea)){
                    JOptionPane.showMessageDialog(this, "Fecha de Despacho menor a fecha de Creación", "Envios", JOptionPane.ERROR_MESSAGE,   Icon); 
                    this.txtFechaDesp.requestFocus();
                    return;
                }
                
                if(fechaDesp.after(GregorianCalendar.getInstance().getTime())){
                    JOptionPane.showMessageDialog(this, "Fecha de Despacho en el futuro", "Envios", JOptionPane.ERROR_MESSAGE,   Icon); 
                    this.txtFechaDesp.requestFocus();
                    return;
                }  
            }
            
            if(this.txtRazonSocial.getText().trim().length()==0){
                JOptionPane.showMessageDialog(this, "Seleccione el transportista/comisionista", "Envios", JOptionPane.ERROR_MESSAGE,   Icon); 
                this.txtCodTransporte.requestFocus();
                return;
            }
            
            if(this.txtCantBultos.getText().trim().length()==0){
                JOptionPane.showMessageDialog(this, "Ingrese la cantidad de bultos", "Envios", JOptionPane.ERROR_MESSAGE,   Icon); 
                this.txtCantBultos.requestFocus();
                return;
            }
 
            if(this.txtNroFactura.getText().trim().length()==0){
                JOptionPane.showMessageDialog(this, "Ingrese el Nro. de Factura", "Envios", JOptionPane.ERROR_MESSAGE,   Icon); 
                this.txtNroFactura.requestFocus();
                return;
            }
            
            presenter.getGuardarHandler().stateChanged(new ChangeEvent(this));
            
        }    
        // TODO add your handling code here:         presenter.getEnviarHandler().stateChanged(new ChangeEvent(this));     }//GEN-LAST:event_cmdModificarActionPerformed

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            this.dispose();
        }    
        // TODO add your handling code here:         System.exit(0);     }//GEN-LAST:event_jButton3ActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
        this.txtFechaDesp.requestFocus();
    }//GEN-LAST:event_txtFechaActionPerformed

    private void cmdModificarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmdModificarKeyTyped
        // TODO add your handling code here:
        java.awt.event.ActionEvent evt2 = null;
        this.cmdModificarActionPerformed(evt2);

    }//GEN-LAST:event_cmdModificarKeyTyped

    private void txtCodClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodClienteActionPerformed
        if (this.txtCodCliente.getText().trim().length() > 0) {
            this.getTxtRazonSocialCli().setText("");
            presenter.getClienteHandler().stateChanged(new ChangeEvent(this));
        }
    }//GEN-LAST:event_txtCodClienteActionPerformed

    private void cmdBuscarEnvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarEnvioActionPerformed

        if (this.txtCodCliente.getText().trim().length() > 0) {
            presenter.getBuscarEnvioHandler().stateChanged(new ChangeEvent(this));
        }
    }//GEN-LAST:event_cmdBuscarEnvioActionPerformed

    private void txtFechaDespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaDespActionPerformed
        // TODO add your handling code here:
        this.txtCodTransporte.requestFocus();
    }//GEN-LAST:event_txtFechaDespActionPerformed

    private void cmdBuscarEnvioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmdBuscarEnvioKeyTyped
        // TODO add your handling code here:
        java.awt.event.ActionEvent evt2 = null;
        this.cmdBuscarEnvioActionPerformed(evt2);
    }//GEN-LAST:event_cmdBuscarEnvioKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBuscarEnvio;
    private javax.swing.JButton cmdCancelar;
    private javax.swing.JButton cmdModificar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextField txtCantBultos;
    private javax.swing.JTextField txtCodCliente;
    private javax.swing.JTextField txtCodTransporte;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFechaDesp;
    private javax.swing.JTextField txtNroFactura;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtRazonSocialCli;
    // End of variables declaration//GEN-END:variables

    public JButton getCmdBuscarEnvio() {
        return cmdBuscarEnvio;
    }

    public void setCmdBuscarEnvio(JButton cmdBuscarEnvio) {
        this.cmdBuscarEnvio = cmdBuscarEnvio;
    }

    
    public JTextField getTxtFechaDesp() {
        return txtFechaDesp;
    }

    public void setTxtFechaDesp(JTextField txtFechaDesp) {
        this.txtFechaDesp = txtFechaDesp;
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
            JOptionPane.showMessageDialog(this, "Envio modificado exitosamente", "Envios", JOptionPane.INFORMATION_MESSAGE,   Icon);
            this.getTxtCodTransporte().setText("");
            this.getTxtRazonSocial().setText("");
            this.getTxtNroFactura().setText("");
            this.getTxtCantBultos().setText("");
            this.getTxtFecha().setText("");
            this.getTxtFechaDesp().setText("");
            this.getTxtCodCliente().requestFocus();
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
        JOptionPane.showMessageDialog(this, mensaje, "Envios", tipoMensaje, Icon); 
    }
    
    int preguntar(String mensaje, int tipoMensaje) {
        Icon Icon = null;
        return JOptionPane. showConfirmDialog(this, mensaje, "Envios", tipoMensaje, JOptionPane.WARNING_MESSAGE, Icon);
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
}

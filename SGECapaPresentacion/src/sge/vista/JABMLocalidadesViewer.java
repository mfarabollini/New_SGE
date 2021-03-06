/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sge.vista;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;

/**
 *
 * @author Marcos
 */
public class JABMLocalidadesViewer extends javax.swing.JInternalFrame {

    /**
     * Creates new form JABMTransporteViewer
     */        
        
    private JABMLocalidadesPresenter presenter;
    private Integer modo; 
    
    public JABMLocalidadesViewer(int modo) {
        this.modo = modo;
        initComponents();
        if (modo == 1) {
            this.setTitle("Alta Localidad");
            btnGuardar.setText("Guardar"); 
        }else if (modo == 3) {
            this.setTitle("Baja Localidad");
            txtDscLocalidad.setVisible(false);
            lblLocText.setVisible(false);
            btnGuardar.setText("Borrar"); 
        }
        
        //Redimensiona la ventana
        pack();
        
        
        presenter = new JABMLocalidadesPresenter(this);  
        presenter.getProvinciaHandler().stateChanged(new ChangeEvent(this));
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();  
        //obtenemos el tamaño de la ventana  
        Dimension ventana = this.getSize();  
        //para cntrar la ventana lo hacemos con el siguiente calculo  
        this.setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);  
    }

    public JComboBox getCboProvincia() {
        return cboProvincia;
    }

    public void setCboProvincia(JComboBox cboProvincia) {
        this.cboProvincia = cboProvincia;
    }

    public JTextField getTxtCodPostal() {
        return txtCodPostal;
    }

    public void setTxtCodPostal(JTextField txtCodPostal) {
        this.txtCodPostal = txtCodPostal;
    }

    public JTextField getTxtDscLocalidad() {
        return txtDscLocalidad;
    }

    public void setTxtDscLocalidad(JTextField txtDscLocalidad) {
        this.txtDscLocalidad = txtDscLocalidad;
    }

    public Integer getModo() {
        return modo;
    }

    public void setModo(Integer modo) {
        this.modo = modo;
    }

    public JComboBox getCboLocalidad() {
        return cboLocalidad;
    }

    public void setCboLocalidad(JComboBox cboLocalidad) {
        this.cboLocalidad = cboLocalidad;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox();
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtCodPostal = new javax.swing.JTextField();
        lblCodPostal = new javax.swing.JLabel();
        lblCuit = new javax.swing.JLabel();
        txtDscLocalidad = new javax.swing.JTextField();
        cboProvincia = new javax.swing.JComboBox();
        lblLocText = new javax.swing.JLabel();
        cboLocalidad = new javax.swing.JComboBox();
        lblLocText1 = new javax.swing.JLabel();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setClosable(true);
        setIconifiable(true);
        setName("ABMTRA"); // NOI18N

        btnSalir.setText("Salir");
        btnSalir.setName("btn"); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.setName("btn"); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setMaximumSize(new java.awt.Dimension(398, 140));
        jPanel1.setMinimumSize(new java.awt.Dimension(398, 140));

        txtCodPostal.setName("txtCodPostal"); // NOI18N
        txtCodPostal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodPostalKeyTyped(evt);
            }
        });

        lblCodPostal.setText("Código Postal:");

        lblCuit.setText("Provincia:");

        txtDscLocalidad.setName("txtRazonSocial"); // NOI18N

        cboProvincia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboProvinciaItemStateChanged(evt);
            }
        });

        lblLocText.setText("Localidad:");

        cboLocalidad.setSelectedItem("Seleccione la Localidad...");
        cboLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLocalidadActionPerformed(evt);
            }
        });

        lblLocText1.setText("Localidad:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblCuit)
                        .addGap(18, 18, 18)
                        .addComponent(cboProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCodPostal)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblLocText)
                                    .addComponent(lblLocText1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDscLocalidad)
                                    .addComponent(cboLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCuit)
                    .addComponent(cboProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLocText1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocText)
                    .addComponent(txtDscLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodPostal)
                    .addComponent(txtCodPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnSalir))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
}//GEN-LAST:event_btnSalirActionPerformed

private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
            Icon Icon = null;
            boolean continuar = true;

            if (modo == 1){
                if(this.getTxtDscLocalidad().getText().trim().length()==0){
                    JOptionPane.showMessageDialog(this, "Debe ingresar el Nombre de la Localidad", "Alta Localidad", JOptionPane.ERROR_MESSAGE,   Icon);
                    continuar=false;
                    this.getTxtDscLocalidad().requestFocus();
                }
                if(this.getTxtCodPostal().getText().trim().length()==0 && continuar){
                    JOptionPane.showMessageDialog(this, "Debe informar el Código Postal", "Alta Localidad", JOptionPane.ERROR_MESSAGE,   Icon);
                    continuar=false;
                    this.getTxtCodPostal().requestFocus();
                }
                if(this.getCboProvincia().getSelectedIndex() ==-1 && continuar){
                    JOptionPane.showMessageDialog(this, "Debe ingresar la Provincia", "Alta Localidad", JOptionPane.ERROR_MESSAGE,   Icon);
                    continuar=false;
                    this.getCboProvincia().requestFocus();
                }                       
            }
            if(continuar){
                presenter.getGuardarLocalidad().stateChanged(new ChangeEvent(this));
            }
        
}//GEN-LAST:event_btnGuardarActionPerformed

    private void txtCodPostalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodPostalKeyTyped
        // TODO add your handling code here:
        if(txtCodPostal.getText().trim().length() > 3 ){
            evt.consume();  // ignorar el evento de teclado
            this.btnGuardar.requestFocus();
        }
    }//GEN-LAST:event_txtCodPostalKeyTyped

    private void cboProvinciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboProvinciaItemStateChanged
        // TODO add your handling code here:
        presenter.getLocalidadHandler().stateChanged(new ChangeEvent(this));        
    }//GEN-LAST:event_cboProvinciaItemStateChanged

    private void cboLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLocalidadActionPerformed
        // TODO add your handling code here:
        presenter.getLocCodPostalHandler().stateChanged(new ChangeEvent(this));
    }//GEN-LAST:event_cboLocalidadActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cboLocalidad;
    private javax.swing.JComboBox cboProvincia;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCodPostal;
    private javax.swing.JLabel lblCuit;
    private javax.swing.JLabel lblLocText;
    private javax.swing.JLabel lblLocText1;
    private javax.swing.JTextField txtCodPostal;
    private javax.swing.JTextField txtDscLocalidad;
    // End of variables declaration//GEN-END:variables
    void notificar(boolean resultado) {
       
        Icon Icon = null;
        if(resultado){
            JOptionPane.showMessageDialog(this, "Operación realizada con exito", "Localidad", JOptionPane.INFORMATION_MESSAGE,   Icon);  
        }
    }
    
    void notificarException(Exception ex) {
      Icon Icon = null;
      JOptionPane.showMessageDialog(this, ex.toString(), "Localidad", JOptionPane.ERROR_MESSAGE,   Icon);  
    }
    void notificarMensaje(String mensaje, int tipoMensaje) {
        Icon Icon = null;
        JOptionPane.showMessageDialog(this,mensaje, "Localidad", tipoMensaje,   Icon);  
        
    }
}
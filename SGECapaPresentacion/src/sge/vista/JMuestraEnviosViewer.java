/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sge.vista;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ChangeEvent;
import sge.entidades.Envio;

/**
 *
 * @author Marcos
 */
public class JMuestraEnviosViewer extends javax.swing.JDialog {

    /**
     * Creates new form JMuestraEnviosViewer
     */
    private JMuestraEnviosPresenter presenter;
    private Integer codCliente;
    private Boolean find;
    private String tipo;

    public Envio showDialog(){
        this.setVisible(true);
        return presenter.getEnvio();
    }
    
        public JMuestraEnviosViewer(java.awt.Frame parent, boolean modal, Integer codCliente, String tipo) {
        super(parent, modal);
        initComponents();
        
        this.setLocationRelativeTo(this);
        String[] cabeceras ={"envio", "linea","Fecha envio", "Fecha Despacho", "Transp./Comic.","Nro. factura","Bultos","Código"};
        boolean[] editables ={false,false,false,false,false,false,false,false};
        
        this.codCliente = codCliente;
        this.tipo = tipo;
        GenericoTableModel aTableModel = new GenericoTableModel();
        aTableModel.setCabeceras(cabeceras);
        aTableModel.setEditables(editables);
        this.tblEnvios.setModel(aTableModel);  
        this.tblEnvios.getColumnModel().getColumn(0).setMaxWidth(0);
        this.tblEnvios.getColumnModel().getColumn(0).setMinWidth(0);
        this.tblEnvios.getColumnModel().getColumn(0).setPreferredWidth(0);        
        this.tblEnvios.getColumnModel().getColumn(1).setMaxWidth(0);
        this.tblEnvios.getColumnModel().getColumn(1).setMinWidth(0);
        this.tblEnvios.getColumnModel().getColumn(1).setPreferredWidth(0);

        this.presenter = new JMuestraEnviosPresenter(this);     
        presenter.getBuscarEnvioHandler().stateChanged(new ChangeEvent(this));
        
        this.tblEnvios.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseReleased(MouseEvent e){
                if(e.getClickCount()==2){                   
                    presenter.getSelecEnvioHandler().stateChanged(new ChangeEvent(this));
                }
            }
        });
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getFind() {
        return find;
    }

    public void setFind(Boolean find) {
        this.find = find;
    }

    public JTable getTblEnvios() {
        return tblEnvios;
    }

    public void setTblEnvios(JTable tblEnvios) {
        this.tblEnvios = tblEnvios;
    }

    public Integer getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblEnvios = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblEnvios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblEnvios);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancelar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JMuestraEnviosViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JMuestraEnviosViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JMuestraEnviosViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JMuestraEnviosViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEnvios;
    // End of variables declaration//GEN-END:variables

    void notificarMensaje(String mensaje, int tipoMensaje) {
         Icon Icon = null;
         JOptionPane.showMessageDialog(this,mensaje, "Envios", tipoMensaje,   Icon);  
    }
}

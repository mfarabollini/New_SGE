/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sge.vista;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.tree.TreePath;

/**
 *
 * @author mboni
 */
public class JLanzadorReporteViewer extends javax.swing.JInternalFrame {
    private JLanzadorReportePresenter presenter;
    /**
     * Creates new form JLanzadorReporteViewer
     */
    public JLanzadorReporteViewer() {
        String[] cabeceras ={"Parametro", "Valor","Buscar","Clase","EsEntidad","Obligatorio","Metodo"};
        boolean[] editables ={false,true,true,false,false,false,false};
        
        initComponents();
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();  
        //obtenemos el tamaño de la ventana  
        Dimension ventana = this.getSize();  
        //para cntrar la ventana lo hacemos con el siguiente calculo  
        this.setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);  
        this.presenter = new JLanzadorReportePresenter(this);
        
        GenericoTableModel aTableModel = new GenericoTableModel();
        aTableModel.setCabeceras(cabeceras);
        aTableModel.setEditables(editables);
      
        this.tblParametros.setModel(aTableModel);  
        this.tblParametros.getColumn("Buscar").setCellRenderer( new ButtonCellRenderer());
        this.tblParametros.getColumn("Buscar").setCellEditor( new ButtonCellEditor(presenter));
        
        
        this.tblParametros.getColumnModel().getColumn(3).setMaxWidth(0);
        this.tblParametros.getColumnModel().getColumn(3).setMinWidth(0);
        this.tblParametros.getColumnModel().getColumn(3).setPreferredWidth(0);        
        this.tblParametros.getColumnModel().getColumn(4).setMaxWidth(0);
        this.tblParametros.getColumnModel().getColumn(4).setMinWidth(0);
        this.tblParametros.getColumnModel().getColumn(4).setPreferredWidth(0);
        this.tblParametros.getColumnModel().getColumn(5).setMaxWidth(0);
        this.tblParametros.getColumnModel().getColumn(5).setMinWidth(0);
        this.tblParametros.getColumnModel().getColumn(5).setPreferredWidth(0);
        this.tblParametros.getColumnModel().getColumn(6).setMinWidth(0);
        this.tblParametros.getColumnModel().getColumn(6).setPreferredWidth(0);
        
        
        
        this.presenter.getBuscarMetatdataChangeHandler().stateChanged(new ChangeEvent(this));
    }

    public JTable getTblParametros() {
        return tblParametros;
    }

    public JTree getTreeReportes() {
        return treeReportes;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        treeReportes = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblParametros = new javax.swing.JTable();
        cmdCancelar = new javax.swing.JButton();
        cmdAceptar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setName("LANREP"); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        treeReportes.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        treeReportes.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                treeReportesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(treeReportes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblParametros.setModel(new javax.swing.table.DefaultTableModel(
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
        tblParametros.setRowHeight(20);
        jScrollPane2.setViewportView(tblParametros);

        cmdCancelar.setText("Cancelar");
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });

        cmdAceptar.setText("Aceptar");
        cmdAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(cmdCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(cmdAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdCancelar)
                    .addComponent(cmdAceptar))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void treeReportesValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_treeReportesValueChanged
        // TODO add your handling code here:
        GenericoTableModel aModel= (GenericoTableModel) this.tblParametros.getModel();
        aModel.limpiar();   
        this.tblParametros.addNotify(); 
        Object nodo = treeReportes.getLastSelectedPathComponent();    
        if(treeReportes.getModel().isLeaf(nodo)){
            this.presenter.getReporteSeleccionadoHandler().stateChanged(new ChangeEvent(this));
        }
        
    }//GEN-LAST:event_treeReportesValueChanged

    private void cmdAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAceptarActionPerformed
        // TODO add your handling code here:
        Cursor hourglassCursor= null;
        Object nodo = treeReportes.getLastSelectedPathComponent();    
        if(nodo==null){
            notificarMensaje("Debe seleccionar un reporte",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(treeReportes.getModel().isLeaf(nodo)){
            //hourglassCursor = new Cursor(Cursor.WAIT_CURSOR);
            //setCursor(hourglassCursor);
            this.presenter.getLanzarReporteHandler().stateChanged(new ChangeEvent(this));
            //hourglassCursor = new Cursor(Cursor.DEFAULT_CURSOR);
            //setCursor(hourglassCursor);
        }else{
            notificarMensaje("Debe seleccionar un reporte",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmdAceptarActionPerformed

    private void cmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarActionPerformed
        // TODO add your handling code here:
        GenericoTableModel aModel= (GenericoTableModel) this.tblParametros.getModel();
        aModel.limpiar();   
        this.tblParametros.addNotify();
        this.treeReportes.setSelectionRow(0);
        //this.treeReportes.collapseRow(1);
        
        this.presenter.getCancelarReporteHandler().stateChanged(new ChangeEvent(this));
        
    }//GEN-LAST:event_cmdCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAceptar;
    private javax.swing.JButton cmdCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblParametros;
    private javax.swing.JTree treeReportes;
    // End of variables declaration//GEN-END:variables

    void notificarMensaje(String mensaje, int tipoMensaje) {
        Icon Icon = null;
        JOptionPane.showMessageDialog(this,mensaje, "Envios", tipoMensaje,   Icon);  
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sge.vista;

/**
 *
 * @author mboni
 */
import java.awt.Component;
 
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.TableCellRenderer;
 
public class ButtonCellRenderer extends JButton implements TableCellRenderer {
    public ButtonCellRenderer(){
        setOpaque(true);
    }
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
        int row, int column) { 
    if (isSelected) {
      setForeground(table.getSelectionForeground());
      setBackground(table.getSelectionBackground());
    } else {
      setForeground(table.getForeground());
      setBackground(UIManager.getColor("Button.background"));
    }
    setText((value == null) ? "" : "Buscar");
    return this;
    } 
}
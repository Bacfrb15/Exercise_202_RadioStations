/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex006;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author franz
 */
public class SenderTableModel extends AbstractTableModel{

    private ArrayList<Sender> sender = new ArrayList<>();
    private String[] COLNAMES = {"Sender","Frequenz","Band"};
    
    @Override
    public int getRowCount() {
        return sender.size();
    }

    @Override
    public int getColumnCount() {
        return COLNAMES.length;
    }

    @Override
    public String getColumnName(int column) {
        return COLNAMES[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Sender s = sender.get(rowIndex);
        switch(columnIndex)
        {
            case 0: return s.getSender();
            case 1: return s.getFrequenz();
            case 2: return s.getBand();
            default: return "???";
        }
    }

    void add(Sender s) {
        sender.add(s);
        fireTableRowsInserted(sender.size()-1, sender.size()-1);
    }
    
}

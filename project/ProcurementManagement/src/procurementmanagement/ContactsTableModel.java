/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procurementmanagement;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Samyan
 */
public class ContactsTableModel extends AbstractTableModel {

    private List<Employee> li = new ArrayList();
    private String[] columnNames = { "Name", "Email", "CellNo", "Dob", "Add","Delete"};

    public ContactsTableModel(List<Employee> list){
         this.li = list;
    }

    
   
    
    @Override
    public String getColumnName(int columnIndex){
         return columnNames[columnIndex];
    }
    
  

    @Override     
    public int getRowCount() {
        return li.size();
    }

    @Override        
    public int getColumnCount() {
        return columnNames.length; 
    }

    
    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Employee si = li.get(rowIndex);
        switch (columnIndex) {
            case 0: 
                return si.getName();
            case 1:
                return si.getEmail();
            case 2:
                return si.getcellNo();
            case 3:
                return si.getDob();
            case 4:
                return "Add";
            case 5:
                
                 
                        return "Delete";
            
           }
           return null;
   }

   @Override
   public Class<?> getColumnClass(int columnIndex){
       System.out.println("column index = " + columnIndex);
          switch (columnIndex){
             case 0:
               return String.class;
             case 1:
               return String.class;
             case 2:
               return String.class;
             case 3:
               return Date.class;
             case 4: 
               return String.class;
                case 5: 
               return String.class;
             }
             return null;
      }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
      
        return columnIndex == 4 || columnIndex==5;
    }
   
    
    public void addRow(int row){
     String Employee = (String)getValueAt(row, 2);
     AddEmployeePanel p = new AddEmployeePanel(employee, "Add");
     LoginForm.getInstance().goToPage(p);
     for(int i=0; i<list.size(); i++ )
     rowData[0]=list.get(i).name;
     rowData[1]=list.get(i).cellNo;
     rowData[2]=list.get(i).email;
     ConatctsTableModel.addRow(rowData);
    }
     
                
    }
    
    
    
      
    public void deleteRow(int row){
     String Employee = (String)getValueAt(row, 2);
     AddEmployeePanel p = new AddEmployeePanel(contact,  "Delete");
     LoginForm.getInstance().goToPage(p);
                
    }
    
    
   
 }
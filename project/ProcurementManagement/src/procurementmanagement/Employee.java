/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procurementmanagement;
/**
 *
 * @author hp
 */

import java.util.Date;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.jfr.events.FileReadEvent;


public class Employee {
    
    private String name;
    private String email;
    private String cellNo;
    private Date dob;
    
    
    //getters  setters
    
    // setter for name
     public void setName(String name) {
        this.name = name;
    }
     
    
     //getter setter for email
      public void setEmail(String email) {
        this.email = email;
    }
      
      
      // setter for cellNo
       public void setCellNo(String cellNo) {
        this.cellNo = cellNo;
    }
       
       
       
       //setter for dob
       public void setDob(Date dob) {
        this.dob = dob;
    }
       
       
       //getter for name
        public String getName() {
        return name;
    }
        
        //getter for email
         public String getEmail() {
         return email;
    }
         
         
         //getter for cellNo
          public String getcellNo() {
          return cellNo;
    }
          
          //getter for dob
           public Date getDob() {
           return dob;
    }
           
           
           
         /**
          * list of employee class
          */  
       private List<Employee> emp; 
     
        public Employee(){
        emp = new ArrayList<Employee>();
    }

           
    /**
     * here is to save the employee data in file 
     */
     public void saveData(String employeesFile)
    {
        try {
            FileWriter fw = new FileWriter(employeesFile);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("name,email,cellNo,dob\n");
            
            
      for(int i = 0 ; i < emp.size();i++)
    {
                bw.write(emp.get(i).getName() + ", "+
                        emp.get(i).getcellNo() + ","+
                        emp.get(i).getEmail()+","+
                        emp.get(i).getDob()+"\n" );
    }
               
            bw.flush();
            bw.close();
            fw.close();
            }
        
        
        catch (Exception ex)
        {
            Logger.getLogger(Accessories.class.getName()).log(Level.SEVERE, null, ex);
        }
               
    }
}
        



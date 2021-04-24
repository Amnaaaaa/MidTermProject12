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
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.jfr.events.FileReadEvent;
import java.util.ArrayList;
import java.util.List;

public class Receipt {
    
    private String name;
    private String email;
    private String cellNo;
    private String accessoriesIssued;
    private String signature;
   
    
    /**setter for name
     * 
     * @param name 
     */
    
     public void setName(String name) {
        this.name = name;
    }
     
    
     /**setter for email
      * 
      * @param email 
      */
      public void setEmail(String email) {
        this.email = email;
    }
      
      
      /** setter for cellNo
       * 
       * @param cellNo 
       */
       public void setCellNo(String cellNo) {
        this.cellNo = cellNo;
    }
    
       /**setter for accessories issued
        * 
        * @param accessoriesIssued 
        */
       public void setAccessoriesIssued(String accessoriesIssued){
           this.accessoriesIssued = accessoriesIssued;
       }
       
       /**setter for signature
        * 
        * @param signature 
        */
       public void setSignature(String signature){
           this.signature = signature;
           
       }
       
       
        /**getter for name
       @return name
       */
        public String getName() {
        return name;
    }
        
        /**getter for email
        @return email
        */
         public String getEmail() {
         return email;
    }
         
         
         /**getter for cellNo
         @return cellNo
         */
          public String getcellNo() {
          return cellNo;
    }
          
          /**getter for AccessoriesIssued
          @return accessoriesIssued
          */
          public String getAccessoriesIssued(){
              return accessoriesIssued;
          }
          
          /**getter for signature
          @return signature
          */
          public String getSignature(){
              return signature;
          }
          
       //constructor
       /**
        * This is a default constructor 
        */
        private List<Receipt> rec; 
    
    
        public Receipt(){
        rec = new ArrayList<Receipt>();
   
        
        }
        
        /**
         * here is to save receipt in a file
         */
        
        
        public void saveData(String accessoriesFile)
    {
        try {
            FileWriter fw = new FileWriter(accessoriesFile);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("name,email,cellNo,accessoriesIssued,signature\n");
            
            
      for(int i = 0 ; i < rec.size();i++)
    {
                bw.write(rec.get(i).getName() + ", "+
                        rec.get(i).getEmail() + ","+
                        rec.get(i).getcellNo()+","+
                        rec.get(i).getAccessoriesIssued()+","+
                          rec.get(i).getSignature()+","+ "\n" );
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

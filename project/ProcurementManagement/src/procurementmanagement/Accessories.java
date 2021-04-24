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


public class Accessories {
    
    
    private String laptopCount;
    private String stickyNotesCount;
    private String pensCount;
    private String highLightersCount;
    private String filesCount;
    private String noteBooksCount;
    
    /**
     * getter and setter for accessories count
     */
    
    //setter for laptop
    
    public void setLaptopCount(String laptopCount){
        
        this.laptopCount=laptopCount;
    }
    
    //setter for stickynotes
    
    public void setStickynoteCount(String stickyNotesCount){
        this.stickyNotesCount=stickyNotesCount;
    }
    
    
    //setter for filesCount
    public void setFilesCount(String filesCount){
        this.filesCount=filesCount;
    }
    
    
   // setter for highlighters
    
    public void setHighLightersCount(String highLightersCount){
        this.highLightersCount=highLightersCount;
    }
    
    //setter for  notebooks
    public void setNoteBooksCount(String noteBooksCount){
        this.noteBooksCount=noteBooksCount;
    }
        
    
    //setter for pens
    public void setPensCount(String pensCount){
        this.pensCount=pensCount;
    }
    
                                                //getters 
   //getter for laptopCount
    
    public String getLaptopCount(){
    
    return laptopCount;
    
    }
    
    //getter for stickyNotes
    public String getStickyNotesCount(){
        return stickyNotesCount;
    }
    
    //getter for filesCount
    public String getFilesCount(){
        return filesCount;
    }
    
    
    //getter for highLightersCount
    public String getHighlightersCount(){
        return highLightersCount;
    }
    
    //getter for notebooks count
    public String getNotebooksCount(){
        return noteBooksCount;
    }
    
    
    //getter for pens
    public String getPensCount(){
        return pensCount;
    }
    
    
    
    //it is used by objects to store their states
    //variables without static are object specific,known as instance variables
    private static Accessories instance;
    
    
    /**
     * here is the list of accessories
     */
    
    private List<Accessories> acc; 
    
    
    public Accessories(){
        acc = new ArrayList<Accessories>();
    }
    
    
    
     public static Accessories getIsntance(){
        if(instance==null)
        {
            instance = new Accessories();
        }
        
        return instance;
    }
    
    
    /**
     * here is the function save data which will save accessories in file
     * @param accessoriesFile 
     */
    
     public void saveData(String accessoriesFile)
    {
        try {
            FileWriter fw = new FileWriter(accessoriesFile);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("laptop,stickyNotes,pens,highLighters,files,noteBooks\n");
            
            
      for(int i = 0 ; i < acc.size();i++)
    {
                bw.write(acc.get(i).getLaptopCount() + ", "+
                        acc.get(i).getStickyNotesCount() + ","+
                        acc.get(i).getHighlightersCount()+","+
                        acc.get(i).getPensCount()+","+
                          acc.get(i).getFilesCount()+","+
                        acc.get(i).getNotebooksCount()+"\n" );
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

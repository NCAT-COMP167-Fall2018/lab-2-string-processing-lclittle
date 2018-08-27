/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringprocessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 *
 * @author lanyi
 */
public class StringProcessing {
   
    
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
                
        String[] records =new String[100];
        try {
            Scanner input = new Scanner(new File(args[0]));
            int currentIndex=0;
                        
            while(input.hasNext()){
                String[] inputData= input.nextLine().split(",");
                
                String firstName = inputData[0];
                String lastName = inputData[1];
                String gender = inputData[2];
                String age = inputData[3];
                String phoneNum = inputData[4];
                String email = inputData[5];
                
                records[currentIndex] = String.format("%-20s%-20s%-10s%-10s%-20s%-40s", inputData[0], inputData[1],inputData[2], inputData[3], inputData[4], inputData[5]);
                currentIndex++;
                
                
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Could not find the input file");
        }
        
        String firstName=" ";
        String lastName=" ";
        for (String record : records) { 
            if(!record.equals(firstName)){
            } else {
                System.out.println("Error!!");
            }
            
            if(record.equals(lastName)){
                System.out.println("Error!!");
            }
            
            System.out.println(record);
        }
        
    }
    
}

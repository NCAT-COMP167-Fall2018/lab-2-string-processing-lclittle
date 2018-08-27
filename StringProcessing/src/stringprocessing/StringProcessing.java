/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringprocessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                
                records[currentIndex] = String.format("%-20s%-20s%-10s%-10s%-20s%-20s", inputData[0], inputData[1],inputData[2], inputData[3], inputData[4], inputData[5]);
                currentIndex++;
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Could not find the input file");
        }
        
        for (String record : records) {
            System.out.println(record);
        }
        
    }
    
}

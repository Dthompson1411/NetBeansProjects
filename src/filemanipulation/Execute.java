/*
 * Author: David Thompson
 * Course: COP2551
 * Semester: Spring 2016
 * Project #:
 * Title:
 * Due Date:
 * 
 * Description:
 * 
 * 
 * 
 * 
 */
package filemanipulation;

 import java.util.Scanner;

/**
 *
 * @author davidthompson
 */
public class Execute
{
     public String FileName;
     public String Data;
     Scanner input = new Scanner(System.in);
     File myFile = new File(FileName, Data);
     
     public void Execute()
     {
          //prompt user for a file name
          System.out.printf("Please enter a File Name:\n");
          FileName = input.next();
          System.out.printf("The data stored in the Variable is %s", FileName);
          //Add the text extension to variable
          myFile.Name = FileName.concat(".txt");
          
          //Prompt for data Input
          System.out.printf("Please enter a series of Numbers separated by a comma.\n");
          Data = input.next();
          //Add data to class
          myFile.Data = Data;
          
          
    
          
     }
     
}

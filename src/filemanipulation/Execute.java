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
          System.out.printf("The data stored in the Variable is %s:\n", FileName);
          //Add the text extension to variable
          myFile.Name = FileName.concat(".txt");
          System.out.printf("The value stored in the Class is %s. \n", myFile.getName());
          
          //Prompt for data Input
          System.out.printf("Please enter a series of Numbers separated by a comma.\n");
          Data = input.next();
          System.out.printf("The data stored in the variable is %s. \n", Data);
          //Add data to class
          myFile.Data = Data;
          System.out.printf("The value stored in the class is %s. \n", myFile.getData());
          
          System.out.printf("Writing the data to the filename %s.\n", myFile.getName());
          
          //Writing Data to File
          WriteFile.Write(myFile);
          
          //Reading Data from file and Displaying it
          System.out.printf("Reading the file and printing it to the screen\n");
          
          //Reading file and displaying it on the screen
          ReadFile.Read(myFile);
          
    
          
     }
     
}

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

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static javax.script.ScriptEngine.FILENAME;

/**
 *
 * @author davidthompson
 */
public class ReadFile
{

//     public String FileToRead;
//     public String Data;
//
//     public ReadFile(String FileName, String Data)
//     {
//          FileName = FileToRead;
//          this.Data = Data;
//     }

     public static void Read(File myFile)
     {

          try (BufferedReader br = new BufferedReader(new FileReader(myFile.getName())))
          {

               String sCurrentLine = myFile.getData();

               while ((sCurrentLine = br.readLine()) != null)
               {
                    System.out.printf("The data Contained in %s is:\n%s\n.",myFile.getName(), sCurrentLine);
               }

          }
          catch (IOException e)
          {
               e.printStackTrace();
          }
     }
}

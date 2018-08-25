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

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author davidthompson
 */
public class WriteFile
{
//     //Class Variables
//     public String FileName;
//     public String Data;
//
//     //Constructor
//     public WriteFile(String FileName, String Data)
//     {
//          this.FileName = FileName;
//          this.Data = Data;
//     }

     public static void Write(File myFile)
     {
          BufferedWriter bw = null;
          FileWriter fw = null;

          try
          {

               String content = myFile.getData();

               fw = new FileWriter(myFile.getName());
               bw = new BufferedWriter(fw);
               bw.write(content);

               System.out.printf("Wrote %s to File Named %s.\n", myFile.getData(), myFile.getName());

          }
          catch (IOException e)
          {

               e.printStackTrace();

          }
          finally
          {

               try
               {

                    if (bw != null)
                    {
                         bw.close();
                    }

                    if (fw != null)
                    {
                         fw.close();
                    }

               }
               catch (IOException ex)
               {

                    ex.printStackTrace();

               }
          }
     }
}


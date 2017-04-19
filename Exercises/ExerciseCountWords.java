// Counts the number of words in Hamlet.

// 1. Import the libaries for the Scanner and the File Classes

import java.io.File;
import java.util.Scanner;

public class ExerciseCountWords 
{
   public static void main(String[] args) 
   {
      // 2. Create a new File object that contains the file hamlet.txt 
      File f = new File("hamlet.txt");

      // 3. Create a new Scanner object that reads from the file object
          // 3a. in order to do this you will need a try catch clause 

          try{
             Scanner scan = new Scanner(f);
             int count = 0;

              // 4. Loop through the text using a while loop and count all the words (Tokens)

              while(scan.hasNext() == true)
              {
                  scan.next();
                    count++;
              }
      
            // 5. print out the total amount of words in the file

            System.out.println(count);

          }
          catch(Exception e){
            // TODO : code
          }
         

      
     
      
   }
}

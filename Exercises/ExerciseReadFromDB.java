import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;


public class ExerciseReadFromDB
{

    public static void main(String[] args)
    {
        //1. Create a text file containing persons with a new person on each line
        // Name lastname age cpr 
        // put in at least 3 persons

        // 2. Read all persons from the file and write it to the console
        
        try{
            Scanner scan = new Scanner(new File("person.txt"));

            // while(scan.hasNextLine())
            // {
            //     // System.out.println(scan.nextLine());
            // }

        } catch (FileNotFoundException e)
        {

        }

        // 3. Read all persons from the file and write it to an Array or ArrayList

        try{
            Scanner scan = new Scanner(new File("person.txt"));

            ArrayList<Person> persons = new ArrayList<Person>();
 
            while(scan.hasNextLine())
            {
                persons.add(new Person(scan.next(), scan.next(), scan.nextInt(), scan.next()));   
            }

            for(int i = 0; i < persons.size(); i++)
            {
                System.out.println(persons.get(i).getName());
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        


    }

}

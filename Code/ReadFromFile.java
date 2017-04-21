import java.util.Scanner;
import java.io.File;

public class ReadFromFile
{
    public static void main(String[] args)
    {
        File f = new File("testtext.txt");

        try{
            Scanner scan = new Scanner(f);
            String x = scan.nextLine();
            System.out.println(x);
        }
        catch(Exception name)
        {
            System.out.println(name);
        }
        

        

    }
}

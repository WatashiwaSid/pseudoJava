import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling 
{
    public static void main(String args[])
    {

        //create object of File class to create new file
        File create = new File("writetome.txt");
        try
        {
            //createNewFile() method will create the new file
            create.createNewFile();
        }
        catch(IOException e)
        {
            System.out.println("Unable to create file.");

        }


        //writing to file
        try
        {
        //create object of FileWriter class
        FileWriter writer = new FileWriter("writetome.txt");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string you want to write : ");
        String userinput = null;
        userinput = sc.nextLine();

        //write to file with FileWriter object
        writer.write(userinput);

        //objects must be closed with close() method
        writer.close();
        sc.close();
        }
        catch(IOException e)
        {
            System.out.println("Unable to write to specified file");
        }


        
        //reading from file
        File reader = new File("writetome.txt");
        try
        {
        Scanner sc = new Scanner(reader);
        System.out.print("Content You Wrote To File : ");
        while(sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }
        sc.close();
        }
        catch(IOException e)
        {
            System.out.println("Could not read from specified file.");
        }

    }
    
}

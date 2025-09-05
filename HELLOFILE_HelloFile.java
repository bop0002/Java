
package oop;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HelloFile {


    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        BufferedReader reader = new BufferedReader(new FileReader("Hello.txt"));
        String line;
        while( (line = reader.readLine()) != null)
        {
            System.out.println(line);
        }
    }
    
}

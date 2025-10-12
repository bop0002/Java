package oop;




public class TestJson {


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

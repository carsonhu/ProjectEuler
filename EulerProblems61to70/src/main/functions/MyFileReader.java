package main.functions;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class MyFileReader {
    public ArrayList<String> readMyFile( String fileName) {
    	ArrayList<String> fileArray = new ArrayList<String>();

	// This will reference one line at a time
        String oneLine = null;
        try {
     // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);
     // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((oneLine = bufferedReader.readLine()) != null) {
                fileArray.add(oneLine);
            }
      // Always close files.
            bufferedReader.close();
  
        } catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" + 
                    fileName + "'");
            }
            catch(IOException ex) {
                System.out.println(
                    "Error reading file '" 
                    + fileName + "'");
                // Or we could just do this: 
                // ex.printStackTrace();
            }
        return fileArray;
        }
}
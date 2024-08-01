package FileHandlingInJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadData {

    public static void main(String[] args) {
        String filePath = "src\\FileHandlingInJava\\FileToRead.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String data;
            while ((data = reader.readLine()) != null) {
                System.out.println(data);
            }
        } catch (IOException ex) {
            System.err
                    .println(String.format("ex %s occured in file %s", ex.getMessage(), filePath));
        }
    }
}

//Tasks
//1.Create your own dynamic arrays 
//2.Understand how strings are immutable in java and various types of string (StringBuilder,StringBuffer)
//3.Solve Question Arrays and String
//4.Cyclic Sort 
//5.Async JS, 
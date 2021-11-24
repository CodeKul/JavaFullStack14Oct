package filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {

        //character stream
        try {
            FileWriter fileWriter
                    = new FileWriter("/home/vaibhav/workspace/FullStackJava14Oct/src/filehandling/fileWriter.txt");
            fileWriter.write("Today is Wednesday");
            System.out.println("File write Successfully...");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fileReader
                    = new FileReader("/home/vaibhav/workspace/FullStackJava14Oct/src/filehandling/fileWriter.txt");
            int i = fileReader.read();
            while (i > 0) {
                System.out.print((char) i);
                i = fileReader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

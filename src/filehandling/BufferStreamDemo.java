package filehandling;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BufferStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream
                    = new FileOutputStream("/home/vaibhav/workspace/FullStackJava14Oct/src/filehandling/bufferdemo.txt");

            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            String str = "Welcome";
            byte[] arr = str.getBytes(StandardCharsets.UTF_8);
            bufferedOutputStream.write(arr);
            System.out.println("File write successfully");

            bufferedOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            FileInputStream fileInputStream
                    =new FileInputStream("/home/vaibhav/workspace/FullStackJava14Oct/src/filehandling/bufferdemo.txt") ;

            BufferedInputStream bufferedInputStream =new BufferedInputStream(fileInputStream);
            int i = bufferedInputStream.read();
            while (i>0){
                System.out.print((char) i);
                i = bufferedInputStream.read();
            }

            bufferedInputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

package Binary_Text_IO;

import java.io.*;
import java.util.Scanner;

/**
 * Buffered streams are used to speed up input and output by reducing the number of disks read and write
 *Default Bufsize in a buffered stream is 512 bytes if the bufSize is not specified
 * buffered I/O can be used to buffer a file more than 100mb and more effective for big files.
 **/

public class BufferedInputs {
    void main(){
        try(PrintWriter output = new PrintWriter(new FileOutputStream("text.txt"))){
            output.printf("%s", "1234");
            output.printf("%s", "6256");

//            try(Scanner sc = new Scanner(new FilterInputStream("text.txt"))){
//
//            }
//
        } catch(IOException ex){
            System.out.println("file exceptions!");
        }
    }
}
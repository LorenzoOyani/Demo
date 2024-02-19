package Binary_Text_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Text data are read using the Scanner class and written using the PrintWriter class.
 * an input object reads a stream of data from a class
 * an output object writes a stream of data to a file.
 * they are called input and out put streams
 * Binary I/O, does not include encoding and decoding thus its more efficient than textI/O.
 * All files are stored in a binary format. Thus, all files are Binary files
 * filter inout streams and filter output streams
 * */

public class TextIO {
    void main() throws IOException {
        FileOutputStream output = new FileOutputStream("text.txt");
        for(int i = 0; i < 11; i++){
            output.write(i);
        }
        output.close();

        FileInputStream input = new FileInputStream("text.txt");
        int value;
        while((value = input.read()) != -1 ) {
            System.out.println(value + "");
        }
        input.close();
    }
}
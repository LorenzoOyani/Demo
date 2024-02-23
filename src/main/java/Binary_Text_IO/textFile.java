package Binary_Text_IO;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * (Create a text file) Write a program to create a file named Exercise17_01.txt if
 * it does not exist. Append new data to it if it already exists. Write 100 integers
 * created randomly into the file using text I/O. Integers are separated by a space.
 * */

public class textFile {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        ArrayList<String> list = new ArrayList<>();
        File file = new File("Exercise17_01");
        if(file.exists()) {
            try (Scanner sc = new Scanner(file)) {
                while (sc.hasNext()) {
                    list.add(sc.nextLine());
                }

                for(int i = 0; i < 100; i++){
                    list.add(STR."\{(int) (Math.random() * 100)} ");
                }
            }

            try(PrintWriter output = new PrintWriter(file)){
                for(String l : list){
                    output.print(l);
                }
            }



        }
    }
}
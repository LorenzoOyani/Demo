package Binary_Text_IO;

import java.io.*;
import java.util.Date;

/**
 * (Store objects and arrays in a file) Write a program that stores an array of the five
 * int values 1, 2, 3, 4, and 5, a Date object for the current time, and the double
 * value 5.5 into the file named Exercise17_05.dat.
 * */

public class StoreObjects {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int[] intValue = {1, 2 ,3, 4 ,5};
        double value = 5.5;
        Date date = new Date();
        try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("text.txt"))){
//            input.readObject(intValue);
            output.writeObject(intValue);
            output.writeDouble(value);
            output.writeObject(date);
        }
        try(ObjectInputStream input = new ObjectInputStream(new FileInputStream("text.txt"))){
            input.readObject();
            input.readDouble();
            input.readObject();
        }

    }
}
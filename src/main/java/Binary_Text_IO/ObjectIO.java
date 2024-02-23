package Binary_Text_IO;

import java.io.*;
import java.util.Date;
/**
 * The Object I/O is used to perform 1/0 for objects as well as for primitives-type values e.t.c.
 * check exceptions, classNotFound, FileNotFound e.t.c
 * */

public class ObjectIO {
    void main() throws ClassNotFoundException, IOException {
        try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("text.txt"))){
            output.writeUTF("Java");
            output.writeDouble(45.6);
            output.writeObject(new java.util.Date());

        }

        try(ObjectInputStream input = new ObjectInputStream(new FileInputStream("text.txt"))){
            String name = input.readUTF();
            double value1 = input.readDouble();
            Date date = (Date)(input.readObject());
            System.out.println(STR."\{name} \{value1} \{date}");
        }
    }
}
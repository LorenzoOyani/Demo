package Binary_Text_IO;

import java.io.*;

/**
 * Data input and Data output streams read a primitive-type data values fromm/ to files
 * End of File exception is thrown whn a file is read past the EOfile line.
 *
 * */

public class DataInputs {
    void main() throws IOException {
        try(DataOutputStream output = new DataOutputStream(new FileOutputStream("text.txt"));){
            output.writeUTF("John Lennon");
            output.writeDouble(12.444);
            output.writeUTF("lawrence see");
            output.writeDouble(43.55);
        }

        try(DataInputStream input = new DataInputStream(new FileInputStream("text.txt"))){
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());

        } catch(EOFException ex){
            System.out.println("All files where read");
        }

    }
}
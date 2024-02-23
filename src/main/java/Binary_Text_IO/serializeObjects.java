package Binary_Text_IO;

import java.io.*;

/**
 * not all object can be written to an output stream.
 * All object written to an output streams are serializable.
 * The serialize Object is an instance of serializable interface.
 * The serializable interface is a marker interface.
 * since it has no method as a result of it being a marker interface(Empty class).
 * implementing this interface enables the java mechanism to automate the process of storing objects and arrays.
 * when storing objects in a say (an ArrayList) all objects can be stored and may contain other Objects, java provides an
 * automated mechanism for writing objects, this process is called object serialization, which is implemented in ObjectOutputStream.
 * In contrast, the reading of Object is called deserialization, and it is implemented in ObjectInputStream.
 * many classes in java API implements java serializable
 * All of these streams are read-only and write-only streams also referred to as sequential strings
 * A file that is open using sequential streams is called a sequential-access file.
 */

public class serializeObjects implements java.io.Serializable {

    void main() throws IOException, ClassNotFoundException {
        int[] numbers = {1, 4, 6, 7, 8};
        String[] names = {"John", "Micheal", "Jordan", "Lorenzo"};

        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("text.txt", true))) {
            output.writeObject(numbers);
            output.writeObject(names);
        }


        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("text.txt"))) {
            int[] newNumbers = (int[]) (input.readObject());
            String[] newStrings = (String[]) (input.readObject());

            for (int i = 0; i < newNumbers.length; i++) {
                System.out.println(newNumbers[i] + "");
            }
            System.out.println();

            for (int i = 0; i < newStrings.length; i++) {
                System.out.println(newStrings[i] + " ");

            }

        }


    }
}
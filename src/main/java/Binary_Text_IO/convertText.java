package Binary_Text_IO;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * (Convert a text file into UTF) Write a program that reads lines of characters from
 * a text file and writes each line as a UTF-8 string into a binary file. Display the
 * sizes of the text file and the binary file. Use the following command to run the
 * program:
 */

public class convertText {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("usage: convert text to UTF");
            System.exit(1);
        }

        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("file " + args[0] + "does not exist");
            System.exit(2);
        }

        try (Scanner sc = new Scanner(file);
             DataOutputStream output = new DataOutputStream(new FileOutputStream(args[1]))

        ) {

            while (sc.hasNext()) {
                output.writeUTF(sc.nextLine());
            }
        }
    }
}
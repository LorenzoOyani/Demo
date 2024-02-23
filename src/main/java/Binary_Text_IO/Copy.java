package Binary_Text_IO;

import java.io.*;

/**
 * Try with resources is used to automatically close out of file.
 * it can contain two or more buffered streams on it.
 * primitive-values type including strings.
 *3
 */

public class Copy {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("usage: java copy files");
            System.exit(1);
        }
        // check SOURCE file if it exists
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println(STR." Source File \{args[0]}does not exist");
            System.exit(2);
        }

        // check the target file to see if it already existed.

        File targetFiles = new File(args[1]);
        if (targetFiles.exists()) {
            System.out.println(STR." Target File \{args[1]}  already exists");
            System.exit(3);
        }
        try (BufferedInputStream input = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targetFiles))
        ) {
            int r;
            int numberOfBytesRead = 0;
            while ((r = input.read()) != -1) {
                output.write((byte) r);
                numberOfBytesRead++;

            }
            System.out.println(STR."NUMBER OF BYTES IS \{numberOfBytesRead}");


        }


    }
}
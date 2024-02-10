package Exercise;

import java.io.File;
import java.util.Scanner;

/**
 * (Count characters, words, and lines in a file) Write a program that will count
 * the number of characters, words, and lines in a file. Words are separated by
 * whitespace characters. The file name should be passed as a command-line
 * argument,
 */

public class countFileCharacters {
    public static void main(String[] args) throws Exception {

        int characters = 0;
        int words = 0;
        int lines = 0;


        if (args.length != 2) {
            System.out.println("usage: counting characters");
            System.exit(1);
        }

        File file = new File(args[1]);
        if (!file.exists()) {
            System.out.println("Error: no such file found\n");
            System.exit(2);
        }

        try (Scanner sc = new Scanner(file)) {

            while (sc.hasNext()) {
                lines++;
                String line = sc.nextLine();
                characters = line.length();

            }

        }

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                String line = sc.next();
                words++;
            }
        }
        System.out.println("file " + file.getName() + "has ");
        System.out.println(characters + "characters");
        System.out.println(lines + "lines");
        System.out.println(words + "words");
    }

}
package Exercise;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class removeText {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("Java usage: removeTxt. ");
            System.exit(1);
        }

        File file = new File(args[1]);
        if (!file.exists()) {
            System.out.println("sys" + args[1] + "file does not exist");
            System.exit(2);
        }
        ArrayList<String> list = new ArrayList<>();
        try (Scanner sc = new Scanner(file)) { // try-with resources.

            while (sc.hasNext()) {
                String line = sc.nextLine();
                list.add(removeThisText(args[0], line));
            }

        }
        try (PrintWriter out = new PrintWriter(file)) { // try-with resources.

            for (int i = 0; i < list.size(); i++) {
                out.print(list.get(i));
            }
        }


    }

    public static String removeThisText(String text, String line) {
        StringBuilder sb = new StringBuilder(line);
        int start = sb.indexOf(text);
        int end = line.length();
        while (start > 0) {
            end = start + end;
            sb = sb.delete(start, end);
            start = sb.indexOf(text, start);
        }
        return sb.toString();
    }
}

class TotalScores {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("usage: count total scores: ");
            System.exit(1);
        }
        File file = new File(args[1]);
        if (!file.exists()) {
            System.out.println("\nfile " + file + " is not in directory");
            System.exit(2);
        }
        int count = 0;
        double total = 0;
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNext()) {
//                count++;
                total += sc.nextInt();
                count++;


            }
        }
        System.out.println("file " + file.getName());
        System.out.println("total score is " + total);
        System.out.println("number of counts is " + count);

    }
}

/**
 * (Count words) Write a program that counts the number of words in President
 * Abraham Lincoln’s Gettysburg address from http://cs.armstrong.edu/liang/data/
 * Lincoln.txt.
 */

class countWordsAddress {
    public static void main(String[] args) throws Exception {

        java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
        int count = 0;

        try {
            Scanner sc = new Scanner(url.openStream());
            while (sc.hasNext()) {

                if (Character.isLetterOrDigit(sc.next().charAt(0))) {
                    count++;
                }
            }
            System.out.println("The number of words in president Abraham lincoln's gettysburg address is " + count);
        } catch (java.net.MalformedURLException e) {
            System.out.println("Invalid URL");
        } catch (IOException e) {
            System.out.println("Error:\n no such file exist");
        }

    }

}
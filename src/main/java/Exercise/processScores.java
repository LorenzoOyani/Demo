package Exercise;

import java.io.IOException;
import java.util.Scanner;

/**
 * (Process scores in a text file on the Web) Suppose that the text file on the
 * Web http://cs.armstrong.edu/liang/data/Scores.txt contains an unspecified number
 * of scores. Write a program that reads the scores from the file and displays their
 * total and average. Scores are separated by blanks.
 */


public class processScores {

    public static void displayScores(String line) {
        String[] string = line.split("\\s+");
        int total = 0;
        for (String s : string) {
            total += s.length();
        }
        double average = total / string.length;
        System.out.println("The total scores is " + total);
        System.out.println("The average score is " + average);

    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("usage: reading from a file");
            System.exit(1);
        }
        try {
            java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/data/Scores.txt");
            Scanner sc = new Scanner(url.openStream());
            while (sc.hasNext()) {
                String line = sc.nextLine();
                displayScores(line);
            }

        } catch (java.net.MalformedURLException e) {
            System.out.println("form url cant be assessed");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
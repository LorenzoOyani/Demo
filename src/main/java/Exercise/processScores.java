package Exercise;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * (Process scores in a text file on the Web) Suppose that the text file on the
 * Web http://cs.armstrong.edu/liang/data/Scores.txt contains an unspecified number
 * of scores. Write a program that reads the scores from the file and displays their
 * total and average. Scores are separated by blanks.
 */
public class processScores {
    static void displayScores(String lines) throws FileNotFoundException {
        String[] strings = lines.split("\\s+");
        int total = 0;
        for (String score : strings) {
            total += Integer.parseInt(score);
        }
        double average = (double) total / strings.length;
        System.out.println("Average: " + average);
        System.out.println("Total: " + total);

    }

    public static void main(String[] args) throws FileNotFoundException {
        int currentIndex = 0;
        if (args.length != 1) {
            System.out.println("Usage: to read a scores from file");
            System.exit(1);
        }

        try {
            java.net.URL url = new java.net.URL(args[0]);
            Scanner sc = new Scanner(url.openStream());
            while (sc.hasNext()) {
                String line = sc.nextLine();
                displayScores(line);
            }
        } catch (MalformedURLException e) {
            System.out.println("File: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


//        File file = new File("http://cs.armstrong.edu/liang/data/Scores.txt");
//        if (!file.exists()) {
//            System.out.println("file " + file.getName() + "does not exist");
//            System.exit(1);
//        }
//
//        try (Scanner sc = new Scanner(file)) {
//            while (sc.hasNext()) {
//                String line = sc.nextLine();
//                currentIndex = line.indexOf("http", currentIndex);
//                displayScores(line, currentIndex);
//            }
//
//
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//        }
    }
}

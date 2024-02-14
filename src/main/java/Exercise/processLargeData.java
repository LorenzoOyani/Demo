package Exercise;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * (Process large dataset) A university posts its employees’ salaries at http://
 * cs.armstrong.edu/liang/data/Salary.txt. Each line in the file consists of a faculty
 * member’s first name, last name, rank, and salary (see Programming Exercise
 * 12.24). Write a program to display the total salary for assistant professors,
 * associate professors, full professors, and all faculty, respectively, and display
 * the average salary for assistant professors, associate professors, full professors,
 * and all faculty, respectively.
 */

public class processLargeData {

    public static void main(String[] args) throws Exception {

        ArrayList<Double> associate = new ArrayList<>();
        ArrayList<Double> assistant = new ArrayList<>();
        ArrayList<Double> full = new ArrayList<>();

        try {
            java.net.URL url = new java.net.URL("http:// cs.armstrong.edu/liang/data/Salary.txt");
            Scanner sc = new Scanner(url.openStream());
            while (sc.hasNext()) {
                String[] line = (sc.nextLine().split(" "));
                String rank = line[2];
                double salary = Double.parseDouble(line[3]);
                processData(associate, assistant, full, rank, salary);


            }

            double totalAssociates = getTotal(associate);
            double totalAssistant = getTotal(assistant);
            double totalFull = getTotal(full);

            double averageAssociate = getAverage(associate);
            double averageAssistant = getAverage(assistant);
            double averageFull = getAverage(full);

            // output data.


        } catch (IOException | NumberFormatException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }


    }

    public static double getAverage(ArrayList<Double> lists) {
        double totalAverage = getTotal(lists);
        return totalAverage / lists.size();
    }

    public static Double getTotal(ArrayList<Double> totalSalary) {
        double total = 0;
        ;
        for (double i = 0; i < totalSalary.size(); i++) {
//            total += totalSalary.add(totalSalary.get(0));
            total += totalSalary.get(0);
        }
        return total;
    }

    public static void processData(ArrayList<Double> associate, ArrayList<Double> assistant,
                                   ArrayList<Double> full, String rank, double salary) {
        if (rank.equals("associate")) {
            associate.add(salary);
        }
        if (rank.equals("assistant")) {
            assistant.add(salary);
        }
        if (rank.equals("full")) {
            full.add(salary);
        }


    }
}
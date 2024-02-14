package Exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * (Create large dataset) Create a data file with 1,000 lines. Each line in the file
 * consists of a faculty member’s first name, last name, rank, and salary. The
 * faculty member’s first name and last name for the ith line are FirstNamei and
 * LastNamei. The rank is randomly generated as assistant, associate, and full.
 * The salary is randomly generated as a number with two digits after the decimal
 * point. The salary for an assistant professor should be in the range from 50,000
 * to 80,000, for associate professor from 60,000 to 110,000, and for full professor
 * from 75,000 to 130,000. Save the file in Salary.txt. Here are some sample data:
 * FirstName1 LastName1 assistant 60055.95
 * FirstName2 LastName2 associate 81112.45
 * . . .
 * FirstName1000 LastName1000 full 92255.21
 */

public class LargeDataSets {
    public static void main(String[] args) throws FileNotFoundException {

        if (args.length != 1) {
            System.out.println("Usage: creating large datasets");
            System.exit(1);
        }

        File file = new File("Salary.txt");
        if (file.exists()) {
            System.out.println("File " + args[0] + " already exists ");
            System.exit(2);
        }
        String rank = "";
        double salary;

        try (Scanner sc = new Scanner(file)) {
            PrintWriter output = new PrintWriter(sc.next());
            for (int i = 0; i < 1000; i++) {
                output.print(STR."firstname \{i} lastname \{i}");
                rank = rank();
                salary = salary(rank);

                System.out.println(STR."\{rank}%-2d\{salary}");
            }
        }

    }

    private static double salary(String rank) {
        if (rank.equals("associate")) {
            return 50000 + (Math.random() * 50001);
        } else if (rank.equals("assistant")) {
            return 60000 + (Math.random() * 60001);

        } else {

            return 75000 + (Math.random() * 75001);
        }


    }

    public static String rank() {
        String[] line = {"assistant", "associate", "full"};
        int random = (int) (Math.random() * 3);
        String rank = line[random];

        return rank;

    }
}
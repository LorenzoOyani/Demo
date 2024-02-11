import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class randomWordFile {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("usage: creating random file");
            System.exit(1);
        }
        File file = new File("Exercise_15.txt");
        if (file.exists()) {
            System.out.println("File already exist");
            System.exit(0);
        }
        try (PrintWriter output = new PrintWriter(file)) {
            for (int i = 0; i < 100; i++) {
                output.print((int) (Math.random() * 500) + 1);
                output.print(" ");
            }

        } catch (java.io.FileNotFoundException e) {
            System.out.println("File not found");

        }
        ArrayList<String> list = new ArrayList<>();

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                list.add(sc.next());
            }
            Collections.sort(list);

        } catch (java.io.FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
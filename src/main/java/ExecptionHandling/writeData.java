//package ExecptionHandling;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.net.URL;
//import java.util.Scanner;
//
//public class writeData {
//    void main() throws IOException {  // attached the RunTime error to the main method
////        Object scores;
//        java.io.File file = new java.io.File(scores.txt);
//        if (file.exists()) {
//            System.out.println("file already exists");
//            System.exit(1);
//        }
//        java.io.PrintWriter out = new java.io.PrintWriter(file);
//        out.print("John Grisham");
//        out.print(90);
//        out.close(); // helps saves files properly.
//
//        // try-with-resources is used in place of manual file closing to automatically close the file
//    }
//}
//
//class Data {
//    void main() throws IOException {
//        java.io.File file = new java.io.File(scores.txt);
//
//        if (file.exists()) {
//            System.out.println("files exists");
//        }
//        try (java.io.PrintWriter sc = new java.io.PrintWriter(file)) {
//            sc.print("John Lennon");
//            sc.print(34);
//            sc.print("Locke");
//        }
//    }
//}
//// scanners break its input into tokens
////uniform resource Locator
//
//class ReadData {
//    void main() throws Exception {
//        java.io.File file = new java.io.File(sum.txt);
//        try (PrintWriter pr = new PrintWriter(file)) { // try with resources.
//
//            Scanner sc = new Scanner(System.in);
//            while (sc.hasNext()) {
//                String firstName = sc.next();
//                String mi = sc.next();
//                String lastName = sc.next();
//
//                int scores = sc.nextInt();
//                pr.print("firstname: " + firstName + "middle name: " + mi + "Lastname: " + lastName + " = " + scores);
//            }
//        }
//
//    }
//}
//
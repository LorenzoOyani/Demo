package Exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * (Replace text) Revise Programming Exercise 12.16 to replace a string in a file
 * with a new string for all files in the specified directory using the command:
 * java Exercise12_22 dir oldString newString
 */

public class ReplaceTextDirectory {
    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            System.out.println("usage: use to read texts from directory");
            System.exit(1);
        }

        File directory = new File(args[0]);
        if (!directory.isDirectory()) {
            System.out.println("directory " + args[0] + "does not exist");
            System.exit(2);
        }

        File[] files = directory.listFiles();
        replaceAll(args[0], args[1], files);


    }

    /**
     * using a foreach loop on object is more fusible
     */
    static void replaceAll(String arg1, String arg2, File[] files) {

        for (File file : files) {
            replaceAllOldFiles(arg1, arg2, file);
        }

    }

    static void replaceAllOldFiles(String oldString, String newString, File file) {

        ArrayList<String> list = new ArrayList<>();

        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                String line = sc.nextLine();
                list.add(line.replaceAll(oldString, newString));
            }
        } catch (FileNotFoundException e) {
            System.out.println(STR."File not found \{file.getName()}");
        }
        try (PrintWriter output = new PrintWriter(file)) {
            for (int i = 0; i < list.size(); i++) {
                output.println(String.valueOf(i));
                output.print("");
            }

        } catch (FileNotFoundException e) {
            System.out.println(STR."Error: file not find \{e.getMessage()}");
        }
    }
//    @Override
//    public boolean equals(Object o ){
//        if(o == this){
//            return true;
//        }
//        if(!(o instanceof List)){
//            return false;
//        }
////        Iterator<E> e1 =Iterator;
//
//    }


}




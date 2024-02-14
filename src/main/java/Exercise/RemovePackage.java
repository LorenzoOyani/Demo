package Exercise;

/**
 * (Remove package statement) Suppose you have Java source files under the
 * directories chapter1, chapter2, . . . , chapter34. Write a program to
 * remove the statement package chapteri; in the first line for each Java
 * source file under the directory chapteri. Suppose chapter1, chapter2,
 * . . . ,chapter34 are under the root directory srcRootDirectory. The root
 * directory and chapteri directory may contain other folders and files. Use
 * the following command to run the program:
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * To-do's
 * //
 * check if file is a directory
 * create list of directories, getting all file directories.
 * get files using List data Structure
 * Removes the first line of each file in the list.
 * Add all source files in directory to the list
 */
public class RemovePackage {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1) {
            System.out.println("usage: check and remove files in directory.");
            System.exit(1);
        }

//        ArrayList<File> file = getFileDirectories(new File(args[0]));
//        ArrayList<File> list = new ArrayList<>();
        File root = new File(args[0]);
        if (!root.isDirectory()) {
            System.out.println("file " + args[0] + " does not exist");
            System.exit(2);
        }

        ArrayList<File> chapters = getFileDirectories(root);
        try {
            while (!chapters.isEmpty()) {
//            File file = chapters.remove(0);
//            deleteFilePackages(file);
                ArrayList<File> files = getFiles(chapters);
                deleteFilePackages(files, chapters.get(0));
                /**
                 * to delete a file, you add it to a list arrays
                 * amd delete the file using its current index position
                 * */
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(STR."Error: \{e.getMessage()}");

        }

    }

    public static ArrayList<File> getFileDirectories(File line) {
        ArrayList<File> FileDirectories = new ArrayList<>();
        for (int i = 0; i < 34; i++) {
            FileDirectories.add(new File(line, "chapters " + i));
        }
        return FileDirectories;
    }

    public static void deleteFilePackages(ArrayList<File> file, File dir) throws FileNotFoundException {
        for (int i = 0; i < file.size(); i++) {
            ArrayList<String> list = new ArrayList<>();
            try (Scanner sc = new Scanner(list.get(i))) {
                while (sc.hasNext()) {
                    list.add(sc.nextLine());
                }

            }
            list.remove(0);
            try (PrintWriter output = new PrintWriter(list.get(i))) {
                for (int j = 0; j < list.size(); j++) {
                    output.println(list.get(i));

                }
            }

        }

    }

    public static ArrayList<File> getFiles(ArrayList<File> dir) {
        if (!dir.get(0).isDirectory()) {
            System.exit(0);
        }
        ArrayList<File> lists = new ArrayList<>(Arrays.asList(dir.get(0).listFiles()));
        filterJavaLists(lists);
        return lists;

    }

    public static void filterJavaLists(ArrayList<File> file) {
        for (int i = 0; i < file.size(); i++) {
            String line = file.get(0).getName();
            boolean isJavaFile = line.substring(line.indexOf(".")).equals("java");

            if (!isJavaFile) {
                file.remove(i);
            }
        }
    }
}
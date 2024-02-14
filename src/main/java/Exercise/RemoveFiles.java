package Exercise;

/**
 * (Remove package statement) Suppose you have Java source files under the
 * directories chapter1, chapter2, chapter34. Write a program to
 * remove the statement package chapteri; in the first line for each Java
 * source file under the directory chapteri. Suppose chapter1, chapter2,
 * chapter34 are under the root directory srcRootDirectory. The root
 * directory and chapteri directory may contain other folders and files. Use
 * the following command to run the program:
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/**
 * TODO
 * check for directory
 * create a chapters of directory using a list.
 * get file direcories from its indexes on the list.
 * delete the first file in the directory.
 * get list of the remaining files.
 */
public class RemoveFiles {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1) {
            System.out.println("java Usage: remove files in directory");
            System.exit(1);
        }
        File root = new File(args[0]);
        if (!root.isDirectory()) {
            System.out.println(STR."file \{args[0]} is not a directory");
            System.exit(2);
        }
        ArrayList<File> chapters = getRootChapterDirectory(root);
        try {
            while (!chapters.isEmpty()) {
                ArrayList<File> list = getFileDirectories(chapters);
                deletePackageFiles(list, chapters.get(0));
                chapters.remove(0);

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }


    public static ArrayList<File> getFileDirectories(ArrayList<File> dir) {
        // object parameter
        // validation using Objects.requireNonNull reference.
        if (!(dir.get(0).isDirectory())) {
            System.exit(0);
        }
        ArrayList<File> lists = new ArrayList<>(Arrays.asList(Objects.requireNonNull(dir.get(0).listFiles())));
        filterJavaFiles(lists);
        return lists;


    }

    public static void filterJavaFiles(ArrayList<File> list) {
        for (int i = 0; i < list.size(); i++) {
            String line = list.get(0).getName();
            boolean isJavaFile = line.substring(list.indexOf(".")).equals("java");

            if (!isJavaFile) {
                list.remove(i);
            }
        }
    }

    public static ArrayList<File> getRootChapterDirectory(File file) {
        ArrayList<File> lists = new ArrayList<>();
        for (int i = 0; i < 34; i++) {
            lists.add(new File(file, "Chapter " + i));
        }
        return lists;
    }

    public static void deletePackageFiles(ArrayList<File> line, File file) throws FileNotFoundException {
        for (int i = 0; i < line.size(); i++) {
//            line.remove(line.indexOf(line.get(0)))
            //always add to an arrayList before removing from it.
            try (Scanner sc = new Scanner(line.get(0))) {
                while (sc.hasNext()) {
                    line.add(new File(sc.nextLine()));
                }
            }
            line.remove(0);
            try (PrintWriter outPut = new PrintWriter(line.get(0))) {
                for (int j = 0; j < line.size(); i++) {
                    outPut.println(line.get(i));
                }
            }

        }
    }
}
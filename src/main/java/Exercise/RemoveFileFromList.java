package Exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/**
 * (Remove package statement) Suppose you have Java source files under the
 * directories chapter1, chapter2, chapter34. Write a program to
 * remove the statement package chapteri; in the first line for each Java
 * source file under the directory chapteri. Suppose chapter1, chapter2,
 * chapter34 are under the root directory srcRootDirectory. The root
 * directory and chapteri directory may contain other folders and files. Use
 * the following command to run the program:
 */

public class RemoveFileFromList {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("usage: removing files..");
            System.exit(1);
        }

        File root = new File(args[0]);
        if (!root.isDirectory()) {
            System.out.println("the file " + args[0] + " is not a directory");
            System.exit(2);
        }


        // define an ArrayList to manipulate the file.
        ArrayList<File> chapters = getRootDirectories(root);
        if (!chapters.isEmpty()) {
            ArrayList<File> list = getFileDirectories(chapters);
            removeChapters(list, chapters.get(0));


        }
    }

    public static void removeChapters(ArrayList<File> list, File file) throws FileNotFoundException {
        for(int i = 0; i < list.size(); i++){

            try(Scanner sc = new Scanner(System.in)){
                while(sc.hasNext()){
                    list.add(new File(sc.nextLine()));
                }
            }
            list.remove(0);
        }
        try(PrintWriter output = new PrintWriter(list.get(0))){
            for(int j = 0; j < list.size(); j++){
                output.print(list.get(j));
            }

        }
    }

    public static ArrayList<File> getRootDirectories(File file) {
        ArrayList<File> lists = new ArrayList<>();
        for (int i = 0; i < 34; i++) {
            lists.add(new File(file, "chapters " + i));
        }
        return lists;
    }

    public static ArrayList<File> getFileDirectories(ArrayList<File> rootFile) {
        if (!(rootFile.get(0).isDirectory())) {
            System.out.println("");
            System.exit(0);
        }
        ArrayList<File> lists = new ArrayList<>(Arrays.asList(Objects.requireNonNull(rootFile.get(0).listFiles())));
        filterJavaFiles(lists);
        return lists;

    }

    public static void filterJavaFiles(ArrayList<File> lists){
        for(int i = 0; i < lists.size(); i++){
            String line = lists.get(i).getName();
            boolean isJavaFile = line.substring(line.indexOf(".")).equals("java");
            if(!isJavaFile){
                lists.remove(i);
            }
        }
    }
}




package ExecptionHandling;

import java.util.ArrayList;
import java.util.Scanner;

public class webCrawler {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a URL string: ");
        String URLstring = sc.nextLine();
        crawler(URLstring);
    }

    public static void crawler(String URLstring) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> traverseList = new ArrayList<>();

        list.add(URLstring);
        if (!list.isEmpty() && list.size() <= 100) {
            String urlString = list.remove(0);
            if (!traverseList.contains(urlString)) {
                traverseList.add(urlString);
                System.out.println("craw " + urlString);

                //get the sub-string of the string url.
                for (String s : getSubStrUrl(URLstring)) {
                    if (!list.contains(s)) {
                        list.add(s);
                    }

                }
            }

        }
    }

    public static ArrayList<String> getSubStrUrl(String urlString) {
        ArrayList<String> list = new ArrayList<>();

        try {
            java.net.URL url = new java.net.URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int current = 0;
            while (input.hasNext()) {
                String line = input.nextLine();
                current = line.indexOf("http", current);
                while (current > 0) {
                    int endIndex = line.indexOf("/", current);
                    if (endIndex > 0) {
                        list.add(line.substring(current, endIndex));
                        current = line.indexOf("http", endIndex);
                    } else {
                        current = -1;
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("catch: " + ex.getMessage());
        }

        return list;

    }
}
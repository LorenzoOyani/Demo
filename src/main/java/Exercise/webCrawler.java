package Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class webCrawler {
    static void main() {
        System.out.print("Enter a url: ");
        Scanner sc = new Scanner(System.in);
        String URLstring = sc.next();
        crawler(URLstring);
    }

    public static void crawler(String URLstring) {
        ArrayList<String> listOfAppendUrls = new ArrayList<>();
        ArrayList<String> traverseAppendLists = new ArrayList<>();
        listOfAppendUrls.add(URLstring);
        int current = 0;
        if (!listOfAppendUrls.isEmpty() && traverseAppendLists.size() <= 100) {
            String newUrl = listOfAppendUrls.remove(0);
            if (!traverseAppendLists.contains(newUrl)) {
                traverseAppendLists.add(newUrl);
            }

        }
        for (String lists : getSubUrl(URLstring)) {
            if (!listOfAppendUrls.contains(lists)) {
                listOfAppendUrls.add(lists);
            }
        }

    }

    static ArrayList<String> getSubUrl(String UrlString) {
        ArrayList<String> list = new ArrayList<>();
        try {
            java.net.URL url = new java.net.URL(UrlString);
            Scanner input = new Scanner(url.openStream());
            int currentIndex = 0;
            while (input.hasNext()) {
                String line = input.nextLine();
                currentIndex = line.indexOf("http", currentIndex);
                while (currentIndex > 0) {
                    int endIndex = line.indexOf("/", currentIndex);
                    if (endIndex > 0) {
                        list.add(line.substring(currentIndex, endIndex));
                        currentIndex = line.indexOf("http", endIndex);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }


}
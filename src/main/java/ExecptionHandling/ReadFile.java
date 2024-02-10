package ExecptionHandling;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Scanner;

public class ReadFile {
//    java.net.URL url = new java.net.URL()
    void main()  {
        String URLstring = new Scanner(System.in).next();
        try{
            java.net.URL url = new java.net.URL(URLstring);
            int count = 0;
            Scanner sc = new Scanner(url.openStream());
            while(sc.hasNext()){
                String line = sc.nextLine();
                count += line.length();
            }
        }catch (MalformedURLException ex){
            System.out.println("Invalid URL");
        } catch (IOException e) {
//            throw new RuntimeException(e);
            System.out.println(e.getMessage());
            System.out.println("Error//: file not found.");
        }
    }

}
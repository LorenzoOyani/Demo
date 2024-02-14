package Nearest.point;

import java.util.*;


public class newNearest {

    public static double distance(double x1, double x2, double y1, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of points: ");
        int numberOfPoints = sc.nextInt();

        double[][] points = new double[numberOfPoints][1];
        for(int i =0; i < points.length; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }
        int p1= 0, p2 = 1;
        double shortestDistance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);

        for(int i =0; i < points.length; i++) {
            for(int j = i + 1; j< points.length; j++) {
                double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);

                if(shortestDistance > distance) {
                    p1 = i;
                    p2 = j;
                    shortestDistance =distance;
                }
            }
            System.out.println(STR."The closest two points are (\{points[p1][0]}, \{points[p1][1]}) and (\{points[p2][0]}, \{points[p2][1]})");
        }
//        sc.close();
    }

}





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

class Point2D{

    Point2D(){

    }

    public Point2D(int x1, int x2) {
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value for x1 and y1: ");
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        System.out.print("Enter a value for x2 and y2: ");
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();

        Point2D p1 = new Point2D(x1, x2);
        Point2D p2 = new Point2D(y1, y2);
        System.out.println("p1 is " + p1.toString());
        System.out.println("p1 is " + p2.toString());
        System.out.println("The distances between two points is  ");
    }
}

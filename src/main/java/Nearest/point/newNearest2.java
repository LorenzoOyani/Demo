//package Nearest.point;
//
//import java.util.*;
//
//// get the nearest point in the 2D points.
//
//public class newNearest2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
////        int input = sc.nextInt();
//        System.out.print("Enter two point: ");
//        int x1 = sc.nextInt();
//        int x2 = sc.nextInt();
//        System.out.print("Enter two point: ");
//        int y1 = sc.nextInt();
//        int y2 = sc.nextInt();
//
//
//        Point2D p1 = new Point2D(x1, x2);
//        Point2D p2 = new Point2D(y1, y2);
//
//
//
//    }
//    public static double distance(double x1, double x2, double y1, double y2) {
//        return Math.sqrt((x1 - x2 * x1 - x2) + (y1 - y2 * y1 * y2));
//    }
//    public static void Point2D() {
//        Scanner sc = new Scanner(System.in);
//        int normalPoint = sc.nextInt();
//
//        double[][] points = new double[normalPoint][1];
//        for(int i = 0; i < points.length; i++) {
//            points[i][0] = sc.nextInt();
//            points[i][1] = sc.nextInt();
//
//        }
//        int p1 = 0, p2 = 1;
//        double shortestDistance = distance(points[p1][0],points[p1][1],points[p2][0],points[p2][1]);
//
//        for(int i = 0; i < points.length; i++) {
//            for(int j = i + 1; j < points.length; j++) {
//                double distance = distance(points[i][0], points[i][1], points[j][0],points[j][1]);
//
//                if(shortestDistance > distance){
//                    p1 = i;
//                    p2 = j;
//                    shortestDistance = distance;
//                }
//                System.out.println(STR."\{points[p1][0]} \{points[p1][1]} and \{points[p2][0]} \{points[p2][1]}");
//            }
//        }
//
//
//
//    }
//}
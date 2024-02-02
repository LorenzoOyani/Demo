package KnightTour;

public class knightTour {
    static int N = 8;

 public static void main(String[] args) {
     solveKt();

     // check for safety by initializing a backtracking;
     // solve for the KnightTour.knightTour by using a KnightTour.kt utility that run a loop around the tour and attempt to solve
     // print the solution
 }

 public static boolean solveKt() {

     int[][] sol = new int[N][N];
     // initialize a backtracking...
     for(int x = 0; x < N; x++) {
         for(int y = 0; y < N; y++) {
             sol[x][y] = -1;
         }
     }
     int[] xMove = {2, 1, -1, -2, -2, -1, 1, 2 };
     int[] yMove = {1, 2, 2, 1, -1, -2, -2, -1 };
     sol[0][0] = 0;

     if( !solveKtUtils(0, 0, 1, sol, xMove, yMove)) {
         System.out.println("Failed to solve knight tour");
         System.exit(1);
     } else {
         printSolution(sol);
     }
        return true;

 }

 static boolean solveKtUtils(int x, int y, int initX, int[][] sol, int[] xMove, int[] yMove) {
     int k , nextX, nextY;
     if(initX == N * N) {
         return  true;
     }
     for(k = 0; k < 8; k++) {
         nextX = x + xMove[k];
         nextY = y + yMove[k];
         if(isSafe(nextX, nextY, sol)) {
             sol[nextX][nextY] = initX;
         }
         if(solveKtUtils(nextX, nextY, initX + 1, sol, xMove, yMove)) {
             return true;
         } else {
             sol[nextX][nextY] = - 1; // backtracking..
         }

     }
     return false;
 }
 public static  boolean isSafe(int x, int y, int[][] sol) {
        return (x >=0 && x < N && y >= 0 && y < N && sol[x][y] == -1);
 }

 static void printSolution(int[][] sol) {
     for(int x = 0; x < N; x++ ) {
         for(int y = 0; y < N; y++){
             System.out.println(STR."\{sol[x][y]} ");
         }
     }
 }


}
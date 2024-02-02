package KnightTour;



public class newKnightTour {
    static int N = 8;
    public static void main(String[] args) {
        solveKts();
    }

    static boolean solveKts(){
        int[][] sample = new int[N][N];

        //Initialize backtracking...
        for(int  x =0 ; x < 8; x++) {
            for(int y = 0; y < 8; y++) {
                sample[x][y] = -1;
            }
        }
        int[] xMove = {2, 1, -1, -2, -2, -1, 1, 2 };
        int[] yMove = {1, 2, 2, 1, -1, -2, -2, -1 };


        sample[0][0] = 0;
        if(!solvektsUtils(0,0,1, sample, xMove, yMove)){
            System.out.println("cannot resolve kts");
            System.exit(1);
        }else {
            printSolution(sample);
        }
        return true;

    }
    public static boolean solvektsUtils(int x, int y, int xyInit, int[][] sample, int[] xMove, int[] yMove) {
        int c =0;
        if(xyInit == N * N){
            return true;
        }
        for(c = 0; c < 8; c++) {
            int NextX = x + xMove[c];
            int NextY = y + yMove[c];

            if(isSafe(NextX, NextY, sample)) {
                sample[NextX][NextY] = -1;
            }
            if(solvektsUtils(x, y, xyInit + 1, sample, xMove, yMove)){
                return true;

            } else {
                sample[NextX][NextY] = -1;
            }
            return true;

        }
        return false;
    }
    public static boolean isSafe(int x, int y, int[][] sample) {
        return (x >=0 && x < N && y >= 0  && y < N && sample[x][y] == -1);
    }

    public static void printSolution(int[][] sample) {
        for(int i =0; i < 8; i++){
            for(int j = 0; j < 8; j++) {
                System.out.println(sample[i][j]+ " ");
            }
        }
    }


}
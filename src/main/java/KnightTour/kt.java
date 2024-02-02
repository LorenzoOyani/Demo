package KnightTour;

public class kt {
    private static int N = 8;
    private static int[][] knightMoves;

    public static void main(String[] args) {
        knightMoves = new int[N][N];

        // create a backtracking to stop the flow of data while the cells condition is not met
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                knightMoves[x][y] = -1;
            }
        }
        int[] xMove = {1, -2, 1, 2, 1, 2, -1, -2, 1};
        int[] yMove = {1, 2, 1, -1, 2, 1, 2, 1, 1, 2};

        knightMoves[0][0] = 0;
        int xInit = 0;
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                if (!solveKtsUtil(0, 0, 1, knightMoves, xMove, yMove)) {
                    System.out.println("");
                    knightMoves[x][y] = -1;
                    System.exit(1);
                } else {
                    printSolution(knightMoves);
                }
            }
        }
    }

    public static boolean solveKtsUtil(int x, int y, int xInit, int[][] knightMoves, int[] xMove, int[] yMove) {
        if (xInit == N * N) {
            return true;
        }
//        int k = 0;
        for (int k = 0; k < 8; k++) {
            int nextX = x + xMove[k];
            int nextY = y + yMove[k];
            if (isSafe(nextX, nextY, knightMoves)) {
                knightMoves[nextX][nextY] = xInit;
            }
            if (solveKtsUtil(x, y, xInit + 1, knightMoves, xMove, yMove)) {
                return true;
            } else {
                knightMoves[nextX][nextY] = -1;
            }
            return true;
        }
        return false;
    }

    public static boolean isSafe(int x, int y, int[][] knightMoves) {
        return (x >= 0 && x < N && y >= 0 && y < N && knightMoves[x][y] == -1);
    }

    public static void printSolution(int[][] knightMoves) {
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                System.out.println(knightMoves[x][y] + " ");
            }
        }
    }
}
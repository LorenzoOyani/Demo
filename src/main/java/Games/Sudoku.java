package Games;

public class Sudoku {
    private static int[][] sudoku;
    private static int UNASSIGNED = 0;

    public Sudoku() {
        sudoku = new int[9][9];

    }

    public Sudoku(int[][] sudoku) {
        this.sudoku = sudoku;
    }
    //TODO

    /**
     * to check row
     * check col
     * check box
     * check isSafe
     * display
     */

    private boolean isRowPresent(int row, int number) {
        for (int i = 0; i < 9; i++) {
            if (sudoku[row][i] == number) {
                return true;
            }
        }
        return false;
    }

    private boolean isColPresent(int col, int number) {
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == number) {
                return true;
            }
        }
        return false;
    }

    private boolean isBothInBox(int row, int col, int number) {
        int r = row - row % 3;
        int c = col - col % 3;
        for (int i = r; i < r + 3; i++) {
            for (int j = c; c < c + 3; c++) {
                if (sudoku[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean solveSudoku() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] == UNASSIGNED) {
                    for (int number = 1; number < 9; number++) {
                        if (isAllowed(i, j, number)) {
                            sudoku[i][j] = number;
                            if (solveSudoku()) {
                                return true;
                            } else {
                                sudoku[i][j] = UNASSIGNED;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;

    }

    private boolean isAllowed (int row, int col, int num) {
        return (isRowPresent(row, num) || isColPresent(col, num) || isBothInBox(row, col, num));
    }

    public static void main(String[] args) {
        Sudoku sods = new Sudoku();

    }
}



package Games;

public class sudokuGame {
    private final int UNASSIGNED = 0;
    private int[][] sudoku;

    sudokuGame(int[][] sudoku) { //create a constructor
        this.sudoku = sudoku;
    }

    public void Sudoku() {
        sudoku = new int[9][9];
    }


    public boolean isRowPresent(int row, int number) {
        for (int i = 0; i < 9; i++) {
            if (sudoku[row][i] == number) {
                return true;
            }

        }
        return false;
    }

    public boolean isColPresent(int col, int number) {
        for (int i = 0; i < 9; i++) {
            if (sudoku[col][i] == number) {
                return true;
            }
        }
        return false;
    }

    public boolean isBothPresent(int row, int col, int number) {
        int r = row - row % 3;
        int c = col - col % 3;
        for (int i = 0; i < r + 3; i++) {
            for (int j = 0; j < c + 3; j++) {
                if (sudoku[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isAllowed(int i, int j, int number) {
        return (isRowPresent(i, number) || isColPresent(j, number) || isBothPresent(i, j, number));
    }

    public boolean solveSudoku() throws Exception {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] == UNASSIGNED) {
                    for (int number = 1; number < 9; number++) {
                        if (isAllowed(i, j, number)) {

                            sudoku[i][j] = number;
                        }
                        if (solveSudoku()) {
                            return true;
                        } else {
                            sudoku[i][j] = UNASSIGNED;
                        }
                    }

                }
            }
        }
        return false;
    }

}
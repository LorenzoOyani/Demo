package Exercise;

public class LargestSumRow {
    void main() {
        int[][] matrix = {
                {2, 6, 7, 9, 2, 4, 90},
                {3, 67, 85, 43, 57, 90}
        };

        int maxRow = 0;
        int indexRow = 0;
        for (int col = 0; col < matrix.length; col++) {
            maxRow += matrix[0][col];
        }

        int total = 0;
        for (int row = 1; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                total += matrix[row][col];

                if (total > maxRow) {
                    maxRow = total;
                    indexRow = row;
                }
            }

        }
        System.out.println("the max row is " + maxRow + " and the index is " + indexRow);
    }
}

class LargestRow {
    void main() {
        int[][] sample = {
                {2, 7, 2, 0, 7, 4, 6},
                {1, 4, 6, 3, 1, 8, 9},
        };
        int maxRow = 0;
        int total = 0;
        int indexRow = 0;

        //initialize a row or col;
        for(int col = 0; col < sample.length; col++) {
            maxRow += sample[0][col] ;
        }
        for(int row = 1; row < sample.length; row++){
            for(int col = 0; col < sample[row].length; col++){
                total += sample[row][col];

                if(total > maxRow){
                    maxRow = total;
                    indexRow = row;
                }
            }
        }
        System.out.println("The maxRow is " + maxRow + " and the index is "+ indexRow);
    }
}
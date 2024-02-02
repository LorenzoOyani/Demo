package others;

public class TwoDimensionalArrays {
    // Raged arrays...
    public static void main(String[] args) {
        int[][] triangularArrays = new int[5][];

        triangularArrays[0] = new int[5];
        triangularArrays[1] = new int[4];
        triangularArrays[2] = new int[3];
        triangularArrays[3] = new int[2];
        triangularArrays[4] = new int[1];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < triangularArrays[i].length; j++) {
                triangularArrays[i][j] = i + j;
                System.out.print(triangularArrays[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class ArrayInitializersAndMethods {
    private static int[][] matrix = new int[10][10];

//    public static void main(String[] args) {
//        int total = 0;
//        Scanner sc = new Scanner(System.in);
//
//        for (int row = 0; row < matrix.length; row++) {
//            for (int col = 0; col < matrix[row].length; col++) {
//                int l1 = (int) (Math.random() * matrix.length);
//                int l2 = (int) (Math.random() * matrix[row].length);
//
//                int temp = matrix[row][col];
//                matrix[row][col] = matrix[l1][l2];
//                matrix[l1][l2] = temp;
//            }
//            System.out.println('\n');
//        }
//    }


    // compute row with the largest sum.
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 4, 5, 6, 7, 5},
                {1, 2, 4, 5, 6, 7, 5}
        };
        int maxRow = 0,
                indexRow = 0;
        for (int col = 0; col < matrix.length; col++) {
            maxRow += matrix[0][col]; // initialize only the max-length of the row array.
        }

        for (int row = 1; row < matrix.length; row++) {
            int totalRowPoint = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                totalRowPoint += matrix[row][col];

                if (totalRowPoint > maxRow) {
                    maxRow = totalRowPoint;
                    indexRow = row;
                }
            }

        }
        System.out.println(STR."Row \{indexRow} has the maximum sum of \{maxRow}");
    }


}




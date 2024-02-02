package file;

class DivideAndConquer {
    public static void main(String[] args) {
        int[] arr = {90, 230, 450, 680, 720, 78, 90};

        int min;
        int max;

        max = DAC_max(arr, 0, 7);
        min = DAC_min(arr, 0, 7);

        System.out.println(STR."The minimum array in the given array is %d\n\{min}");
        System.out.println(STR."The minimum array in the given array is %d\n\{max}");
    }

    public static int DAC_min(int[] arr, int index, int l) {
        int min;
        if (l - 1 == 0) {
            return arr[index];
        }
        if (index > l - 2) {
            if (arr[index] < arr[index + 1]) {
                return arr[index];
            } else {
                return arr[index + 1];
            }
        }

        min = DAC_min(arr, index + 1, l);

        if (arr[index] < min) {
            return arr[index];
        } else {
            return min;
        }


    }
    static int DAC_max(int[] arr, int index, int h) {
        int max;
        if (h - 1 == 0) {
            return arr[index];
        }
        if(index > h - 2) {
            if(arr[index] < arr[index + 1]) {
                return arr[index];
            }else {
                return arr[index + 1];
            }

        }

        max = DAC_max(arr, index, h);

        if(arr[index] > max) {
            return  arr[index];
        } else {
           return max;
        }
    }
}

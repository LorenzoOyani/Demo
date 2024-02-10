package Handle_Strings.java;

import java.util.HashMap;

public class SubarrysWithKdisctint {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 3, 6};
//        int n = arr.length;
        int k = 2;
        int solution = getSubArray(arr, k) - getSubArray(arr, k - 1);
        System.out.println(STR."\{solution} ");
    }

    public static int getSubArray(int[] arr, int k) {
        int count = 0;
        int right = 0;
        int left = 0;
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (right = 0; right < n; right++) {
            int num = arr[right];
            map.put(num, map.getOrDefault(num, 0) + 1);

            while (map.size() > k) {
                int leftnum = arr[left++];
                map.put(leftnum, map.get(leftnum) - 1);
                if (map.get(arr[leftnum]) == 0) {
                    map.remove(arr[leftnum]);

                }


            }
            count += right - left + 1;
        }

        return count;
    }

}
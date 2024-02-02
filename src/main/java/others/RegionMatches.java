package others;

import java.util.ArrayList;

public class RegionMatches {
    public  static void main(String[] args) {
        String finder = "the boy from west virginia is fat as fuck";
        String searcher = "Fuck";
        int newFinder = finder.length();
        int newsearcher = searcher.length();
        boolean findit = false;

        for(int i =0; i < (newFinder - newsearcher); i++){
            if(finder.regionMatches(true, i, finder, 37, newsearcher)){
                findit = true;
                System.out.println(finder.substring(i + i + newsearcher));
                break;
            }
        }
        if(!findit) {
            System.out.println("cant find the given word");
        }

    }
}

class findLongestCommonSequence{

    static int findLongestCommonSequences(int[] arr, int len) {

        ArrayList <Integer> v = new ArrayList<>(arr.length);
        v.add(arr[0]);
        int count = 0;
        int result = 0;
        for(int i = 0; i < len; i++) {
            if(arr[i] != arr[ i + 1]) {
                v.add(arr[i]);
            }
        }
        for(int i = 1; i < v.size(); i++) {
            if(i > 0 && v.get(i) == v.get(i + 1) + 1){
                count++;
            } else {
                count = 1;
            }
            result  = Math.max(result, count);
        }
        return result;

        // get the maximum count
    }


    public static void main(String[] args) {
        int[] arr = {3, 4, 5,4, 3, 12,2, 5, 6 ,6, 7, 8, 5, 4, 7, 9};
        int n = arr.length;
        System.out.println(STR."the longest common sequence is \{findLongestCommonSequences(arr, n)}");
    }
}
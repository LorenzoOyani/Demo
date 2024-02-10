package others;
public class bubbleSort {
    int[] list;
    void main(){
        list = new int[]{1, 4, 3, 5, 6, 8, 9};
        int n = list.length;
        bubbleSort bs = new bubbleSort();
        bs.BubbleSort(list, n );
        for(int i = 0; i < list.length; i++){
            System.out.println(STR."\{list[i]} ");
        }
//        System.out.println("The sorted arrays is:  " +l );

    }

    void BubbleSort(int[] list, int size){
      for(int i = 0; i < size - 1; i++) {
          for(int j = 0; j < size - i - 1; j++) {
              if(list[j] > list[j + 1]) {
                  int temp = list[j];
                  list[j] = list[j + 1];
                  list[j + 1] = temp;
              }
          }

      }
    }

}

package Exercise;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class shuffle {
    void main(){
        ArrayList<Integer>lists = new ArrayList<>();
        lists.add(60);
        lists.add(460);
        lists.add(230);
        lists.add(10);
        lists.add(890);
        lists.add(450);
        lists.add(670);
        System.out.println(lists.toString());
        shuffle(lists);
        System.out.println(lists.toString());
        Calendar calendar = new GregorianCalendar();

    }

    public void shuffle(ArrayList<Integer> list){
        java.util.Collections.shuffle(list);
    }
}
package others;

import java.util.Date;
import java.util.Random;

class  Tv {
    boolean on = false;
    int volume = 1;
    int channel = 1;
    public Tv() {

    }
    public void setChanel(int newChannel) {
        channel = newChannel;

    }
    public void volumeUp() {
        if(on && volume < 7) {
            volume ++;
        }
    }

    public int volumeDown() {
        return (on && volume > 1 ? volume++ : volume--);
    }

    public int getChannel() {
        return channel;
    }
}

class clock{
   static double[] arr = {3.4 ,4.2, 1.3, 5.4, 2.5, 6};
    public static void main(String[] args){
        Date date = new Date();
        System.out.println(STR."The Elapsed time since jan 1, 1970 is \{date.getTime()} milliseconds");
        System.out.println(String.valueOf(date.toString()));

        Random random = new Random(3);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(random.nextDouble(1000) + " " );
        }
    }

}
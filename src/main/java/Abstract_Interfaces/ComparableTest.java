package Abstract_Interfaces;

import java.awt.*;

public class ComparableTest extends Rectangle implements Comparable<ComparableTest> {
    private int width = 0;
    private int height= 0;

//    public void ComparableTest(){
//         this(3, 7);
//    }


    public ComparableTest(int width, int height){
        super(width, height);
        setWidth(width);
        setHeight(height);

    }

    public void ComparableTest(int width, int height){
        this.width = width;
        this.height = height;
    }


    @Override
    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getArea(){
        return   width * height;
    }

    @Override
    public int compareTo(ComparableTest o) {
        if(getArea() > o.getArea()){
            return 1;
        }else if(getArea() < o.getArea()){
            return -1;
        }else {
            return 0;
        }
    }
@Override
    public String toString(){
        return STR."\{super.toString()}\nArea : \{getArea()}";
    }
}
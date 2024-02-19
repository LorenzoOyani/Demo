package Abstract_Interfaces;

import java.util.Date;

public class House implements java.lang.Cloneable, Comparable<House> {
    private int id;
    private double area;
    private Date whenBuilt = new Date();

    public House(int id, double area) {
    }

    void main() throws CloneNotSupportedException {
        House house1 = new House(1, 90.5);
        House house2 = (House) house1.clone();
        System.out.println(house2 + "");
    }

    public House() {
    }

    public void House(int id, double area) {
        this.id = id;
        this.area = area;

    }

    //    public  House(){
//       this(2, 90.5);
//    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Date getWhenBuilt() {
        return whenBuilt;
    }

    public void setWhenBuilt(Date whenBuilt) {
        this.whenBuilt = whenBuilt;
    }


@Override
    public Object clone() {
        try {
            House houseClone = (House) super.clone();
            houseClone.whenBuilt = (Date) whenBuilt.clone();
            return houseClone;
        } catch (CloneNotSupportedException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    @Override
    public int compareTo(House o) {
        if(getArea() > o.getArea()){
            return 1;
        } else if(getArea() < o.getArea()){
            return -1;
        }else{
            return 0;
        }
    }
}
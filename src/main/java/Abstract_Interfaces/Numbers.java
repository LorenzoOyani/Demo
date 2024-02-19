package Abstract_Interfaces;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;

public class Numbers {
    void main(){
        ArrayList<Number> list = new ArrayList<>();
        list.add(345.2);
        list.add(7543);
        list.add(new BigInteger("2345676543"));
        list.add(new BigDecimal("33345676"));
//        Numbers num1 = new Numbers();
        System.out.println("The biggest number is "+ greatestNumber(list));
    }

  public Number greatestNumber(ArrayList<Number> list) {
        if(list == null || list.size() == 0){
            return 0;
        }
        Number num1 = list.get(0);
        for(int i = 0; i < list.size(); i++){
            if(num1.doubleValue() < list.get(i).doubleValue()){
                num1 = list.get(i);
            }
        }
        return num1;
//      Calendar
  }


}
package Generics;

public class Max_Generics {
    void main(){
        Generics<Number> stack = new Generics();

        stack.push(56);
        stack.push(23);
        stack.push(90);
        System.out.println("The maximum of the objects is "+ max(stack));
    }

    public static double max(Generics<Number> stack){
        double max = stack.pop().doubleValue();
        while(!stack.isEmpty()){
            double value = stack.pop().doubleValue();
            if(max > value){
                max = value;
            }
        }
        return max;

    }
}
package ExecptionHandling;

/**
 * Java exception handling process involves three processes, declaring exception, throwing exception, and catching an exception.
 *
 * */

public class Throwables{
    void main(){
        try{
            System.out.println(sum(new int[]{2,5,6,2,8,9}));

        }catch(Exception ex) {
            ex.printStackTrace();
            System.out.println(STR."\n\{ex.getMessage()}");
            System.out.println(STR."\n\{ex.toString()}");

            StackTraceElement[] stackElements = ex.getStackTrace();
            for(int i = 0; i < stackElements.length; i++) {
                System.out.println(STR."Method \{stackElements[i].getMethodName()}");
                System.out.println(STR."className\{stackElements[i].getClassName()}");
                System.out.println(STR."\{stackElements[i].getLineNumber()} ");
            }

        }

    }
    public int sum(int[] lists) {
        int sum = 0;
        for(int i = 0; i <lists.length; i++) {
            sum += lists[i];
        }
        return sum;
    }
}
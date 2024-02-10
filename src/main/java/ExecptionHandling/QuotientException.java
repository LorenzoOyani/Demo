package ExecptionHandling;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Throwable;

public class QuotientException {
    void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

      try{
          int result = quotient(number1, number2);
          System.out.println("The divisor of "+ number1 + "/" + number2 + " is " + result);
      }catch(ArithmeticException exception){
          System.out.println(exception.getMessage());
          System.out.print("Exception continues....\n");
          System.out.println("Error: cannot be divisible by zero.");
      }catch (InputMismatchException ex){
          System.out.println(ex.getMessage());
          System.out.println("cannot be float");
      }
    }

    public int quotient(int num1, int num2) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        boolean continueInput = true;

        do {
            try {

                if (num2 == 0) {
                    throw new ArithmeticException("Divisor must not be zero");
                }else if(num1 == (float)num1){
                    throw new InputMismatchException("change to an integer");
                }
                else {
                    result = (num1 / num2);
                    continueInput = false;

                }


            } catch (ArithmeticException exception) {
                System.out.println(exception.getMessage());
                System.out.println("try again: an integer is required.");
                sc.nextLine();

            } catch (InputMismatchException ex) {
                System.out.println(ex.getMessage());
                System.out.println("Try again: Enter an integer");
                sc.nextLine();
            }


        } while (continueInput);


    return result;
    }

}
// further research required.
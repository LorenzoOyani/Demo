package ExecptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch  {

    void main(){
        Scanner sc = new Scanner(System.in);

        int input;
        boolean continueInput = true;
        do{
            try{
                System.out.print("Enter an integer: ");
                input = sc.nextInt();
                System.out.println("The number entered is "+ input);
                continueInput = false;

            }catch(InputMismatchException ex){
                System.out.println(" try again, an integer is required: ");
                sc.nextLine();

            }

        }while(continueInput);
    }
}


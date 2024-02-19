package ExecptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch  {

    void main(){
        Scanner sc = new Scanner(System.in);

        int input;
        boolean continueTyping = true;
        do{
            try{
                System.out.println("Enter an integer: ");
                input = sc.nextInt();
                System.out.println("The input is "+ input);
                continueTyping = false;

            }catch(InputMismatchException e){
                System.out.println("input error: Enter an int");
                sc.nextLine();
            }
        }while(continueTyping);

    }
}


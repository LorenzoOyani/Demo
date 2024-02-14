package Exercise;

import java.util.Scanner;

public class isPrime {


    void main() {
        Scanner sc = new Scanner(System.in);
        final int NUMBER_PER_LINES = 10;
        int n = sc.nextInt();
        int number = 2; // number to test for prime.
        int count = 0;
//        boolean isPrime = false;
        while (number <= n) {
            boolean isPrime = true;
            for (int divisor = 2; divisor <= (int) Math.sqrt(number); divisor++) {
                if (number % divisor == 0) { // check if it is a prime number.
                    isPrime = false;
                    break;

                }
            }
            if (isPrime) {
                count++;
                if (count % NUMBER_PER_LINES == 0) {
                    System.out.printf("%-7d", number);
                } else {
                    System.out.printf("%-7d", number);
                }
                number++;
            }

        }
        System.out.println("\ncount " + count + "primes is less than or equal to " + n);


    }
}
// class SquareRootExample {
//    public static void main(String[] args) {
//        // Example 1: Calculate the square root of a specific value
//        double inputValue = 25.0;
//        double sqrtResult = Math.sqrt(inputValue);
//        System.out.println("Square root of " + inputValue + " is: " + sqrtResult);
//
//        // Example 2: Use the square root in a calculation
//        double sideLength = 9.0;
//        double area = Math.sqrt(sideLength) * Math.sqrt(sideLength);
//        System.out.println("Area of a square with side length " + sideLength + " is: " + area);
//    }
//}

class prime{
    void main(){
        int number =2;
        int number_per_lines = 10;
        int count = 0;
        boolean isPrime = true;
        for(int divisor = 2; divisor <= (int)(Math.sqrt(number)); divisor++){
            if(number % divisor == 0){
                isPrime = false;
                break;
            }
            if(isPrime){
                count++;
                if(count % number_per_lines == 0){
                    System.out.printf("%-7d", number);
                }else{
                    System.out.printf("%-7d", number);

                }
                number++;

            }
        }
    }
}
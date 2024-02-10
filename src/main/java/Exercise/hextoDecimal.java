package Exercise;

import java.util.Scanner;

public class hextoDecimal {
    public static int hexToDecimal(String hex) throws NumberFormatException {
        double decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            if (!(hex.charAt(i) >= '0' && hex.charAt(i) <= '9') ||
                    !(hex.charAt(i) >= 'A' && hex.charAt(i) <= 'F')) {
//                String hexi = (char)hex.charAt(i);
                throw new NumberFormatException();
            }
            char hexi = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexiToDecimal(hexi);
        }
        return (int) decimalValue;
    }

    public static int hexiToDecimal(char hex) {
        if (hex >= 'A' && hex <= 'F') {
            return 10 + hex - 'A';
        } else {
            return hex - '0';
        }
    }

    void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an hex value: ");
        String hex = sc.nextLine();

        try {
            System.out.println("The hex is " + hex + ":" + hexToDecimal(hex.toUpperCase()));
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
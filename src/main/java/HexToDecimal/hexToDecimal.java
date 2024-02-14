package HexToDecimal;

import java.io.PrintWriter;
import java.util.Scanner;

public class hexToDecimal {
    void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an hex value: ");
        String hex = sc.nextLine();

        try {
            System.out.println("The hex decimal is " + hex + hexToDecimals(hex.toUpperCase()));
        } catch (HexDecimalException e) {
            System.out.println(e.getMessage());

        }
    }

    public int hexToDecimals(String hex) throws HexDecimalException {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            if (!(hex.charAt(i) >= 'A' && hex.charAt(i) <= 'F') || !(hex.charAt(i) >= '0' && hex.charAt(i) <= '9')) {
                throw new HexDecimalException(hex);
            }
            char hexs = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexToTrueDecimal(hexs);
        }
        return decimalValue;
    }

    public int hexToTrueDecimal(char hex) {
        if (hex >= 'A' && hex <= 'F') {
            return 10 + hex - 'A';
        } else {
            return hex - '0';
        }
    }
}


class HexiDcimalValues {
    void main() {

        /**
         * ordinarily, you are trying to read an hex value from a scanner,
         * and you are to handle exception manually, hence it exceptions can be thrown by accessing the Exception superclass and modifying
         * it to suit our class by creating a constructor anc calling it on our exception class.
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an hex value: ");
        String hex = sc.nextLine();

        try (PrintWriter output = new PrintWriter(hex)) {
            System.out.println("the hex " + hex + hexToDecima(hex.toUpperCase()));
        } catch (HexDecimalException e) {
            System.out.println(hex + e.getMessage());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    public int hexToDecima(String hex) throws Exception {
        int DecimaValues = 0;
        for (int i = 0; i < hex.length(); i++) {
            if (!(hex.charAt(i) >= 'A' && hex.charAt(i) <= 'F') || !(hex.charAt(i) >= '0' && (hex.charAt(i) <= '9'))) {
                throw new HexDecimalException(hex);
            }
            char hexiss = hex.charAt(i);
            DecimaValues = DecimaValues * 16 + hexToTrueDecima(hexiss);
        }
        return DecimaValues;

    }

    public int hexToTrueDecima(char hex) {
        if (hex >= 'A' && hex <= 'F') {
            return 10 + hex - 'A';
        } else {
            return hex - '0';
        }

    }

}
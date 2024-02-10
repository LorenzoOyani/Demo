package HexToDecimal;

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
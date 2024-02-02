package Handle_Strings.java;

import java.math.BigInteger;

public class BigInt {
    public static void main(String[] args) {
        BigInteger i = new BigInteger(STR."\{Long.MAX_VALUE} ");
        BigInteger end = i.add(new BigInteger("10"));

        for (i = new BigInteger(Long.MAX_VALUE + ""); i.compareTo(end) <= 0; i.add(new BigInteger("1"))) {
            System.out.println(i.multiply(i));
        }

    }
}
package Abstract_Interfaces;

import CircleObjects.Triangle;

import java.awt.*;
import java.math.BigInteger;
import java.util.Arrays;

public class sortComparable {
    void main() {
        String[] citites = {"london", "new York", "chicago"};
        java.util.Arrays.sort(citites);
        for (String city : citites) {
            System.out.println(STR."\{city} ");

            BigInteger[] integers = {new BigInteger("945654334"), new BigInteger("5478933"), new BigInteger("93388475")};
            Arrays.sort(integers);
            for (Number num : integers) {
                System.out.println(STR."\{num} ");
            }
            ComparableTest[] comparable = {new ComparableTest(45, 89), new ComparableTest(90, 56),
                    new ComparableTest(65, 83)};

            Arrays.sort(comparable);

            for (Rectangle compare : comparable) {
                System.out.println(STR."\{compare} ");
            }

            BigInteger n1 = new BigInteger("89236540393939");
            BigInteger n2 = new BigInteger("9089834532");
            System.out.println(n1.compareTo(n2));


        }

    }
}

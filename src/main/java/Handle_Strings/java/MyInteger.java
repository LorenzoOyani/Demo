package Handle_Strings.java;

public class MyInteger {
    private int value;

    MyInteger(int value) {
        this.value = value;
    }

    MyInteger() {
    }

    public int getValue() {
        return value;
    }

    public boolean isPrime() {
        return isPrime(value);
    }

    public boolean isOdd() {
        return isOdd(value);
    }

    public boolean isEven() {
        return isEven(value);
    }

    public boolean isPrime(MyInteger myInteger) {
        return myInteger.isPrime();
    }


    public boolean isOdd(MyInteger myInteger) {
        return myInteger.isOdd();
    }

    public boolean isEven(MyInteger myInteger) {
        return myInteger.isEven();
    }

    public boolean isPrime(int value) {
        for (int divisor = 2; divisor <= value; divisor++) {
            if (value % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public int parseInt(char[] chars) {
        int value = 0;
        int j = (int) (Math.pow(10, chars.length - 1));
        for (int i = 0; i < chars.length; i++, j /= 10) {
            value += chars[i] - (48 * j);
        }
        return value;
    }

    public int parseInt(String str) {
        int values = 0;
        int j = (int) (Math.pow(10, str.length()));
        for (int i = 0; i < str.length(); i++, j /= 10) {
            values = str.charAt(i) - (48 * j);
        }
        return values;
    }

    public boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public boolean isEven(int value) {
        return value % 2 == 0;
    }

}
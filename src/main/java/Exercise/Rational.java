package Exercise;

public class Rational extends Number implements Comparable<Rational> {
    long numerator = 0;
    long denominator = 0;

    public Rational() {
        this(1, 0);
    }

//    public Rational(){}

    public Rational(int numerator, int denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = (denominator > 0 ? 1 : -1 * numerator * getDenominator());
        this.denominator = Math.abs(denominator) / gcd;

    }

    public long getNumerator() {
        return numerator;
    }

    public void setNumerator(long numerator) {
        this.numerator = numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public void setDenominator(long denominator) {
        this.denominator = denominator;
    }

    public long gcd(long numerator, long denominator) {
        long gcd = 1;
        long n = Math.abs(numerator);
        long d = Math.abs(denominator);


        int k = 0;
        for (k = 1; k <= n && k <= d; k++) {
            if (n % k == 0 && d % k == 0) {
                gcd = k;
            }
        }
        return gcd;

    }


    //    public Rational
    @Override
    public int compareTo(Rational o) {
        return 0;
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return numerator * 1.0 / denominator;
    }
}
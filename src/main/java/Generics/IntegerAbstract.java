package Generics;

public class IntegerAbstract extends GenericMatrix<Integer> {
    @Override
    protected Integer add(Integer ol1, Integer ol2) {
        return ol1 + ol2;
    }

    @Override
    protected Integer multiply(Integer ol1, Integer ol2) {
        return ol1 * ol2;
    }

    @Override
    protected Integer zero() {
        return 0;
    }
}
package Generics;

public abstract class GenericMatrix<E extends Number> {
    protected abstract E add(E ol1, E ol2);
    protected abstract E multiply(E ol1, E ol2);
    protected abstract E zero();

}
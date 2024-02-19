package Abstract_Interfaces;

/**
 * All comparable object has a compareTo method to compare, Strings, Numbers and Dates.
 * The comparable interface is a generic interface.
 * */
public class comparable extends Object implements Comparable<String>{


    @Override
    public int compareTo(String o) {
        return 0;
    }
}
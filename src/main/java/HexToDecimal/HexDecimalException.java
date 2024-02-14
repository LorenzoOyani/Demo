package HexToDecimal;

/**
 * You can extend the Exception Class to handle your own
 * exception handling by modifying the constructor of the present class by calling the super class constructor.
 * A classic example of Abstraction and Inheritance.
 * */

public class HexDecimalException  extends Exception{

    private String hex;

    HexDecimalException(String hex) {
        super(hex + " is not a hex string");
        this.hex = hex;
    }

    public String getHex(){
        return hex;
    }
}
package HexToDecimal;

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
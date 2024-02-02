package Exercise;

public class Stock{
    public String symbol;
    public String name;
    public int currentPrice;
    public int differences;

    Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    Stock(){
        this("ORL", "Oracle company");
    }
    public double getDifferencesInPrices() {
        return  ((double) (currentPrice - differences) / differences) * 100 ;
    }

    public static void main(String[] args){
        Stock stocks = new Stock();
        stocks.currentPrice = 34;
        stocks.differences = 12;
        System.out.print("\nstocks symbol:\n" +stocks.symbol);
        System.out.print("\nstock name: \n"  +stocks.name);
        System.out.printf("\nThe percentage of the differences is: %.2f%%\n", stocks.getDifferencesInPrices());
    }


}
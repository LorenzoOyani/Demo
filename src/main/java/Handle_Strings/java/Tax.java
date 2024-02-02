package Handle_Strings.java;

/************************************************
 *                   Tax                         *
 *-----------------------------------------------*
 * -filingStatus: int                            *
 * +SINGLE_FILER: int                            *
 * ------------------                            *
 * +MARRIED_JOINTLY_OR_QUALIFYING_WIDOW(ER): int *
 * --------------------------------------------- *
 * +MARRIED_SEPARATELY: int                      *
 * ------------------------                      *
 * +HEAD_OF_HOUSEHOLD: int                       *
 * -----------------------                       *
 * -brackets: int[][]                            *
 * -rates: double[]                              *
 * -taxableIncome: double                        *
 * +Tax()                                        *
 * +Tax(filingStatus: int, brackets: int[][],    *
 *      rates: double[], taxableIncome: double)  *
 * +getFilingStatus(): int                       *
 * +setFilingStatus(status: int)                 *
 * +getBrackets(): int[][]                       *
 * +setBrackets(brackets: int[][])               *
 * +getRates(): int[]                            *
 * +setRates(rates: int[])                       *
 * +getTaxableIncome(): double                   *
 * +setTaxableIncome(taxableIncome: double)      *
 * +getTax(): double                             *
 ************************************************/

public class Tax {
    private final int SINGLE_FILER = 1;
    private final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
    private final int MARRIED_SEPARATELY = 2;
    private final int HEAD_OF_HOUSEHOLD = 3;

    int[][] brackets;
    double[] rates;
    double taxIncome = 0;
    private int fillingStatus;

    Tax() {
        // Default filing status
        fillingStatus = SINGLE_FILER;

        // Default tax rates
        double[] currentYearRates = {10, 15, 25, 28, 33, 35};

        setRates(currentYearRates);

        // Default brackets for each rate for all the filing statuses
        int[][] currentYearBrackets = {
                {8350, 33950, 82250, 171550, 372950},  // Single filer
                {16700, 67900, 137050, 20885, 372950}, // Married jointly
                // -or qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475},  // Married separately
                {11950, 45500, 117450, 190200, 372950} // Head of household
        };
        setBrackets(currentYearBrackets);

        // Default taxable income
        taxIncome = 0;

    }
    Tax(int fillingStatus, int[][] brackets, double[] rates, double taxIncome) {
        setFillingStatus(fillingStatus);
        setBrackets(brackets);
        setRates(rates);
        setTaxIncome(taxIncome);
    }
    int setFillingStatus(int fillingStatus) {
        return this.fillingStatus = fillingStatus;
    }
    public void setBrackets(int[][] brackets) {
//        this.brackets = new int[brackets[fillingStatus][0], brackets[]];
        this.brackets = new int[brackets.length][brackets[0].length];
        for(int i = 0; i < brackets.length; i++) {
            for(int j = 0; j < brackets.length; i++) {
                brackets[i][j] = brackets[i][j];
            }
        }

    }
    public void setRates(double[] rates) {
        this.rates = new double[rates.length];
        for(int i =0; i < rates.length; i++) {
            this.rates[i] = rates[i] / 100;
        }

    }
    public double setTaxIncome(double taxIncome) {
        return this.taxIncome = taxIncome;
    }
    public int[][] getBrackets() {
        return brackets;
    }

    public double[] getRates() {
        return rates;
    }

    double getTax(){
        double tax = 0, incomeTax = 0;
        double income = taxIncome;
        if(rates.length >= 2) {
            for(int i = rates.length - 2; i >=0; i--) {
                if(income > brackets[fillingStatus][0]){
                    tax += (incomeTax = income - brackets[fillingStatus][0]) * rates[i + 1];
                    income -=incomeTax;
                }

            }
        }
        return tax += brackets[fillingStatus][0] * rates[0];

    }


}
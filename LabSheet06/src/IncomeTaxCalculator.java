public class IncomeTaxCalculator {
    private double income;
 
    public void setIncome(double incomemoney) {
        income = incomemoney;
 
    }
 
    public double calculateTax() {
        if (income < 150000) {
            return 0;
        }
        else if (income > 150000 && income <= 300000) {
            return (income - 150000) * 0.05;
        }
        else if (income > 300000 && income <= 500000) {
            return ((300000 - 150000) * 0.05) + ((income - 300000) * 0.1);
        }
        else {
            return ((300000 - 150000) * 0.05) + ((500000 - 300000) * 0.1) + ((income - 500000) * 0.2);
        }
 
    }
 
    public void displayTaxCalculator() {
        System.out.println("Income: " + income);
        System.out.println("Tax: " + calculateTax());
 
    }
 
 
}
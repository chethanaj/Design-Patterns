
public class Loan {
    private double amount;
    private int number;
    private String purpose;

    public double getAmount() {
        return amount;
    }


    public int getNumber() {
        return number;
    }


    public String getPurpose() {
        return purpose;
    }


    public Loan(double amount, int number, String purpose) {
        this.amount = amount;
        this.number = number;
        this.purpose = purpose;
    }
}

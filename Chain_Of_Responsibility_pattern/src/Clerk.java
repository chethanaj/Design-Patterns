public class Clerk extends Handler {

    @Override
    public int loanHandler(Loan loan) {
        if(loan.getAmount()<=100_000){
            System.out.println("Loan handled by Clerk");
            return loan.getNumber();
        }else {
            return successor.loanHandler(loan);
        }
    }
}

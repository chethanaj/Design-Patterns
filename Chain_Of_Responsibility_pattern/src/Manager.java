public class Manager extends Handler {

    @Override
    public int loanHandler(Loan loan) {
        if(loan.getAmount()>500_000 && loan.getAmount()<10_00_000){
            System.out.println("Loan handled by Manager");
            return loan.getNumber();
        }else {
            return successor.loanHandler(loan);
        }
    }
}

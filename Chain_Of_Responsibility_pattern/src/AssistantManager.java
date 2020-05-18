public class AssistantManager extends Handler {

    @Override
    public int loanHandler(Loan loan) {
        if(loan.getAmount()>100_000 && loan.getAmount()<=500_000){
            System.out.println("Loan handled by Assistant Manager");
            return loan.getNumber();
        }else {
            return successor.loanHandler(loan);
        }
    }
}

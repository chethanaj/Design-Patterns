public class Position extends Handler {
    @Override
    public int loanHandler(Loan loan) {
        return successor.loanHandler(loan);
    }
}

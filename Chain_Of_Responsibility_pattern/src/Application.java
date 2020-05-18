public class Application {
    public static void main(String[] args) {

        Clerk clerk=new Clerk();
        AssistantManager assistantManager=new AssistantManager();
        Manager manager=new Manager();
        Position position=new Position();

        position.setSuccessor(clerk);
        clerk.setSuccessor(assistantManager);
        assistantManager.setSuccessor(manager);

        Loan loan=new Loan(80_000,1,"Build a house");
        System.out.println(position.loanHandler(loan));

        Loan loan2=new Loan(290_000,2,"Education loan");
        System.out.println(position.loanHandler(loan2));

        Loan loan3=new Loan(850_000,3,"Buy a car");
        System.out.println(position.loanHandler(loan3));

        Loan loan4=new Loan(110_000,4,"For a wedding");
        System.out.println(position.loanHandler(loan4));

        Loan loan5=new Loan(20_000,5,"Go aboard");
        System.out.println(position.loanHandler(loan5));
    }
}

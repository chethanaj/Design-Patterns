public class Application {
    public static void main(String[] args) {

        Combo combo=ComboFactory.getCombo(ComboCode.BURGER);
        System.out.println(combo);

        Combo combo1=ComboFactory.getCombo(ComboCode.RICE);
        System.out.println(combo1);

        Combo combo2=ComboFactory.getCombo(ComboCode.WRAPS);
        System.out.println(combo2);


    }
}

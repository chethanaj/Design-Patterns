public class BurgerCombo extends Combo {

    @Override
    protected void createCombo() {
        food.add(new Burger());
        food.add(new Pepsi());
    }
}

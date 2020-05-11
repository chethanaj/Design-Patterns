public class WrapsCombo extends Combo {

    @Override
    protected void createCombo() {
        food.add(new BBQWraps());
        food.add(new Pepsi());
        food.add(new Drumlet());
    }
}

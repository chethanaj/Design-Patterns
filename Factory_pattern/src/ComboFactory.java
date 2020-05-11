
public class ComboFactory {

    public static Combo getCombo( ComboCode comboCode){

        switch (comboCode){
            case RICE:
                return new RiceCombo();
            case WRAPS:
                return new WrapsCombo();
            case BURGER:
                return new BurgerCombo();
                default:
                    return null;
        }


    }
}

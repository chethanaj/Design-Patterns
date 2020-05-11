import java.util.ArrayList;
import java.util.List;

public abstract class Combo {

    protected List<Food> food=new ArrayList<>();

    public Combo(){
        createCombo();
    }

    protected abstract void createCombo();

    @Override
    public String toString() {
        return "Combo{" +
                "food=" + food +
                '}';
    }
}

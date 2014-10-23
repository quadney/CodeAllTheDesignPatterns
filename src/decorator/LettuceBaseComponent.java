package decorator;

/**
 * Created by ssyyddnneeyy on 10/23/14.
 */
public class LettuceBaseComponent extends SandwichBaseComponent {

    public LettuceBaseComponent(){

    }
    @Override
    public void render() {
        System.out.println("Lettuce Unwich base");
    }

    @Override
    public double getAdditionalCost() {
        return 0;
    }
}

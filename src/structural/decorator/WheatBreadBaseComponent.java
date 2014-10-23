package structural.decorator;

/**
 * Created by ssyyddnneeyy on 10/23/14.
 */
public class WheatBreadBaseComponent extends SandwichBaseComponent {

    public WheatBreadBaseComponent(){

    }
    @Override
    public void render() {
        System.out.println("WheatBread base");
    }

    @Override
    public double getAdditionalCost() {
        return .5;
    }
}

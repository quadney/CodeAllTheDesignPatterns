package decorator;

/**
 * Created by ssyyddnneeyy on 10/23/14.
 */
public class WhiteBreadBaseComponent extends SandwichBaseComponent {

    public WhiteBreadBaseComponent(){

    }
    @Override
    public void render() {
        System.out.println("WhiteBread base");
    }

    @Override
    public double getAdditionalCost() {
        return 0;
    }
}

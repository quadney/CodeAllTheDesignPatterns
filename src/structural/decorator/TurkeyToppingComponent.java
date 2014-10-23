package structural.decorator;

/**
 * Created by ssyyddnneeyy on 10/22/14.
 */
public class TurkeyToppingComponent extends Decorator {

    public TurkeyToppingComponent(Sandwich c) {
        super(c);
    }

    @Override
    public void render() {
        getParent().render();
        System.out.println("\n adding Turkey");
    }

    @Override
    public double getAdditionalCost() {
        return 0;
    }
}

package decorator;

/**
 * Created by ssyyddnneeyy on 10/22/14.
 */
public class LettuceToppingComponent extends Decorator {

    public LettuceToppingComponent(Sandwich c) {
        super(c);
    }

    @Override
    public void render() {
        getParent().render();
        System.out.println("\n adding Lettuce");
    }

    @Override
    public double getAdditionalCost() {
        return 0;
    }
}

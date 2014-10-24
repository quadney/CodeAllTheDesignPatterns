package structural.decorator;

/**
 * Created by ssyyddnneeyy on 10/23/14.
 */
public class MayCondimentComponent extends Decorator {

    public MayCondimentComponent(Sandwich c) {
        super(c);
    }

    @Override
    public void render() {
        getParent().render();
        System.out.println("\n adding Mayo");
    }

    @Override
    public double getAdditionalCost() {
        return 0;
    }
}

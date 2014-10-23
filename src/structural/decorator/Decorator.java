package structural.decorator;

/**
 * Created by ssyyddnneeyy on 10/22/14.
 */
public abstract class Decorator implements Sandwich {
    private Sandwich parent;

    public Decorator(Sandwich c){
        parent = c;
    }

    protected Sandwich getParent(){
        return parent;
    }

}

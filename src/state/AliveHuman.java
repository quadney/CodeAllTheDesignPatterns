package state;

/**
 * Created by ssyyddnneeyy on 10/23/14.
 */
public class AliveHuman extends Human {

    public AliveHuman(){
        displayState();
    }
    @Override
    public void die() {
        currentState = new JustDiedHuman();
    }

    @Override
    public void displayState() {
        System.out.println("Human is Alive and well");
    }
}

package behavioral.state;

/**
 * Created by ssyyddnneeyy on 10/23/14.
 */
public class AliveZombie extends Zombie {

    public AliveZombie(){
        displayState();
    }

    @Override
    public void die() {
        currentState = new StunnedZombie();
    }

    @Override
    public void displayState() {
        System.out.println("Human is a Zombie! Ugrrghhg");
    }
}

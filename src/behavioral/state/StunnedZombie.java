package behavioral.state;

/**
 * Created by ssyyddnneeyy on 10/23/14.
 */
public class StunnedZombie extends Zombie {

    public StunnedZombie(){
        displayState();

        try {
            Thread.sleep(10000);
            die();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void die() {
        currentState = new AliveZombie();
    }

    @Override
    public void displayState() {
        System.out.println("Zombie is stunned! You have 10 seconds");
    }
}

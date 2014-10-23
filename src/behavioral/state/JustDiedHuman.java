package behavioral.state;

/**
 * Created by ssyyddnneeyy on 10/23/14.
 */
public class JustDiedHuman extends Human {

    public JustDiedHuman(){
        displayState();
        try {
            Thread.sleep(5000);
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
        System.out.println("Human just died! You have 5 seconds");
    }
}

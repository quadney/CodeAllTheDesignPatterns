package state;

/**
 * Created by ssyyddnneeyy on 10/23/14.
 */
public abstract class PersonState {
    protected PersonState currentState;
    public abstract void die();
    public abstract void displayState();
}

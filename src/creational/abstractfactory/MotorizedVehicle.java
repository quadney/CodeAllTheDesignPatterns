package creational.abstractfactory;

/**
 * Created by ssyyddnneeyy on 10/23/14.
 */
public abstract class MotorizedVehicle{
    private int numberWheels;
    private int cost;

    public MotorizedVehicle(int wheels, int cost){
        this.numberWheels = wheels;
        this.cost = cost;
    }

    public int getNumberWheels(){
        return numberWheels;
    }

    public int getCost(){
        return cost;
    }
}

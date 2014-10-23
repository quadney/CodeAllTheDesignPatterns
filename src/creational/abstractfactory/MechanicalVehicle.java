package creational.abstractfactory;

/**
 * Created by ssyyddnneeyy on 10/23/14.
 */
public abstract class MechanicalVehicle {
    private int numberWheels;
    private int cost;
    private int physicalExertion;

    public MechanicalVehicle(int wheels, int cost, int physicalExertion){
        this.numberWheels = wheels;
        this.cost = cost;
        this.physicalExertion = physicalExertion;
    }

    public int getNumberWheels(){
        return numberWheels;
    }

    public int getCost(){
        return cost;
    }

    public int getPhysicalExertion(){
        return physicalExertion;
    }
}

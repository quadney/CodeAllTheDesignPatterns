package creational.abstractfactory;

/**
 * Created by ssyyddnneeyy on 10/23/14.
 */
public class TwoWheeledFactory extends AbstractFactory {
    @Override
    public MotorizedVehicle createMotorizedVehicle() {
        return new Motorcycle();
    }

    @Override
    public MechanicalVehicle createMechanicalVehicle() {
        return new Bicycle();
    }
}

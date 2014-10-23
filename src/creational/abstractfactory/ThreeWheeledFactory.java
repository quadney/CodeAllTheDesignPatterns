package creational.abstractfactory;

/**
 * Created by ssyyddnneeyy on 10/23/14.
 */
public class ThreeWheeledFactory extends AbstractFactory {
    @Override
    public MotorizedVehicle createMotorizedVehicle() {
        return new Motortricycle();
    }

    @Override
    public MechanicalVehicle createMechanicalVehicle() {
        return new Tricycle();
    }
}

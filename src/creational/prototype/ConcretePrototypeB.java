package creational.prototype;

/**
 * Created by ssyyddnneeyy on 10/22/14.
 */
public class ConcretePrototypeB implements Prototype{

    public ConcretePrototypeB(){

    }

    @Override
    public Prototype clone() {
        System.out.println("Cloning a creational.prototype");
        ConcretePrototypeB cPrototypeB = null;

        try{
            cPrototypeB = (ConcretePrototypeB) super.clone();

        } catch(CloneNotSupportedException e){
            System.out.println("Prototype didn't extend clone");
            e.printStackTrace();
        }

        return cPrototypeB;
    }
}

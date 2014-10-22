package prototype;

/**
 * Created by ssyyddnneeyy on 10/22/14.
 */
public class ConcretePrototypeA implements Prototype {

    public ConcretePrototypeA(){

    }

    @Override
    public Prototype clone() {
        System.out.println("Cloning a prototype");
        ConcretePrototypeA cPrototypeA = null;

        try{
            cPrototypeA = (ConcretePrototypeA) super.clone();

        } catch(CloneNotSupportedException e){
            System.out.println("Prototype didn't extend clone");
            e.printStackTrace();
        }

        return cPrototypeA;
    }
}

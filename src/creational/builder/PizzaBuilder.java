package creational.builder;

public abstract class PizzaBuilder {
	abstract public void prepareTheDough();
    abstract public void slatherSauce();
    abstract public void sprinkleWithCheese();
    abstract public void sprinkleWithToppings();
    abstract public void bake();
    abstract public Product getProduct();
}
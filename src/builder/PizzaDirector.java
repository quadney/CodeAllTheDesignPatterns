package builder;

import dp.ImageFrame;

public class PizzaDirector {
	PizzaBuilder pizzaBuilder;
    private ImageFrame frame;

	public PizzaDirector(ImageFrame f){
        this.frame = f;
	}

	public void useBuilder(PizzaBuilder builder){
		this.pizzaBuilder = builder;
	}

	public void makeYummyPizza(){
        //construct
		pizzaBuilder.prepareTheDough();
		pizzaBuilder.slatherSauce();
		pizzaBuilder.sprinkleWithCheese();
		pizzaBuilder.sprinkleWithToppings();
        pizzaBuilder.bake();
	}

    public void makeAnimatedPizza(){
        new Thread(new Runnable(){
            public void run() {
                pizzaBuilder.prepareTheDough();
                repaintFrame();

                pizzaBuilder.slatherSauce();
                repaintFrame();

                pizzaBuilder.sprinkleWithCheese();
                repaintFrame();

                pizzaBuilder.sprinkleWithToppings();
                repaintFrame();

                pizzaBuilder.bake();
                repaintFrame();

            }
        }).start();
    }

    public void repaintFrame(){
        frame.setImage(pizzaBuilder.getProduct().getImage());
        frame.displayBufferedImage();
        try{
            Thread.sleep(1000);
        } catch(Exception e){

        }
    }
}
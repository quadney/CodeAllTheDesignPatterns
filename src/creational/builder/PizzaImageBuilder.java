package creational.builder;

import java.util.Random;
import java.awt.geom.*;
import java.awt.Graphics2D;
import java.awt.Color;

public class PizzaImageBuilder extends PizzaBuilder {
	private PizzaProduct pizzaProduct;
	private int width = 500;
	private int height = 500;

	public PizzaImageBuilder(){
        pizzaProduct = new PizzaProduct(width, height);
	}

	public void prepareTheDough(){
        System.out.println("Preparing the Dough");

		Graphics2D g2d = (Graphics2D) pizzaProduct.getImage().createGraphics();
		g2d.setColor(new Color(0xFFFFFFCC));
		g2d.fill(new Ellipse2D.Double(0, 0, width, height));
		g2d.dispose();
	}
	public void slatherSauce(){
        System.out.println("Slathering Sauce");

		Graphics2D g2d = (Graphics2D) pizzaProduct.getImage().createGraphics();
		g2d.setColor(Color.RED);
		int x = 20;
		g2d.fill(new Ellipse2D.Double(x, x, width - x*2, height - x*2));
		g2d.dispose();
	}
	public void sprinkleWithCheese(){
        System.out.println("Sprinkling with Cheese");

		Graphics2D g2d = (Graphics2D) pizzaProduct.getImage().createGraphics();
		g2d.setColor(Color.WHITE);
		Random rand = new Random();
		int x, y, thing1, thing2;

		for(int i = 0; i < 10000; i++){
			x = rand.nextInt(width - 20);
			y = rand.nextInt(height - 20);
			thing1 = rand.nextInt(10) - 5;
            thing2 = rand.nextInt(10) - 5;
			g2d.draw(new Line2D.Double(x, y, x+thing1, y+thing2));
		}
		g2d.dispose();
	}
	public void sprinkleWithToppings(){
        System.out.println("Sprinkle with Toppings");

		//jalapenos
		Graphics2D g2d = pizzaProduct.getImage().createGraphics();
		g2d.setColor(Color.GREEN);
		Random rand = new Random();
		int x, y;
		int jalaWidth = 20;
		for(int i = 0; i < 10; i++){
			x = rand.nextInt(width - 20);
			y = rand.nextInt(height - 20);

			g2d.fill(new Ellipse2D.Double(x, y, jalaWidth, jalaWidth));
		}
		g2d.dispose();
	}

    public void bake(){
        System.out.println("Baking the pizza");

    }

	public Product getProduct(){
		return pizzaProduct;
	}
}
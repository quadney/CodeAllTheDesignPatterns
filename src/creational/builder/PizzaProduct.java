package creational.builder;

import java.awt.image.BufferedImage;

/**
 * Created by ssyyddnneeyy on 10/22/14.
 */
public class PizzaProduct extends Product {
    BufferedImage pizza;

    public PizzaProduct(int width, int height){
        pizza = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
    }

    public BufferedImage getImage(){
        return pizza;
    }
}

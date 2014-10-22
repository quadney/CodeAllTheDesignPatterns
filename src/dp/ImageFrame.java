package dp;

import builder.PizzaDirector;
import builder.PizzaImageBuilder;
import prototype.ConcretePrototypeA;
import prototype.PrototypeFactory;

import java.awt.event.*;
import java.awt.image.*;

import javax.swing.*;

public class ImageFrame extends JFrame {
    BufferedImage image;
	
	public ImageFrame(){
		setTitle("Design Patterns Practice");
		setSize(600, 600);
		addMenu();
	}

	public void addMenu(){
		JMenu menu = new JMenu("File");

		JMenuItem builder = new JMenuItem("Builder");
		builder.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				performBuilder();
                SwingUtilities.invokeLater(new Runnable(){
                    public void run(){
                        repaint();
                    }
                });
			}
		});
		menu.add(builder);

        JMenuItem prototype = new JMenuItem("Prototype");
        prototype.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                performPrototype();
            }
        });
        menu.add(prototype);

		JMenuItem exit = new JMenuItem("Exit");
		exit.addActionListener(new ActionListener(){
			//this get's run on the EDT also!
			public void actionPerformed(ActionEvent event){
				System.exit(0);
			}
		});
		menu.add(exit);
		
		//attach menu to menu bar
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(menu);
		this.setJMenuBar(menuBar);
	}

	public void performBuilder(){
		//this class is the client
        PizzaImageBuilder builder = new PizzaImageBuilder();
        PizzaDirector director = new PizzaDirector(this);

        director.useBuilder(builder);

        System.out.println("making animated pizza");
        director.makeAnimatedPizza();

        //image = builder.getProduct();
	}

    public void performPrototype(){
        PrototypeFactory factory = new PrototypeFactory();

        // create a new prototype instance
        ConcretePrototypeA cPrototypeA = new ConcretePrototypeA();

        // clone the prototype
        ConcretePrototypeA clonedPrototype = (ConcretePrototypeA) factory.getClone(cPrototypeA);

        // clonedPrototype is a prototype of prototype
    }

    public void displayBufferedImage(){
        ImageIcon icon = new ImageIcon(image);
        JLabel label = new JLabel(icon);
        icon.setImage( image );
        label.repaint();
        setContentPane(label);
        validate();
    }

    public void setImage(BufferedImage image){
        this.image = image;
    }
}
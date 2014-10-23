package dp;

import builder.PizzaDirector;
import builder.PizzaImageBuilder;
import decorator.LettuceToppingComponent;
import decorator.Sandwich;
import decorator.TurkeyToppingComponent;
import decorator.WheatBreadBaseComponent;
import prototype.ConcretePrototypeA;
import prototype.PrototypeFactory;
import state.AliveHuman;
import state.AliveZombie;
import state.PersonState;

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
        JMenuBar menuBar = new JMenuBar();

        addCreationalPatterns(menuBar);
        addStructuralPatterns(menuBar);
        addBehavioralPatterns(menuBar);

		this.setJMenuBar(menuBar);
	}

    // ----------------------------------------------------------------------
    // CREATIONAL PATTERNS
    // ----------------------------------------------------------------------

    public void addCreationalPatterns(JMenuBar bar){
        JMenu creational = new JMenu("Creational Patterns");
        bar.add(creational);

        JMenuItem abstractFactory = new JMenuItem("Abstract Factory");
        abstractFactory.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                performAbstractFactory();
            }
        });
        creational.add(abstractFactory);

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
        creational.add(builder);

        JMenuItem factoryMethod = new JMenuItem("Factory Method");
        factoryMethod.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                performFactoryMethod();
            }
        });
        creational.add(factoryMethod);

        JMenuItem prototype = new JMenuItem("Prototype");
        prototype.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                performPrototype();
            }
        });
        creational.add(prototype);
    }

    // ----------------------------------------------------------------------
    // ----------------------------------------------------------------------

    private void performAbstractFactory() {
        //TODO
        throw new UnsupportedOperationException();
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

    public void performFactoryMethod(){
        //TODO
        throw new UnsupportedOperationException();
    }

    public void performPrototype(){
        PrototypeFactory factory = new PrototypeFactory();

        // create a new prototype instance
        ConcretePrototypeA cPrototypeA = new ConcretePrototypeA();

        // clone the prototype
        ConcretePrototypeA clonedPrototype = (ConcretePrototypeA) factory.getClone(cPrototypeA);

        // clonedPrototype is a prototype of prototype
    }

    // ----------------------------------------------------------------------
    // STRUCTURAL PATTERNS
    // ----------------------------------------------------------------------

    public void addStructuralPatterns(JMenuBar bar){
        JMenu structural = new JMenu("Structural Patterns");
        bar.add(structural);

        JMenuItem composite = new JMenuItem("Composite");
        composite.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                performComposite();
            }
        });
        structural.add(composite);

        JMenuItem decorator = new JMenuItem("Decorator");
        decorator.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                performDecorator();
            }
        });
        structural.add(decorator);
    }

    // ----------------------------------------------------------------------
    // ----------------------------------------------------------------------

    public void performComposite(){
        //TODO
        throw new UnsupportedOperationException();
    }

    public void performDecorator(){
        //TODO use a builder to have predefined sandwiches like at Jimmy John's
        Sandwich sandwich = new LettuceToppingComponent(new TurkeyToppingComponent(new WheatBreadBaseComponent()));
        sandwich.render();
    }

    // ----------------------------------------------------------------------
    // BEHAVIORAL PATTERNS
    // ----------------------------------------------------------------------

    public void addBehavioralPatterns(JMenuBar bar){
        JMenu behavioral = new JMenu("Behavioral Patterns");
        bar.add(behavioral);

        JMenuItem iterator = new JMenuItem("Iterator");
        iterator.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                performIterator();
            }
        });
        behavioral.add(iterator);

        JMenuItem state = new JMenuItem("State");
        state.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                performState();
            }
        });
        behavioral.add(state);

        JMenuItem strategy = new JMenuItem("Strategy");
        strategy.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                performStrategy();
            }
        });
        behavioral.add(strategy);

        JMenuItem templateMethod = new JMenuItem("Template Method");
        templateMethod.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                performTemplateMethod();
            }
        });
        behavioral.add(templateMethod);
    }

    // ----------------------------------------------------------------------
    // ----------------------------------------------------------------------

    public void performIterator(){
        //TODO
        throw new UnsupportedOperationException();
    }

    public void performState(){
        PersonState person = new AliveHuman();
        System.out.println("Human gets killed by Zombie!");
        person.die();

        PersonState zombie = new AliveZombie();
        System.out.println("Now we have a zombie:");
        zombie.die();
    }

    public void performStrategy(){
        //TODO
        throw new UnsupportedOperationException();
    }

    public void performTemplateMethod(){
        //TODO
        throw new UnsupportedOperationException();
    }

    // ----------------------------------------------------------------------
    // ----------------------------------------------------------------------

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
package prototype;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ssyyddnneeyy on 10/22/14.
 */
public class PrototypeFrame extends JFrame {
    JButton clonePrototype;
    ConcretePrototypeA cPrototypeA;
    PrototypeFactory prototypeFactory;

    public PrototypeFrame(){
        cPrototypeA = new ConcretePrototypeA();
        prototypeFactory = new PrototypeFactory();

        setLayout(new BorderLayout());

        clonePrototype = new JButton();
        clonePrototype.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){

            }
        });
        add(clonePrototype, BorderLayout.NORTH);
    }
}

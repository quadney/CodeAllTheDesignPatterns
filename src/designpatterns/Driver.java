package designpatterns;

import javax.swing.*;

public class Driver {
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable() {
			public void run(){
				createAndShowGUI();
			}
		} );
	}

	public static void createAndShowGUI(){
		JFrame frame = new ImageFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
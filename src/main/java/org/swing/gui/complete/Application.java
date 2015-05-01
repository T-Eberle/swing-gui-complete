package org.swing.gui.complete;

import org.swing.gui.complete.window.Frame;


public class Application {

	
	public static void main(String[] args) {
		Frame mainFrame = new Frame("Testframe");
		mainFrame.setSize(400, 400);
		mainFrame.setVisible(true);
	}
}

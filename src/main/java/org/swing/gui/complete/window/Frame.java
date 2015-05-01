package org.swing.gui.complete.window;

import javax.swing.JFrame;

public class Frame extends JFrame {

	public Frame(String frame) {

		super(frame);

		// 2. Optional: What happens when the frame closes?
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

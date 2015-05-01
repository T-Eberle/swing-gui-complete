package elroy.codefactory.swing.gui.complete.components.controls;

import javax.swing.JButton;

public class ElroyButton extends JButton {

	public ElroyButton(String name) {
		super(name);
		setName(name);
	}
	
	@Override
	public void setText(String text) {
		setName(text);
		super.setText(text);
	}
}

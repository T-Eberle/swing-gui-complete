package elroy.codefactory.swing.gui.complete.components.controls;

import javax.swing.JCheckBox;

public class ElroyCheckbox extends JCheckBox {

	public ElroyCheckbox(String name) {
		super(name);
		setName(name);
	}
	
	
	@Override
	public void setText(String text) {
		setName(text);
		super.setText(text);
	}
}

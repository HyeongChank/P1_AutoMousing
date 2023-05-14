package test;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class testmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame();
        JTextField textField = new JTextField();
        keylistenerTest listener = new keylistenerTest();

        textField.addKeyListener(listener);
        frame.add(textField);
        frame.pack();
        frame.setVisible(true);
    }
}
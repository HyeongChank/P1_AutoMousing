package test;

import javax.swing.JFrame;
import javax.swing.JTextField;


public class ExitKey {

	public void exitKey() {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
        JTextField textField = new JTextField();
        KeyboardListener2 listener = new KeyboardListener2();

        textField.addKeyListener(listener);
        frame.add(textField);
        frame.pack();
        frame.setVisible(true);
        
        while (true) {
	// 안에 마우스 클릭 이벤트도 다 넣어야 함
            if (listener.isSpaceBarPressed()) {
                break;
            }
        }
        frame.dispose();
    }
    



}

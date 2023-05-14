package test;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardListener2 extends KeyAdapter {
	private boolean spaceBarPressed = false;
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_SPACE) {
			System.out.println("스페이스바눌림");
			spaceBarPressed = true;
	
		}

	}
	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_SPACE) {
			spaceBarPressed = false;
		}
	}
	public boolean isSpaceBarPressed() {
		// TODO Auto-generated method stub
		return spaceBarPressed;
	}
}
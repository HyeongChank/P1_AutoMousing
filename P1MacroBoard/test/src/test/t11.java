package test;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class t11 implements KeyListener {
    private int flag = 0;

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
        	System.out.println("space bar 눌림");
            flag = 1;
            System.out.println("flag " + flag + "이 됨");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Do nothing
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Do nothing
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}

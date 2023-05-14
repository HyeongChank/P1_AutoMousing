package test;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class keylistenerTest extends KeyAdapter {
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            // 스페이스바를 눌렀을 때 실행할 코드 작성
            System.out.println("스페이스바 눌림");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            // 스페이스바를 떼었을 때 실행할 코드 작성
            System.out.println("스페이스바 떼어짐");
        }
    }
}


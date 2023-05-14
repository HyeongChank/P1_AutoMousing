package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyAdapter;
import java.awt.Robot;
import javax.servlet.http.HttpSession;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


class MyFrame extends JFrame {
	
    public MyFrame() {
        KeyboardListener2 keyListener = new KeyboardListener2();
        addKeyListener(keyListener);
 
        setFocusable(true);
        requestFocus();

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        MyFrame mF = new MyFrame();
    }
}

public class ExitKey extends KeyAdapter{
//	public KeyEvent ke;
//	public boolean isSpaceBarPressed = false;
//	public void keyPressed(KeyEvent e) {
//		if(e.getKeyCode()==KeyEvent.VK_SPACE) {
//			System.out.println("스페이스바눌림");
//			isSpaceBarPressed = true;
//		}
//	}

	
	public void exitKey(int roop, int x, int y, int q, int w, int e, int r, int delaysmall, int delayDC) {
		MyFrame mf = new MyFrame();
		Robot robot;
		try {
			robot = new Robot();
			JFrame frame = new JFrame();
	        JTextField textField = new JTextField();
	        KeyboardListener2 listener = new KeyboardListener2();

	        textField.addKeyListener(listener);
	        frame.add(textField);
	        frame.pack();
	        frame.setVisible(true);
	        
	    	macrostart ms = new macrostart();
			int i = 0;
			
			
	        while (i<roop) {
		// 안에 마우스 클릭 이벤트도 다 넣어야 함
	        	
	            if(listener.getFlag() ==1) {
	            	System.out.println("flag적용");
	            	break;
	            }
				i++;
		        robot.mouseMove(x, y); // 첫번째 위치로 이동
		        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 마우스 왼쪽 버튼 누름
		        robot.delay(delaysmall); // 딜레이
		        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 마우스 왼쪽 버튼 뗌
		        robot.delay(delaysmall); // 딜레이
	            
		        robot.mouseMove(q, w); // 두번째 위치로 이동
		        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 마우스 왼쪽 버튼 누름
		        robot.delay(delaysmall); // 딜레이
		        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 마우스 왼쪽 버튼 뗌
		        robot.delay(delaysmall); // 딜레이	
		        robot.mouseMove(e, r); // 세번째 위치로 이동
		        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 마우스 왼쪽 버튼 누름
		        robot.delay(delaysmall); // 딜레이
		        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 마우스 왼쪽 버튼 뗌
		        robot.delay(delaysmall); // 딜레이
		        //keyevent null로 오류남 macrostart에서 스페이스바 넘어와야할듯m

		        try {
					Thread.sleep(delayDC);
				}
		        catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	        }
	        frame.dispose();
		}
		catch (AWTException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
    }
    



}

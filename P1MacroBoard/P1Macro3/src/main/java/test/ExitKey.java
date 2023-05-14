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
import java.util.List;


class MyFrame extends JFrame {
	
    public MyFrame() {
        KeyboardListener2 keyListener = new KeyboardListener2();
        addKeyListener(keyListener);
 
        setFocusable(true);
        requestFocus();

        setSize(400, 300);
        Music introMusic = new Music("weeknds.mp3", true);
        introMusic.start();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        MyFrame mF = new MyFrame();

    }
}

public class ExitKey extends KeyAdapter{
	

	public void exitKey(List<Integer> lt) {	
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
	        
	    	MacroStart ms = new MacroStart();
	    	Integer x = lt.get(0);
	    	Integer y = lt.get(1);
	    	Integer q = lt.get(2);
	    	Integer w = lt.get(3);
	    	Integer e = lt.get(4);
	    	Integer r = lt.get(5);
	    	Integer t = lt.get(6);
	    	Integer u = lt.get(7);
	    	Integer o = lt.get(8);
	    	Integer m = lt.get(9);
	    	
	    	Integer delaysmall = lt.get(10);
	    	Integer delayDC = lt.get(11);
	    	Integer dxy = lt.get(12);
	    	Integer dqw = lt.get(13);
	    	Integer der = lt.get(14);
	    	Integer roop = lt.get(15);
	    	
			int i = 0;
			
	        while (i<roop) {
		// 안에 마우스 클릭 이벤트도 다 넣어야 함
	        	
	            if(listener.getFlag() ==1) {
	            	System.out.println("flag적용");
	            	break;
	            }
				i++;
				
				if(x != null && y != null) {
			        robot.mouseMove(x, y); // 첫번째 위치로 이동
			        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 마우스 왼쪽 버튼 누름
			        robot.delay(delaysmall); // 딜레이
			        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 마우스 왼쪽 버튼 뗌

				}
				if(dxy !=null) {
			        robot.delay(dxy); // 딜레이
				}

				if(q != null && w != null) {
			        robot.mouseMove(q, w); // 두번째 위치로 이동
			        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 마우스 왼쪽 버튼 누름
			        robot.delay(delaysmall); // 딜레이
			        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 마우스 왼쪽 버튼 뗌
	
				}
				if(dqw != null) {
			        robot.delay(dqw); // 딜레이
				}
		        
				if(e != null && r != null) {
			        robot.mouseMove(e, r); // 세번째 위치로 이동
			        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 마우스 왼쪽 버튼 누름
			        robot.delay(delaysmall); // 딜레이
			        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 마우스 왼쪽 버튼 뗌
			        
				}
				if(der != null) {
					robot.delay(der); // 딜레이
				}
		        
				if(t != null && u != null) {
			        robot.mouseMove(t, u); // 세번째 위치로 이동
			        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 마우스 왼쪽 버튼 누름
			        robot.delay(delaysmall); // 딜레이
			        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 마우스 왼쪽 버튼 뗌
				}
				if(o != null && m != null) {
			        robot.mouseMove(o, m); // 세번째 위치로 이동
			        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 마우스 왼쪽 버튼 누름
			        robot.delay(delaysmall); // 딜레이
			        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 마우스 왼쪽 버튼 뗌
				}


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

package test;

import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyAdapter;
import java.awt.Robot;
import jakarta.servlet.http.HttpSession;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;


class MyFrame extends JFrame {


    private JButton stopButton;
    public MyFrame() {
        KeyboardListener2 keyListener = new KeyboardListener2();
        addKeyListener(keyListener);
        Music ms = new Music();     
    	try {
       
            setFocusable(true);
            requestFocus();

            setSize(400, 300);

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);

            ms.start();
            
            stopButton = new JButton("Stop");
            stopButton.addActionListener(new ActionListener() {
    			
    			@Override
    			public void actionPerformed(ActionEvent e) {
    				ms.clip.stop();
    			}
            });

            JPanel buttonPanel = new JPanel();
            buttonPanel.add(stopButton);

            add(buttonPanel, BorderLayout.SOUTH);
            setVisible(true);

    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }

    public static void main(String[] args) {
        MyFrame mF = new MyFrame();

    }
}

public class ExitKey extends KeyAdapter{
	
	public void interval(Integer delay) {
        try {
			Thread.sleep(delay);
		}
        catch (InterruptedException e1) {

			e1.printStackTrace();
		}
	}
	public void mouseClick(Integer alpha, Integer beta, Integer clickDelay) {
		Robot robot;

		try {
			robot = new Robot();
	        robot.mouseMove(alpha, beta);//위치로 이동
	        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	        robot.delay(clickDelay); // 딜레이
	        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void exitKey(List<Integer> lt, List<Integer> lt2) {	
		MyFrame mf = new MyFrame();

        System.out.println("pass객체music");

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
	    	
	    	Integer clickDelay = lt.get(10);
	    	Integer delayDC = lt.get(11);
	    	Integer dxy = lt.get(12);
	    	Integer dqw = lt.get(13);
	    	Integer der = lt.get(14);
	    	Integer roop = lt.get(15);
	    	
	    	Integer a1 = lt2.get(0);
	    	Integer a2 = lt2.get(1);
	    	Integer dtu = lt2.get(2);
	    	Integer dom = lt2.get(3);
	    	
			int i = 0;
			
	        while (i<roop) {
		// 안에 마우스 클릭 이벤트도 다 넣어야 함
	        	
	            if(listener.getFlag() ==1) {
	            	System.out.println("flag적용");
	            	break;
	            }
				i++;
				
				robot.delay(1000);
				if(x != null && y != null) {
					mouseClick(x,y,clickDelay);
				}	
				if(dxy !=null) {
			        interval(dxy);
				}
				if(q != null && w != null) {
					mouseClick(q, w, clickDelay);
				}
				if(dqw != null) {
			        interval(dqw); // 딜레이
				}
				if(e != null && r != null) {
					mouseClick(e, r, clickDelay);
				}
				if(der != null) {
					interval(der); // 딜레이
				}
				if(t != null && u != null) {
					mouseClick(t, u, clickDelay);
				}
				if(dtu != null) {
					interval(dtu); // 딜레이
				}
				
				if(o != null && m != null) {
					mouseClick(o, m, clickDelay);
				}
				if(dom != null) {
					interval(dom); // 딜레이
				}
				if(a1 != null && a2 != null) {
					mouseClick(a1, a2, clickDelay);
				}

				if(delayDC != null) {
					interval(delayDC);
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

package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/test/start.do")
public class macrostart extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		KeyboardListener2 kl = new KeyboardListener2();
		try {
			Robot robot = new Robot();
			HttpSession session = req.getSession();
			
			int x = (int) session.getAttribute("x");
			int y = (int) session.getAttribute("y");
			int q = (int) session.getAttribute("q");
			int w = (int) session.getAttribute("w");
			int e = (int) session.getAttribute("e");
			int r = (int) session.getAttribute("r");
			String roops = req.getParameter("roop");
			int roop = Integer.valueOf(roops);
			String delay1 = req.getParameter("delay1");
			int delaysmall = 500;
			int delay11 = Integer.parseInt(delay1);
			int delayDC = delay11 * 1000;
			int i=1;
//			ExitKey exitkey = new ExitKey();
			

			while(i<=roop) {

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
		        try {
					Thread.sleep(delayDC);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
			System.out.println("반복종료");
			req.getRequestDispatcher("../01macro/mouseclick1.jsp").forward(req, resp);
		}
		catch (AWTException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		
		
	}
}

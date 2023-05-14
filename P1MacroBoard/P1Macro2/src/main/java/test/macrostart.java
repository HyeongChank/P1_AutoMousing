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
			ExitKey ek = new ExitKey();
			ek.exitKey(roop,x,y,q,w,e,r,delaysmall,delayDC);


			System.out.println("반복종료");
			req.getRequestDispatcher("../01macro/mouseclick1.jsp").forward(req, resp);
		}
		catch (AWTException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		
		
	}
}

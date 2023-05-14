package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/test/start.do")
public class MacroStart extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		KeyboardListener2 kl = new KeyboardListener2();
		try {
			Robot robot = new Robot();
			HttpSession session = req.getSession();
			List<Integer> lt = new ArrayList<>();
			
			if(session.getAttribute("x") != null) {
				Integer x = (int) session.getAttribute("x");
				lt.add(x);
			}
			else {
				Integer x = null;
				lt.add(x);
			}
			
			if(session.getAttribute("y") != null) {
				Integer y = (int) session.getAttribute("y");
				lt.add(y);
			}
			else {
				Integer y = null;
				lt.add(y);
			}
			if(session.getAttribute("q") != null) {
				Integer q = (int) session.getAttribute("q");
				lt.add(q);
			}
			else {
				Integer q = null;
				lt.add(q);
			}
			if(session.getAttribute("w") != null) {
				Integer w = (int) session.getAttribute("w");
				lt.add(w);
			}
			else {
				Integer w = null;
				lt.add(w);
			}
			if(session.getAttribute("e") != null) {
				Integer e = (int) session.getAttribute("e");
				lt.add(e);
			}
			else {
				Integer e = null;
				lt.add(e);
			}
			if(session.getAttribute("r") != null) {
				Integer r = (int) session.getAttribute("r");
				lt.add(r);
			}
			else {
				Integer r = null;
				lt.add(r);
			}
			if(session.getAttribute("t") != null) {
				Integer t = (int) session.getAttribute("t");
				lt.add(t);
			}
			else {
				Integer t = null;
				lt.add(t);
			}
			if(session.getAttribute("u") != null) {
				Integer u = (int) session.getAttribute("u");
				lt.add(u);
			}
			else {
				Integer u = null;
				lt.add(u);
			}
			if(session.getAttribute("o") != null) {
				Integer o = (int) session.getAttribute("o");
				lt.add(o);
			}
			else {
				Integer o = null;
				lt.add(o);
			}
			if(session.getAttribute("m") != null) {
				Integer m = (int) session.getAttribute("m");
				lt.add(m);
			}
			else {
				Integer m = null;
				lt.add(m);
			}
			
			Integer delaysmall = 500;
			lt.add(delaysmall);
			
			String delay1 = req.getParameter("delay1");
			Integer delay11 = Integer.parseInt(delay1);
			Integer delayDC = delay11 * 1000;
			lt.add(delayDC);
			System.out.println(lt + "   pass");
			
			String delayxy = req.getParameter("delayxy");
			Integer dxy;
			if(delayxy.isEmpty()) {
				dxy = null;
			}
			else {
				dxy = Integer.parseInt(delayxy)*1000;
			}
			lt.add(dxy);
			System.out.println(lt + "   pass");
			
			String delayqw = req.getParameter("delayqw");
			Integer dqw;
			if(delayqw.isEmpty()) {
				dqw = null;
			}
			else {
				dqw = Integer.parseInt(delayqw)*1000;
			}
			lt.add(dqw);
			System.out.println(lt + "   pass");

			String delayer = req.getParameter("delayer");
			Integer der ;
			if(delayer.isEmpty()) {
				der = null;
			}
			else {
				der = Integer.parseInt(delayer)*1000;
			}
			lt.add(der);
			System.out.println(lt + "   pass");
			
			String roops = req.getParameter("roop");
			Integer roop = Integer.parseInt(roops);
			lt.add(roop);
			
			int i=1;
			ExitKey ek = new ExitKey();
			System.out.println(lt);
			
			//루프 시작
			ek.exitKey(lt);
			

			System.out.println("반복종료");
			req.getRequestDispatcher("../01macro/mouseclick1.jsp").forward(req, resp);
		}
		catch (AWTException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		
		
	}
}

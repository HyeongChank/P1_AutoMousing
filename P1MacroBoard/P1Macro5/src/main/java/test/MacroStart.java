package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/test/start.do")
public class MacroStart extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		KeyboardListener2 kl = new KeyboardListener2();
		try {
			Robot robot = new Robot();
			HttpSession session = req.getSession();
			List<Integer> lt = new ArrayList<>();
			List<Integer> lt2 = new ArrayList<>();
			
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
			if(session.getAttribute("a1") != null) {
				Integer a1 = (int) session.getAttribute("a1");
				lt2.add(a1);
			}
			else {
				Integer a1 = null;
				lt2.add(a1);
			}
			if(session.getAttribute("a2") != null) {
				Integer a2 = (int) session.getAttribute("a2");
				lt2.add(a2);
			}
			else {
				Integer a2 = null;
				lt2.add(a2);
			}
			
			
			
			Integer delaysmall = 100;
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
			//====== lt 저장 끝
			
			
			String delaytu = req.getParameter("delaytu");
			Integer dtu ;
			if(delaytu.isEmpty()) {
				dtu = null;
			}
			else {
				dtu = Integer.parseInt(delaytu)*1000;
			}
			lt2.add(dtu);
			System.out.println(lt2 + "   pass");
			
			String delayom = req.getParameter("delayom");
			Integer dom ;
			if(delayom.isEmpty()) {
				dom = null;
			}
			else {
				dom = Integer.parseInt(delayom)*1000;
			}
			lt2.add(dom);
			System.out.println(lt2 + "   pass");
			
			
			
			
			
			
			
			
			int i=1;
			ExitKey ek = new ExitKey();
			System.out.println(lt);
			
			//루프 시작
			ek.exitKey(lt, lt2);
			

			System.out.println("반복종료");
			req.getRequestDispatcher("../01macro/Mouseclick2.jsp").forward(req, resp);
		}
		catch (AWTException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		
		
	}
}

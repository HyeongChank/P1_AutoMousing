package pro_mac_mc;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.Scanner;
import jakarta.servlet.http.HttpServlet;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/mouseclick"})
public class MouseClickMain extends HttpServlet {

	private static int x =0;
	private static int y =0;
	private static Scanner kb = new Scanner(System.in);
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
//		session.invalidate();
        Point p;
 
        p = MouseInfo.getPointerInfo().getLocation();
    	x = (int) p.getX();
    	y = (int) p.getY();
    	System.out.println("Clicked mouse position: (" + x + ", " + y + ")");
    	
    //session 에 넣으면 계속 남아있음 , request에 넣으면 사라짐
		session.setAttribute("x", x);
		session.setAttribute("y", y);

      	System.out.println(x + " " + y);
		req.getRequestDispatcher("../01macro/mouseclick2.jsp").forward(req, resp);
	}

	
}





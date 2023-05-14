package test;

import java.awt.MouseInfo;
import java.awt.Point;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//마우스포인터를 main.jsp 파일로 넘겨줘야함
//main.jsp파일에서 모든 좌표값을 받도록 버튼 여러개 만들어서 각각 좌표 받도록 해야함

@WebServlet("/test/mouselocation2.do")
public class mouselocation2 extends HttpServlet {

	
	private static Scanner kb = new Scanner(System.in);
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
        
        Point p;
        p = MouseInfo.getPointerInfo().getLocation();
        int q = (int)p.getX();
        int w = (int)p.getY();
        System.out.println("Clicked mouse position: (" + q + ", " + w + ")");

		session.setAttribute("q", q);
		session.setAttribute("w", w);
		System.out.println(q + " " + w);
		req.getRequestDispatcher("../01macro/mouseclick3.jsp").forward(req, resp);
	}

	
}

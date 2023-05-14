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

@WebServlet("/test/mouselocation5.do")
public class Mouselocation5 extends HttpServlet {

	private static int o =0;
	private static int m =0;
	private static Scanner kb = new Scanner(System.in);
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        List<Integer> list = new ArrayList<>();
		HttpSession session = req.getSession();
        
        Point p;
        p = MouseInfo.getPointerInfo().getLocation();
        o = (int) p.getX();
        m = (int) p.getY();
        System.out.println("Clicked mouse position: (" + o + ", " + m + ")");     
		session.setAttribute("o", o);
		session.setAttribute("m", m);
		
		req.getRequestDispatcher("../01macro/Mouseclick1.jsp").forward(req, resp);
	}

	
}

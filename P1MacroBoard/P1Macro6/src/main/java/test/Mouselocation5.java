package test;

import java.awt.MouseInfo;
import java.awt.Point;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

//마우스포인터를 main.jsp 파일로 넘겨줘야함
//main.jsp파일에서 모든 좌표값을 받도록 버튼 여러개 만들어서 각각 좌표 받도록 해야함

@WebServlet("/test/omlocation.do")
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
		
		req.getRequestDispatcher("../01macro/ClickFunc.jsp").forward(req, resp);
	}

	
}

package test;

import java.io.IOException;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;



@WebServlet("/test/AllNull.do")
public class AllNull extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
		
		HttpSession session = req.getSession();
		Enumeration<String> attributeNames = session.getAttributeNames();

		while(attributeNames.hasMoreElements()) {
		    String attributeName = attributeNames.nextElement();
		    Object attributeValue = session.getAttribute(attributeName);
		    System.out.println(attributeName + " : " + attributeValue);
		}
		
		req.getSession().invalidate();

		System.out.println("초기화 완료");
//		
		req.getRequestDispatcher("../01macro/ClickFunc.jsp").forward(req, resp);		
	}

}

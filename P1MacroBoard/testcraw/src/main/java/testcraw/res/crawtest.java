package testcraw.res;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/testcraw/crawtest.do")
public class crawtest extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		craaa c = new craaa();
		c.crawling();
		System.out.println("test");
		req.getRequestDispatcher("../craw/test.jsp").forward(req, resp);
	}

}

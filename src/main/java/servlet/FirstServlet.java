package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// @WebServlet(urlPatterns = { "/first.cc"}, name = "/first.cc")
public class FirstServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	
//		Get 요청을 처리하는 메소드 - 인자타입 2개 xxxRequest, xxxRespone
//							    요청과 응답에 대한 처리를 할 수 있습니다.
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
}

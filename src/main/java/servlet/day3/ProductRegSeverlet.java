package servlet.day3;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import project.dao.TblProductDao;
import project.vo.ProductVo;

@WebServlet(urlPatterns = {"/productReg.cc"}, description = "상품 등록")
public class ProductRegSeverlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger =
			LoggerFactory.getLogger(ProductRegSeverlet.class);

   


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("[MyInfo] 상품등록 화면 요청되었습니다.");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/day3/ProductReg.jsp");
			dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("[MyInfo] 상품등록 데이터 저장이 요청되었습니다.");
		
		// POST : 요청 값 인코딩 필수
		request.setCharacterEncoding("UTF-8");
		
		String category = request.getParameter("category");
		String pcode = request.getParameter("pcode");
		String pname = request.getParameter("pname");
		String temp = request.getParameter("price");
		int price = 0;
		if (temp.length() !=0) Integer.parseInt(temp);
			
		ProductVo vo = new ProductVo(category, pcode, pname, price);
		logger.info("\t 입력 값 vo : {}", vo);
		
		TblProductDao dao = new TblProductDao();
		dao.joinP(vo); 	
		
	
		response.sendRedirect("products.cc");
		
	}

}

package servlet.day3;

import java.io.IOException;
import java.util.List;

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

@WebServlet(urlPatterns = {"/products.cc"} , description = "상품 전체 조회")
public class ProductSevrelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory.getLogger(ProductSevrelet.class);
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TblProductDao dao = new TblProductDao();
		List<ProductVo> list = dao.allProducts(); 
		logger.info("[?.,?] 구매내역 전체 조회: {}", list);
		
		request.setAttribute("list", list);	
		RequestDispatcher dispatcher = request.getRequestDispatcher("/day3/products.jsp");
		dispatcher.forward(request, response);
	}


	}



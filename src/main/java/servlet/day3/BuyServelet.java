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

import project.dao.TblBuyDao;
import project.vo.BuyVo;



@WebServlet(urlPatterns = {"/buys.cc"} , description = "고객 구매내역 전체 조회")
public class BuyServelet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory.getLogger(BuyServelet.class);
   
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		TblBuyDao dao = new TblBuyDao();
		List<BuyVo> list = dao.allBuys();
		logger.info("[^.,^] 구매내역 전체 조회: {}", list);
		
		request.setAttribute("list", list);	
		RequestDispatcher dispatcher = request.getRequestDispatcher("/day3/buys.jsp");
		dispatcher.forward(request, response);
	}

	

}

package day4.mybatis.dao;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import day4.mybatis.dto.CustomerBuyDto;
import day4.mybatis.dto.CustomerDto;
import mybatis.SqlSessionBean;

public class MybatisCustomerDao {
	

	private SqlSessionFactory sessionFactory = SqlSessionBean.getSessionFactory();

		   public List<CustomerDto> allCustomers(){
		      SqlSession sqlSession = sessionFactory.openSession();
		      List<CustomerDto> list = sqlSession.selectList("tblcustomer.allCustomers");
		      sqlSession.close();
		      return list;
		   }
		   
			/* Map 사용
			 * public List<CustomerDto> selectByNameAge(){ SqlSession sqlSession =
			 * sessionFactory.openSession(); List<CustomerDto> list =
			 * sqlSession.selectList("tblcustomer.selectByNameAge"); sqlSession.close();
			 * return list; }
			 */
		   
		   public int delete(String cid) {
			   SqlSession sqlSession = sessionFactory.openSession();
			   int result =  sqlSession.delete("tblcustomer.delete",cid);
			   sqlSession.commit();
			   sqlSession.close();
			   return result;
		   }
		   
		   
		   public int join(CustomerDto dto) {
		      SqlSession sqlSession = sessionFactory.openSession();
		      int result = sqlSession.insert("tblcustomer.join",dto);
		      sqlSession.commit();
		      sqlSession.close();
		      return result;
		    
		      
		   }
		   
		 
		   
}

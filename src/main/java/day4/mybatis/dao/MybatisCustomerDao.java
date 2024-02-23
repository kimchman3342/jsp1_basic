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

		   
		   public List<CustomerDto> selectAll(){
		      SqlSession sqlSession = sessionFactory.openSession();
		      List<CustomerDto> list = sqlSession.selectList("tblcustomer.selectAll");
		      return list;
		   }
		   
		   
		   public int insert(CustomerDto vo) {
		      SqlSession sqlSession = sessionFactory.openSession();
		      int result = sqlSession.insert("tblcustomer.insert",vo);
		      sqlSession.commit();
		      sqlSession.close();
		      return result;
		      
		   }
		   
		   public int update(Map<String, Integer> map) {
		      SqlSession sqlSession = sessionFactory.openSession();
		      int result = sqlSession.update("tblcustomer.update", map);
		      sqlSession.commit();
		      sqlSession.close();
		      return result;
		   }
		   
		   public int delete(int customeridx) {
		      SqlSession sqlSession = sessionFactory.openSession();
		      int result = sqlSession.delete("tblcustomer.delete",customeridx);
		      sqlSession.commit();
		      sqlSession.close();
		      return result;
		   }
		   
}

package day4.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import day4.mybatis.dto.ProductDto;
import mybatis.SqlSessionBean;

public class MybatisProductDao {
	 
	private SqlSessionFactory sessionFactory = SqlSessionBean.getSessionFactory();

	   
	   public List<ProductDto> selectByCategory(String c){
	      SqlSession sqlSession = sessionFactory.openSession();
	      List<ProductDto> list = sqlSession.selectList("tblproduct.selectByCategory",c);
	      sqlSession.close();
	      return list;
	      
	   }
	 
	   public List<ProductDto> selectByPname(String c){
		   SqlSession sqlSession = sessionFactory.openSession();
		   List<ProductDto> list = sqlSession.selectList("tblproduct.selectByPname",c);
		   sqlSession.close();
		   return list;	   
	   }
	   
	   
	   public List<ProductDto> search(Map<String, Object> map) {
		   SqlSession sqlSession = sessionFactory.openSession();
		   List<ProductDto> list = sqlSession.selectList("tblproduct.search",map);
		   sqlSession.close();
		   return list;
	   }
	   
   }

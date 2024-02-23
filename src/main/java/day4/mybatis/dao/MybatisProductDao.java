package day4.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import day4.mybatis.dto.CustomerDto;
import day4.mybatis.dto.ProductDto;
import mybatis.SqlSessionBean;

public class MybatisProductDao {
	 
	private SqlSessionFactory sessionFactory = SqlSessionBean.getSessionFactory();

	   
	   public List<ProductDto> selectAll(){
	      SqlSession sqlSession = sessionFactory.openSession();
	      List<ProductDto> list = sqlSession.selectList("tblproduct.selectAll");
	      return list;
	   }
	   
	   
	   public int insert(ProductDto vo) {
	      SqlSession sqlSession = sessionFactory.openSession();
	      int result = sqlSession.insert("tblproduct.insert",vo);
	      sqlSession.commit();
	      sqlSession.close();
	      return result;
	      
	   }
	   
	   public int update(Map<String, Integer> map) {
	      SqlSession sqlSession = sessionFactory.openSession();
	      int result = sqlSession.update("tblproduct.update", map);
	      sqlSession.commit();
	      sqlSession.close();
	      return result;
	   }
	   
	   public int delete(int productidx) {
	      SqlSession sqlSession = sessionFactory.openSession();
	      int result = sqlSession.delete("tblproduct.delete",productidx);
	      sqlSession.commit();
	      sqlSession.close();
	      return result;
	   }
}

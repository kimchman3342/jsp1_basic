package mybatis;

import java.util.List;

import day4.mybatis.dao.MybatisBuyDao;
import day4.mybatis.dao.MybatisCustomerDao;
import day4.mybatis.dao.MybatisProductDao;
import day4.mybatis.dto.BuyDto;
import day4.mybatis.dto.ProductDto;


public class MybatisSessionTest {

	public static void main(String[] args) {
	
	}
		public static void testProduct() {
		MybatisProductDao prodao = new MybatisProductDao();
		System.out.println(" dao 객체 : " + prodao);
		int proresult = prodao.insert(new ProductDto("DOWON123a", "B2","동원참치선물세트",54000));
		                    
	}
	
	public static void testCustomer(){
		MybatisCustomerDao cusdao = new MybatisCustomerDao();
		
		System.out.println(" dao 객체 : " + cusdao);

	} 
	

	public static void testBuy(){
		MybatisBuyDao cusdao = new MybatisBuyDao();
		
		System.out.println(" dao 객체 : " + cusdao);
		
		
		System.out.println("===== insert 테스트 =====");
		int cusresult = cusdao.insert(new BuyDto(0, "mina012","CJBAb12g",3,null));
		int proresult = prodao.insert(new ProductDto("DOWON123a", "B2","동원참치선물세트",54000));
		System.out.println("반영된 행 개수 : " + cusresult);

		
	}
}
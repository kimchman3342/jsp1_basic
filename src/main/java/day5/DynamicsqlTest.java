package day5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import day4.mybatis.dao.MybatisProductDao;
import day4.mybatis.dto.ProductDto;

public class DynamicsqlTest {
	public static void main(String[] args) {
		//testNoFilter();
		//testCateFilter();
		//testPnameFilter();
		//testPnameCateFilter();
		//testAllFilter();
		testOrderBy();
	}
	
	public static void testNoFilter() {
		MybatisProductDao dao = new MybatisProductDao();
		List<ProductDto> list = dao.search(null);
		System.out.println("검색 필터 없음 : " +  list);  // 전체 조회
	}
	
	public static void testOrderBy() {
		MybatisProductDao dao = new MybatisProductDao();
		Map<String, Object> map = new HashMap<>();
		map.put("column", " category");  	// 컬럼명 price로 정렬하기
		List<ProductDto> list = dao.search(map);
		System.out.println("검색 필터 order by 적용 : " +  list);  // 전체 조회
	}
	
	public static void testCateFilter() {     
		MybatisProductDao dao = new MybatisProductDao();
		Map<String, Object> map = new HashMap<>();
		map.put("category", "B2");		// key는 파라미터 이름, value 는 검색하고 싶은 컬럼 값
						// key는 매퍼 xml 확인 	// value는 변경해서 테스트하기
		
		List<ProductDto> list = dao.search(map);
		System.out.println("검색 필터 카테고리 : " +  list);  // 전체 조회
	}
	
	public static void testPnameFilter() {
		MybatisProductDao dao = new MybatisProductDao();
		Map<String, Object> map = new HashMap<>();
		map.put("keyword", "사과");	
		
		
		List<ProductDto> list = dao.search(map);
		System.out.println("검색 필터 pname : " +  list);  // 전체 조회
	}
	
	public static void testPnameCateFilter() {
		MybatisProductDao dao = new MybatisProductDao();
		Map<String, Object> map = new HashMap<>();
		map.put("category", "A1");	
		map.put("keyword", "사과");	
		
		
		List<ProductDto> list = dao.search(map);
		System.out.println("검색 필터 panmecate: " +  list);  // 전체 조회
	}
	
	public static void testAllFilter() {
		MybatisProductDao dao = new MybatisProductDao();
		Map<String, Object> map = new HashMap<>();
		map.put("category", "A2");	
		map.put("keyword", "망고");	
		// 문제 : 가격 필터도 적요오디도록 매퍼 xml의 동적쿼리를 수정하세요		
		map.put("from", 10000);	
		map.put("to", 40000);	

		List<ProductDto> list = dao.search(map);
		System.out.println("검색 필터 panmecate 그리고 price: " +  list);  // 전체 조회
	}
}

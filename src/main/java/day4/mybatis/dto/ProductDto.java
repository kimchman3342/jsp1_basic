package day4.mybatis.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor			// 커스텀생성자 : 컬럼명과 변수명 일치 안해도 된다.
							// 			   변수선언 순서와 컬럼순서는 일치해야 합니다.
@EqualsAndHashCode
public class ProductDto {
	private String pcode;
	private String category;
	private String pname;
	private int price;
	    
}

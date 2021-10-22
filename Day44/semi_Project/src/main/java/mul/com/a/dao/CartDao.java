package mul.com.a.dao;

import java.util.List;

import mul.com.a.dto.CartDto;

public interface CartDao {
	
	 List<CartDto> cartlist(String user_id); // 해당 유저 장바구니 목록
	  
	
	  boolean delete(CartDto dto); // 장바구니 개별 삭제
	  
	  
	 /* void deleteAll(String user_id); // 해당 유저 장바구니 비우기
	 */
	
}
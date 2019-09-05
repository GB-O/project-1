package com.hanwha.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hanwha.model.FoodDTO;
import com.hanwha.model.FoodDetailDTO;
import com.hanwha.model.MemberDTO;
import com.hanwha.model.OrderInfoDTO;
import com.hanwha.model.OrderListDTO;

@Repository
public class LoginDAOImp {
	
	@Autowired
	SqlSession session;
	String namespace = "com.hanwha.login.";
	String namespaceFood = "com.hanwha.food.";
	
	
	public MemberDTO SelectPw(MemberDTO dto) {
		return session.selectOne(namespace+"selectPw", dto);
	}


	public int register(MemberDTO member) {
		return session.insert(namespace+"register", member);
	}
	
	public int update(MemberDTO member) {
		return session.update(namespace+"update", member);
	}
	
	//food
    public List<FoodDetailDTO> foodDetaillSelect() {
    	
    	List<FoodDetailDTO> foodlist = session.selectList(namespaceFood+"allmenu");
    	
    	return foodlist;
    }


	public List<FoodDTO> foodAllSelect() {
		return session.selectList(namespaceFood+"allfood");
	}


	public int insertOrder(OrderInfoDTO dto) {
		return session.insert(namespaceFood+"orderinsert",dto);
	}
	
	public List<OrderListDTO> orderselect(String cid, String dt) {
        Map<String, String> map = new HashMap<String, String>();  	
        map.put("cid", cid);
        map.put("orderdate", dt);
		return session.selectList(namespaceFood+"orderselect", map);
	}
}









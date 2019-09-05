package com.hanwha.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanwha.model.FoodDTO;
import com.hanwha.model.FoodDetailDTO;
import com.hanwha.model.MemberDTO;
import com.hanwha.model.OrderInfoDTO;
import com.hanwha.model.OrderListDTO;

@Service
public class LoginServiceImp implements LoginService {

	@Autowired
	LoginDAOImp dao;
	
	@Override
	public MemberDTO loginInfo(MemberDTO member) {

		return dao.SelectPw(member);

	}

	@Override
	public int register(MemberDTO member) {
		// TODO Auto-generated method stub
		return dao.register(member);
	}

	@Override
	public int update(MemberDTO member) {
		return dao.update(member);
	}
	
	public List<FoodDetailDTO> foodDetaillSelect() {
		return dao.foodDetaillSelect();
		
	}
	
	public List<FoodDTO> foodAllSelect(){
		return dao.foodAllSelect();
	}
	
	public int insertOrder(OrderInfoDTO dto) {
		return dao.insertOrder(dto);
	}
	public List<OrderListDTO> orderselect(String cid, String dt) {
		return dao.orderselect(cid, dt);
	}
	 
	 
}

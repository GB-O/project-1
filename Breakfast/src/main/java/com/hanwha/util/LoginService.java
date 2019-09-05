package com.hanwha.util;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hanwha.model.FoodDTO;
import com.hanwha.model.FoodDetailDTO;
import com.hanwha.model.MemberDTO;
import com.hanwha.model.OrderInfoDTO;
import com.hanwha.model.OrderListDTO;

@Service
public interface LoginService {

	public MemberDTO loginInfo(MemberDTO member);

	public int register(MemberDTO member);
	
	public List<FoodDetailDTO> foodDetaillSelect() ;
	
	public List<FoodDTO> foodAllSelect();

	public int insertOrder(OrderInfoDTO dto);
	
	public int update(MemberDTO dto);
	
	public List<OrderListDTO> orderselect(String cid, String dt) ;
	 
}



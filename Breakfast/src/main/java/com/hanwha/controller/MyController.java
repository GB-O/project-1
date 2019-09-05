package com.hanwha.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hanwha.model.FoodDetailDTO;
import com.hanwha.model.MemberDTO;
import com.hanwha.model.OrderInfoDTO;
import com.hanwha.util.LoginService;

@Controller
public class MyController {

	@Autowired
	LoginService loginService;

	// 로그인
	@RequestMapping("/login/login")
	public String loginPage() {
		return "/login/login";
	}

	// 회원가입으로 이동
	@RequestMapping(value = "/login/register", method = RequestMethod.GET)
	public String register() {

		return "/login/register";
	}

	// 회원가입 후 로그인으로 돌아가기
	@RequestMapping(value = "/login/register", method = RequestMethod.POST)
	public String registerPost(MemberDTO member) {
		loginService.register(member);

		return "redirect:/login/login";
	}

	// 로그인정보
	@RequestMapping("/login/loginInfo")
	public String loginInfo(MemberDTO member, Model model, HttpSession session) {
		System.out.println(member);
		MemberDTO member2 = loginService.loginInfo(member);
		System.out.println("member2 " + member2);
		if (member2 == null) {
			return "redirect:/login/login";
		} else {
			session.setAttribute("member", member2);
			return "redirect:/food/select";
		}

	}

	@RequestMapping("/login/register2")
	public String register2(String cId, String cPassword, String cname, String phoneNumber, String address,
			Model model) {

		return "/login/login";
	}

	// 로그아웃
	@RequestMapping("/login/logout")
	public String logout(HttpServletRequest request) throws Exception {
		request.getSession().invalidate();

		return "redirect:login";
	}
	

	//정보 수정
	@RequestMapping(value= "/login/cdetail", method=RequestMethod.POST)
	public String updatec(MemberDTO dto, HttpSession session) {
		System.out.println(dto);
		ModelAndView mav = new ModelAndView();
		loginService.update(dto);
		session.setAttribute("member", dto);
		return "redirect:/food/select";
				
	}
	
	@RequestMapping(value= "/login/cdetail", method=RequestMethod.GET)
	public String memberdetail(HttpSession session) {

		return "/login/cdetail";
				
	}
	
	
	// 주문 상세
	@RequestMapping("/food/select")
	public String Foodselect(Model model) {

		return "/food/select";
	}

	// 주문 상세
	@RequestMapping("/food/detail")
	public String Fooddetail(Model model) {
		model.addAttribute("allfood", loginService.foodAllSelect());
		List<FoodDetailDTO> foodlist = loginService.foodDetaillSelect();

		model.addAttribute("foodlist_egg", filterFood(foodlist, "EGG"));
		model.addAttribute("foodlist_meat", filterFood(foodlist, "MEAT"));
		model.addAttribute("foodlist_bread", filterFood(foodlist, "BREAD"));
		model.addAttribute("foodlist_salad", filterFood(foodlist, "SALAD"));
		model.addAttribute("foodlist_drink", filterFood(foodlist, "DRINK"));
		model.addAttribute("foodlist_order", filterFood(foodlist, "ORDER METHOD"));
		return "/food/detail";
	}

	private List<FoodDetailDTO> filterFood(List<FoodDetailDTO> foodlist, String item) {
		List<FoodDetailDTO> filteredFood = new ArrayList<FoodDetailDTO>();
		for (FoodDetailDTO food : foodlist) {
			if (food.getItemName().equals(item)) {
				filteredFood.add(food);
			}
		}
		return filteredFood;
	}

	// 주문 정보
	@RequestMapping(value="/food/order" , method = RequestMethod.POST)
	public String Foodorder(OrderInfoDTO dto, HttpSession session) {
		MemberDTO member = (MemberDTO)session.getAttribute("member");
		dto.setcId(member.getcId());
		System.out.println(dto);
		loginService.insertOrder(dto);
		return "/food/order";
	}
	
	
	@RequestMapping(value="/food/orderlist" , method = RequestMethod.GET)
	public String orderselect(String dt, HttpSession session, Model model) {
		MemberDTO member = (MemberDTO)session.getAttribute("member");

		model.addAttribute("orderlist", loginService.orderselect(member.getcId(), dt));
		return "/food/orderlist";
	}
	
	
	
	

	
}

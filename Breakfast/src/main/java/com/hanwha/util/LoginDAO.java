package com.hanwha.util;

import com.hanwha.model.MemberDTO;

public interface LoginDAO {
	public String selectPw(MemberDTO dto);
}

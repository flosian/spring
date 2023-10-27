package com.myweb.www.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomAuthMemberService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// username을 가지고 DB에 설정된 email인지를 체크해서
		// 인증하여 해당 객체를 AuthMember로 리턴
		return null;
	}

}
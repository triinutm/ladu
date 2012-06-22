package ladu.services;

import ladu.model.UserAccount;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

public class UserDetailsServiceImpl implements UserDetailsService{



	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {
		UserAccount ua = null;
		User user ;
		
		return null;
	}
}

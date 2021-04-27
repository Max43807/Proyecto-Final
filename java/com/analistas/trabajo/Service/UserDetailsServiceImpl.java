package com.analistas.trabajo.Service;

import java.util.HashSet;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.analistas.trabajo.Domain.Role;
import com.analistas.trabajo.Repository.UserRepositorty;

@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	UserRepositorty userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		com.analistas.trabajo.Domain.User appuser = userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("Username Invalido."));
		
		Set grantList = new HashSet();
		for (Role role: appuser.getRoles()) {
	        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(role.getDescription());
	            grantList.add(grantedAuthority);
		}
		UserDetails user = (UserDetails) new User(appuser.getUsername(), appuser.getPassword(), grantList);
		return user;
	}

	
}

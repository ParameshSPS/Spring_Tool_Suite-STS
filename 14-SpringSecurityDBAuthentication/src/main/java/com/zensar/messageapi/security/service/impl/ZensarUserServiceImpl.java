package com.zensar.messageapi.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.zensar.messageapi.entity.ZensarUser;
import com.zensar.messageapi.repository.ZensarUserRepository;

@Service
public class ZensarUserServiceImpl implements UserDetailsService {

	@Autowired
	private ZensarUserRepository repo;

	// Following method is used to fetch username and password from db
	@Override
	// userdetails is an interface given by spring security
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		// here we are fetching user from db
		ZensarUser foundUser = this.repo.findByUserName(username);

		// If user is null means it is not found in db then throw exception
		if (foundUser == null) {
			throw new UsernameNotFoundException(username);
		}

		// user is a class given by spring security
		User authenticatedUser = new User(foundUser.getUserName(), foundUser.getPassword(),
				AuthorityUtils.createAuthorityList("ROLE_USER"));
		return authenticatedUser;
	}
}
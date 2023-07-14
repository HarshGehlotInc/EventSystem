package com.example.quangle2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quangle2.model.Hangout;
import com.example.quangle2.model.UserInHangout;
import com.example.quangle2.repo.HangoutRepo;
import com.example.quangle2.repo.UserInHangoutRepo;
import com.example.quangle2.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private HangoutRepo hangoutRepo;
	
	@Autowired
	private UserInHangoutRepo userInHangoutRepo;
	
	public void addUserInHangout(UserInHangout userInHangout){
		Hangout hang = hangoutRepo.findById(userInHangout.getHangoutId()).get();
		
		userInHangoutRepo.save(userInHangout);
	}
	
}

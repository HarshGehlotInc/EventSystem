package com.example.quangle2.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quangle2.model.Hangout;
import com.example.quangle2.model.HangoutResponse;
import com.example.quangle2.model.Utils;
import com.example.quangle2.repo.HangoutRepo;

@Service
public class HangoutService {
	
	@Autowired
	private HangoutRepo hangoutRepo;
	
	public void createHangout(Hangout hangout) {
		hangoutRepo.save(hangout);
	}
	
	public List<HangoutResponse> getHangouts(){
		
		return hangoutRepo.findAll().stream()
				.map(Utils::convertToHangoutResponse)
				.collect(Collectors.toList());
	}
	
	public Hangout getHangoutById(Long id) {
		return hangoutRepo.findById(id).get();	
	}
	
	public void deleteHangout(Long id) {
		hangoutRepo.deleteById(id);
	}

}

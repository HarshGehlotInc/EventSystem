package com.example.quangle2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Id;

@Entity
public class UserInHangout {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Long userId;
	private Long hangoutId;
	
	public UserInHangout() {
		super();
	}
	
	public UserInHangout(Long id, Long userId, Long hangoutId) {
		super();
		this.id = id;
		this.userId = userId;
		this.hangoutId = hangoutId;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getUserId() {
		return userId;
	}
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public Long getHangoutId() {
		return hangoutId;
	}

	public void setHangoutId(Long hangoutId) {
		this.hangoutId = hangoutId;
	}
	
	@Override
	public String toString() {
		return "UserInHangout [id=" + id + ", userId=" + userId + ", hangoutId=" + hangoutId + "]";
	}
}

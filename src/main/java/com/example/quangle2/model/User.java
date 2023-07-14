package com.example.quangle2.model;

import java.util.*;

import jakarta.persistence.*;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToMany(mappedBy = "users", cascade = CascadeType.ALL)
	private Set<ChatGroup> groups;
}

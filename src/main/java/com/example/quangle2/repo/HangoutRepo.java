package com.example.quangle2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.quangle2.model.Hangout;

@Repository
public interface HangoutRepo extends JpaRepository<Hangout, Long>{

}

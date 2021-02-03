package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.guestbook;

public interface GuestRepository extends JpaRepository<guestbook,Integer>{
 public List<guestbook> findByEmail(String email);

}

package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.studentdemo;

public interface studentrepo extends JpaRepository<studentdemo,Integer> 
{
   
}

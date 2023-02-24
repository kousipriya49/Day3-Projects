package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.studentdemo;
import com.example.demo.Repository.studentrepo;

@Service
public class studentservice 
{
  @Autowired
  studentrepo strep;
  public studentdemo saveDetails(studentdemo e)
  {
	  return strep.save(e);  
  }
  
  public List<studentdemo>getDetails()
  {
	  return strep.findAll();
  }
  
  public studentdemo updateDetails(studentdemo e1)
  {
	  return strep.saveAndFlush(e1);
  }
  public void deleteDetails(int id)
  {
	  strep.deleteById(id);
  }
}

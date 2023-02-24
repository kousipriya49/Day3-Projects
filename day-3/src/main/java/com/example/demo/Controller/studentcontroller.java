package com.example.demo.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.studentservice;
import com.example.demo.Entity.studentdemo;
@RestController
public class studentcontroller {
     @Autowired
     studentservice stuservice;
     
     @PostMapping("/addDetails")
     public studentdemo addInfo(@RequestBody studentdemo st)
     {
    return stuservice.saveDetails(st);
    
     }
     
     @GetMapping("showDetails")
     public List<studentdemo> fetchDetails()
     {
    	 return stuservice.getDetails();
     }
     
     @PutMapping("/updateDetails")
     public studentdemo updateInfo(@RequestBody studentdemo st1)
     {
    	 return stuservice.updateDetails(st1);
     }
     @DeleteMapping("/delete/{sid}")
     public String deleteInfo (@PathVariable("sid")int sid)
     {
    	 stuservice.deleteDetails(sid);
    	 return "Deleted details";
     }
}
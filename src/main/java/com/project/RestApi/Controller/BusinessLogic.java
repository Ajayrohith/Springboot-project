package com.project.RestApi.Controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.RestApi.Components.CreateUserRequest;

import jakarta.annotation.PostConstruct;




@RestController
@RequestMapping("/api")
public class BusinessLogic {

    private  List<CreateUserRequest> studlist;

    @PostConstruct
    public void loadData()
    {
         studlist = new ArrayList<>();

        studlist.add(new CreateUserRequest("Ajay", "Rohith",21, "Newgen"));
        studlist.add(new CreateUserRequest("test", "Kumar",22, "Google"));
    }


    @GetMapping("/students/{id}")
    public CreateUserRequest students(@PathVariable int id)    
    {
      
       return studlist.get(id);
       
    }
   

}

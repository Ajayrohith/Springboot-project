package com.project.RestApi.Controller;


import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.RestApi.Components.*;

import jakarta.annotation.PostConstruct;




@RestController
@RequestMapping("/api")
public class BusinessLogic {

    private List<CreateUserRequest> listobj;

    @PostConstruct
    public void addusers()
    {
        listobj = new ArrayList<>();
        listobj.add(new CreateUserRequest("Ajay", "Rohith", 19,"Zoho"));
        listobj.add(new CreateUserRequest("Virat", "Kohli", 19,"Google"));
    }


    @GetMapping("/student/{id}")
    public CreateUserRequest Retstudents(@PathVariable int id) throws Exception 
    {
        if(id > listobj.size())
        {
            throw new CustomException("The id is greater than the number of student ");
        }
        return listobj.get(id);
    }

   

}

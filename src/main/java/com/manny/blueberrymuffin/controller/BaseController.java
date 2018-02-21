package com.manny.blueberrymuffin.controller;

import com.manny.blueberrymuffin.data.UserRepository;
import com.manny.blueberrymuffin.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BaseController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public String homePage(){
    return "index";
    }

    @RequestMapping("/person/{name}")
    public String personPage(@PathVariable String name, ModelMap modelMap){
        User user = userRepository.findByName(name);
        modelMap.put("user", user);
        return "user";
    }
    @RequestMapping("/everybody")
    public String getAllPeople(ModelMap modelMap){
        List<User> everybody = userRepository.getAllUsers();
        modelMap.put("everybody", everybody);
        return "everybody";
    }
}

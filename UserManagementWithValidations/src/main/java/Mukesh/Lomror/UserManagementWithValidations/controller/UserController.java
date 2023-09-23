package Mukesh.Lomror.UserManagementWithValidations.controller;

import Mukesh.Lomror.UserManagementWithValidations.model.User;
import Mukesh.Lomror.UserManagementWithValidations.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("user/api")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping(value = "/getAllUser")
    public ArrayList<User> getAllUser(){
        return userService.getAllUser();
    }

    @PostMapping(value = "/addUser")
    public String addUser(@Valid @RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping(value = "/getUser/{userId}")
    public ArrayList<User> getByUserId(@PathVariable int userId){
        return userService.getByUserId(userId);
    }

    @PutMapping(value = "/update/{userId}/name/{name}")
    public ArrayList<User> updateById(@PathVariable int userId, @PathVariable String name){
        return userService.updateById(userId,name);
    }
    @DeleteMapping(value = "/delete/{userId}")
    public String deleteById(@PathVariable int userId){
        return userService.deleteById(userId);
    }
}

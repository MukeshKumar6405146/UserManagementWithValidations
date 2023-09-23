package Mukesh.Lomror.UserManagementWithValidations.services;

import Mukesh.Lomror.UserManagementWithValidations.model.User;
import Mukesh.Lomror.UserManagementWithValidations.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
    public ArrayList<User> getAllUser() {
        return userRepo.getAllUser();
    }

    public String addUser(User user) {
        boolean res = userRepo.addUser(user);
        if(res)
            return "User added successfully";

        return "user not added";
    }

    public ArrayList<User> getByUserId(int userId) {
        return userRepo.getByUserId(userId);
    }

    public ArrayList<User> updateById(int userId, String name) {
        return userRepo.updateById(userId,name);
    }

    public String deleteById(int userId) {
        return userRepo.deleteById(userId);
    }
}

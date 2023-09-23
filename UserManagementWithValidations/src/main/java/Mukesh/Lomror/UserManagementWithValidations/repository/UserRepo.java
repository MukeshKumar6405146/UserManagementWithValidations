package Mukesh.Lomror.UserManagementWithValidations.repository;

import Mukesh.Lomror.UserManagementWithValidations.model.User;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

@Repository
public class UserRepo {
    ArrayList<User> userList = new ArrayList<>();

    public UserRepo() {

        LocalDate date = LocalDate.of(2023, 4, 29);
        LocalDate dob = LocalDate.of(1998, 3, 10);
        LocalTime time = LocalTime.of(10, 30);
        LocalDate date1 = LocalDate.of(2023, 8, 30);
        LocalDate dob1 = LocalDate.of(1999, 8, 11);
        LocalTime time1 = LocalTime.of(05, 30);

        userList.add(new User(1, "Mukesh Lomror", dob, "mukesh@gmail.com", "1234567890", date, time));
        userList.add(new User(2, "Mainak Gosh", dob1, "mainak@gmail.com", "9988776655", date1, time1));
    }


    public ArrayList<User> getAllUser() {
        return userList;
    }

    public boolean addUser(User user) {
        userList.add(user);
        return true;
    }

    public ArrayList<User> getByUserId(int userId) {
        ArrayList<User> templist = getAllUser();
        ArrayList<User> reslist  = new ArrayList<>();
        for(User user : templist){
            int temp = user.getId();
            if(temp==userId){
                reslist.add(user);
                break;
            }
        }
        return reslist;
    }

    public ArrayList<User> updateById(int userId, String name) {
        ArrayList<User> templist = getAllUser();
        ArrayList<User> reslist = new ArrayList<>();

        for(User user : templist){
            if(user.getId()==userId){
                user.setName(name);
                reslist.add(user);
                break;
            }
        }
        return reslist;
    }

    public String deleteById(int userId) {
        ArrayList<User> templist = getAllUser();
        for(User user: templist){
            if(user.getId()==userId){
                templist.remove(user);
                break;
            }
        }

        return "User is Successfully deleted!!";
    }
}

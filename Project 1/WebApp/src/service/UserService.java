package service;

import dao.UserDao;
import model.User;

/**
 * Created by 3 on 3/29/2014.
 */
public class UserService {
    public UserDao userDao = new UserDao();


    public boolean checkLogin(String userName,String userPassword){
        if(userPassword.equals(userDao.getPassword(userName))){
            return true;
        }
        return false;
    }

    public boolean checkUserExist(String name){
        if(userDao.exitsUser(name)){
            return true;
        }
        return false;
    }
    public void addUser(User user){
        userDao.addUser(user);
    }
    public int getId(String name){
        return userDao.getId(name);
    }
}

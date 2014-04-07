package test.dao;

import dao.UserDao;
import model.User;

/**
 * Created by 3 on 3/29/2014.
 */
public class TestUserDao {
    public static void main(String[] args) {

        UserDao userDao = new UserDao();
        //TestAddUser
//        User user = new User();
//        user.setName("Minh");
//        user.setPassword("abc123");
//        user.setAddress("Dong ANh - Ha Noi");
//        userDao.addUser(user);

        //TestExitsUser
        //userDao.exitsUser("Tien");

        System.out.println(userDao.getPassword("Minh"));
    }
}

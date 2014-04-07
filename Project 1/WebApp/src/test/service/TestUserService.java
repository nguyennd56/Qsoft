package test.service;

import service.UserService;

/**
 * Created by 3 on 3/29/2014.
 */
public class TestUserService {
    public static void main(String[] args) {
        UserService userService = new UserService();
            //CheckExit
//        if (userService.checkUserExist("Minh")){
//            System.out.println("Ok");
//
//        }
//        else{
//            System.out.println("False");
//        }

        //CheckLogin
        if (userService.checkLogin("Minh","abc123")){
            System.out.println("Ok");
        }
        else{
            System.out.println("False");
        }
    }
}

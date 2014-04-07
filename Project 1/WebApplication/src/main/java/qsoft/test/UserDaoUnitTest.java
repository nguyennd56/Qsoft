package qsoft.test;

import qsoft.dao.UserDao;
import qsoft.model.User;

import java.util.ArrayList;

/**
 * Created by Nguyen D. Ngo on 3/28/14.
 */
public class UserDaoUnitTest {
    public static void main(String[] args) {
        /*
        *Test count Query;
         */
        if(UserDao.countQuery())
            System.out.println("countQuery() successful!");
        else
            System.out.println("can not countQuery()!");

        /*
        *Test select Query
         */
        if(UserDao.selectQuery()){
            System.out.println("selectQuery() successful");
            ArrayList<User> l = UserDao.getUserList();
            for(int i=0; i<l.size(); i++){
                System.out.print(l.get(i).getId() + "\t" + l.get(i).getName() + "\t");
                System.out.println(l.get(i).getPassword());
            }
        }
        else{
            System.out.println("error selectQuery()");
        }

        /*
        *  Test insert Query
         */
        /*if(UserDao.insertQuery(new User("nguyennd3", "password"))){
            System.out.println("OK");
        }
        else{
            System.out.println("Not done");
        }
*/

        /*
        *Test isInTable
         */
        if(UserDao.isInTable(new User(3, "nguyennd3", "password"))){
            System.out.println("isInTable is OK");
        }
        else
            System.out.println("isInTable not done");

    }
}

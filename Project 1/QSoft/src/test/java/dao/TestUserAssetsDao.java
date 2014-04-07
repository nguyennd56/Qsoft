package dao;

import model.User;
import model.UserAssets;

import java.util.ArrayList;

/**
 * Created by 3 on 3/29/2014.
 */
public class TestUserAssetsDao {
    public static void main(String[] args) {
        UserAssetsDao userAssetsDao = new UserAssetsDao();

        //TestAddUserAssets
//        UserAssets userAssets = new UserAssets();
//        userAssets.setUserId(1);
//        userAssets.setAssetsId(1);
//        userAssets.setNumber(2);
//        userAssetsDao.addUserAssets(userAssets);

        //TestListUserAssets
        User user = new User();
        user.setId(2);
        ArrayList<UserAssets> userAssetsArrayList = new ArrayList<UserAssets>();
        userAssetsArrayList = userAssetsDao.listAssetsToUser(user);
        UserAssets userAssets = userAssetsArrayList.get(0);
        System.out.println(userAssets.getAssetsId());
        //TestRemoveUserAssets
        //userAssetsDao.removeUserAssets(1);


    }
}

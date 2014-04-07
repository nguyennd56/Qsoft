package service;

import dao.UserAssetsDao;
import model.Assets;
import model.UserAssets;
import util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by 3 on 3/30/2014.
 */
public class UserAssetsService {
    public UserAssetsDao userAssetsDao = new UserAssetsDao();
    public UserAssets userAssets = new UserAssets();

    public void addUserAssets(int idUser,int idAssets,int number){
        userAssets.setUserId(idUser);
        userAssets.setAssetsId(idAssets);
        userAssets.setNumber(number);
        userAssetsDao.addUserAssets(userAssets);
    }
    public ArrayList<UserAssets> listAssetsToUser(int idUser) {
        return userAssetsDao.listAssetsToUser(idUser);
    }
}

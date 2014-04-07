package dao;

import model.Assets;
import model.User;
import model.UserAssets;
import util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by 3 on 3/29/2014.
 */
public class UserAssetsDao {
    public String addUserAssetsQuery = "INSERT INTO user_assets(user_id,assets_id,number) values (?,?,?)";
    public String removeUserAssetsQuery = "DELETE FROM user_assets WHERE id = ?";
    public String listAssetsToUser = "SELECT * FROM user_assets WHERE user_id= ?";

    public boolean addUserAssets(UserAssets userAssets) {
        try {
            PreparedStatement stmt = DbUtil.getConnection().prepareStatement(addUserAssetsQuery);
            stmt.setInt(1, userAssets.getUserId());
            stmt.setInt(2, userAssets.getAssetsId());
            stmt.setInt(3, userAssets.getNumber());
            stmt.executeUpdate();
            System.out.println("add UserAssets successful");
            stmt.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<UserAssets> listAssetsToUser(int idUser) {

        ArrayList<UserAssets> userAssetsList = new ArrayList<UserAssets>();
        try {
            PreparedStatement stmt = DbUtil.getConnection().prepareStatement(listAssetsToUser);
            stmt.setInt(1, idUser);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                UserAssets userAssets = new UserAssets();
                userAssets.setAssetsId(rs.getInt(3));
                userAssets.setNumber(rs.getInt(4));
                userAssetsList.add(userAssets);
            }
            return userAssetsList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
  //Delete Assets form user
  public boolean removeUserAssets(int id){
      try{
          PreparedStatement stmt = DbUtil.getConnection().prepareStatement(removeUserAssetsQuery);
          stmt.setInt(1,id);
          stmt.executeUpdate();
          System.out.println("ok Remove done");
          stmt.close();
          return true;
      } catch (SQLException e){
          e.printStackTrace();
      }
      return false;
  }
}

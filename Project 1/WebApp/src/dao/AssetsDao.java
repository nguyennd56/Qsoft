package dao;

import model.Assets;
import util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * Created by 3 on 3/29/2014.
 */
public class AssetsDao {
    public String addAssetsQuery = "INSERT INTO assets(name,price,purchasedate) values (?,?,NOW())";
    public String existAssestQuery = "SELECT * FROM assets WHERE name = ?";
    public String removeAssetsQuery = "DELETE * FROM assets WHERE name = ?";
    public String getIdQuery = "SELECT id FROM assets WHERE name=?";
    public String getNameQuery = "SELECT * FROM assets WHERE id=?";
    public boolean addAssets(Assets assets){
        try {
            PreparedStatement stmt = DbUtil.getConnection().prepareStatement(addAssetsQuery);
            stmt.setString(1, assets.getName());
            stmt.setDouble(2, assets.getPrice());
            //stmt.setString(3, new Date().toString());
            stmt.executeUpdate();
            System.out.println("update successful");
            stmt.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean existAssets(String name){
        try{
            PreparedStatement stmt = DbUtil.getConnection().prepareStatement(existAssestQuery);
            stmt.setString(1,name);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()){
                System.out.println("Assets exist");
            }
            else {
                System.out.println("Assets Not exist");
            }
            stmt.close();
            return true;
        } catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    public boolean removeAssets(String name){
        try{
            PreparedStatement stmt = DbUtil.getConnection().prepareStatement(removeAssetsQuery);
            stmt.setString(1,name);
            stmt.executeUpdate();
            System.out.println("ok Remove done");
            stmt.close();
            return true;
        } catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    public int getId(String name){
        try{
            PreparedStatement stmt = DbUtil.getConnection().prepareStatement(getIdQuery);
            stmt.setString(1,name);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return 0;
    }
    public String getName(int id){
        try{
            PreparedStatement stmt = DbUtil.getConnection().prepareStatement(getNameQuery);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                return rs.getString("name");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}

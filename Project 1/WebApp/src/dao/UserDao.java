package dao;

import model.User;
import util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by 3 on 3/29/2014.
 */
public class UserDao {

    String addUserQuery = "INSERT into user(name, password, address) values(?,?,?)";
    String existUserQuery = "SELECT * from user where name = ?";
    String getPasswordQuery = "SELECT password from user where name=?";
    String getIdQuery = "SELECT id from user where name=?";
    public boolean addUser(User user){
        try{
            PreparedStatement stmt = DbUtil.getConnection().prepareStatement(addUserQuery);
            stmt.setString(1,user.getName() );
            stmt.setString(2, user.getPassword());
            stmt.setString(3,user.getAddress());
            stmt.executeUpdate();
            System.out.println("update successful");
            stmt.close();
            return true;
        }
        catch(Exception e){
            e.printStackTrace();

        }
        return false;
    }
    public boolean exitsUser(String name){
        try{
            PreparedStatement stmt = DbUtil.getConnection().prepareStatement(existUserQuery);
            stmt.setString(1,name);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()){
                return true;
                // System.out.println("User exist");
            }
            else {
                return false;
                //System.out.println("User Not exist");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    public String getPassword(String name){
        try{
            PreparedStatement statement = DbUtil.getConnection().prepareStatement(getPasswordQuery);
            statement.setString(1,name);
            ResultSet rs = statement.executeQuery();
            if (rs.next()){
                return rs.getString(1);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    public int getId(String name){
        try{
            PreparedStatement statement = DbUtil.getConnection().prepareStatement(getIdQuery);
            statement.setString(1,name);
            ResultSet rs = statement.executeQuery();
            if (rs.next()){
                return rs.getInt(1);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
     return 0;
    }
}

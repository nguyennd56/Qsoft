package qsoft.dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import qsoft.model.User;
import qsoft.util.DbUtil;

import javax.swing.*;

/**
 * Created by Nguyen D. Ngo on 3/28/14.
 */
public class UserDao {
    private static ArrayList<User> userList;
    private static int count;
    public static ArrayList<User> getUserList(){
        return userList;
    }
    public static int getCount(){
        return count;
    }
    private static final String countQuery = "SELECT count(*) from user";
    private static final String selectAllQuery = "SELECT * from user";
    private static final String insertQuery = "INSERT into user(name, password, address) values(?,?,?)";
    public static boolean isInTable(User u){
        boolean inTable = true;
        selectQuery();
        for(int i =0; i<userList.size(); i++){
            if(u.getId() == userList.get(i ).getId()){
                inTable = true;
                break;
            }
        }
        return inTable;
    }
    public static boolean countQuery(){

        try{
            Statement stmt  = DbUtil.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(countQuery);
            if(rs.next()){
                count = rs.getInt("count(*)");
                rs.close();
                System.out.println(count);
                return true;
            }
            return false;

        }catch(Exception e){}
        return true;
    }

    public static boolean selectQuery(){
        try{
            Statement stmt = DbUtil.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(selectAllQuery);
            userList = new ArrayList<User>();
            while(rs.next()){
                User u = new User(rs.getInt("id"), rs.getString("name"), rs.getString("password"));
                userList.add(u);
            }

            rs.close();
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public static boolean insertQuery(User u){
        try{
            PreparedStatement stmt = DbUtil.getConnection().prepareStatement(insertQuery);
            stmt.setString(1, u.getName());
            stmt.setString(2, u.getPassword());
            stmt.setString(3,"address");
            int count = stmt.executeUpdate();
            System.out.println("update successful" + count );
            stmt.close();
            return true;
        }
        catch(Exception e){
            e.printStackTrace();

        }
        return false;
    }

}

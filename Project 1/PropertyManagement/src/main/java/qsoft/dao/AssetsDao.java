package qsoft.dao;

import qsoft.model.Assets;
import qsoft.util.DbUtil;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by Nguyen D. Ngo on 3/28/14.
 */
public class AssetsDao {
    private static String select = "SELECT * from assets";
    private static String insert = "INSERT into assets(name, price, purchaseDate) values(?,?,?)";
    public static boolean insertQuery(Assets a){
        boolean isAdd = false;
        try{
            PreparedStatement stmt = DbUtil.getConnection().prepareStatement(insert);
            stmt.setString(1, a.getName());
            stmt.setString(2, a.getPrice());
            stmt.setDate(3, (Date) a.getPurchaseDate());
            System.out.println("insert done!");
            isAdd = true;
        }catch (Exception e){e.printStackTrace();}
        return  isAdd;
    }
    public static ArrayList<Assets> selectQuery(){
        ArrayList<Assets> assetList = new ArrayList<Assets>();
        try{
            Statement stmt = DbUtil.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(select);
            while(rs.next()){

                assetList.add(
                        new Assets(rs.getInt("id"),
                                rs.getString("name") ,
                                rs.getString("price"),
                                rs.getDate("purchaseDate")
                        )
                );
            }
        }
        catch(Exception e){e.printStackTrace();}
        return assetList;
    }

    public static boolean isInTable(Assets a){
        boolean inTable = false;
        try{
            ArrayList<Assets> al = selectQuery();
            for(int i=0; i<al.size(); i++){
                if(a.getId() == al.get(i).getId() ){
                    inTable = true;
                    break;
                }
            }
        }catch (Exception e){e.printStackTrace();}
        return  inTable;
    }
}

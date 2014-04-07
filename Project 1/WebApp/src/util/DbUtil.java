package util;

import java.sql.*;

/**
 * Created by 3 on 3/29/2014.
 */
public class DbUtil {

    private static String db_url = "jdbc:mysql://localhost:3306/qsoft";
    private static String user = "root";
    private static String pass = "";
    private static String driver = "com.mysql.jdbc.Driver";

    public static Connection getConnection(){

        try {
            try {
                Class.forName(driver).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection con = null;
        try {
            con = DriverManager.getConnection(db_url, user, pass);
            System.out.println("connected!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}

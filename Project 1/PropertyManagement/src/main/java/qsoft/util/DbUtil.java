package qsoft.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Nguyen D. Ngo on 3/28/14.
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

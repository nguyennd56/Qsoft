package test.util;

import util.DbUtil;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by 3 on 3/29/2014.
 */
public class TestDbUtil {
    public static void main(String[] args) throws SQLException {
        Connection connection = DbUtil.getConnection();
        if(connection==null)
            System.out.println("connection null!");
        else
            System.out.println("connect successful");
    }

}

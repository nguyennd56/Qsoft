package qsoft.test;

import qsoft.util.DbUtil;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Nguyen D. Ngo on 3/28/14.
 */
public class DbUtilUnitTest {
    public static void main(String[] args) throws SQLException {
       Connection connection = DbUtil.getConnection();
       if(connection==null)
           System.out.println("connection null!");
        else
           System.out.println("connect successful");
    }

}

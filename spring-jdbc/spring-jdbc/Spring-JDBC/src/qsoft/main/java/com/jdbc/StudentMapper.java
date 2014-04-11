package qsoft.main.java.com.jdbc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Nguyen D. Ngo on 4/11/14.
 */
public class StudentMapper implements RowMapper{

    @Override
    public Student mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
        Student student = new Student();
        student.setId(resultSet.getInt(rowNumber));
        student.setName(resultSet.getString(rowNumber));
        student.setAge(resultSet.getInt(rowNumber));

        return student;
    }
}

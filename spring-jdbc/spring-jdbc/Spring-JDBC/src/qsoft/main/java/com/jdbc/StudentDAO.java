package qsoft.main.java.com.jdbc;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by Nguyen D. Ngo on 4/11/14.
 */
public interface StudentDAO {
    public void setDataSource(DataSource ds);
    public void createEntity(String name, Integer age);
    public Student getStudent(Integer id);
    public List<Student> listStudents();
    public void deleteEntity(Integer id);
    public void update(Integer id, Integer age);
}

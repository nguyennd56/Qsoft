package qsoft.main.java.com.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;
import java.util.List;
/**
 * Created by Nguyen D. Ngo on 4/11/14.
 */
public class StudentJDBC implements StudentDAO{
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(javax.sql.DataSource ds) {
        this.dataSource = ds;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    public void createEntity(String name, Integer age) {
        String SQL = "insert into student (name, age) values (?, ?)";

        jdbcTemplate.update(SQL, new Object[]{name, age});
        //jdbcTemplate.update(SQL, name, age);
        System.out.println("Created Record Name = " + name + " Age = " + age);
        return;
    }
    public Student getStudent(Integer id) {
        String SQL = "Select * from student where id = ?";
        Student student = (Student)jdbcTemplate.queryForObject(SQL, new Object[]{id}, new StudentMapper());

        return student;
    }

    public List<Student> listStudents() {
        String SQL = "select * from student";
        List<Student> students = jdbcTemplate.query(SQL, new StudentMapper());
        return students;
    }
    public void deleteEntity(Integer id) {
        String SQL = "delete from student where id=?";
        jdbcTemplate.update(SQL, new Object[]{id});
        return;
    }
    public void update(Integer id, Integer age) {
        String SQL = "update student set age=? where id=?";
        jdbcTemplate.update(SQL, new Object[]{age, id});
        return;
    }
}

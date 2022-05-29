package es.eoi.jdbc.repository;

import es.eoi.jdbc.entity.Student;

import java.sql.*;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository{

    private Connection openConnection() throws SQLException {

        final String url = "jdbc:mysql://127.0.0.1:3306/jdbcproject";
        final String user = "root";
        final String password = "1234";

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(String.format("[DEBUG] Already Connected to  %s", url));


        return  connection;
    }


    @Override
    public Student findById(String id) throws SQLException {

       /* Statement statement = openConnection().createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM student WHERE  id=1");

        Student std=new Student(resultSet.getInt("id"),resultSet.getString("name"),resultSet.getString("surname")
        , resultSet.getString("birth_date"));

        openConnection().close();*/

        return null;


    }




    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public void create(Student student) throws SQLException {

       /* Statement statement = openConnection().createStatement();
        statement.executeUpdate("INSERT INTO student VALUES (0,'Mario','Lopez','20-20-20')");

        openConnection().close();
        // create a Statement from the connectionStatement statement = conn.createStatement();// insert the datastatement.executeUpdate("INSERT INTO Customers " + "VALUES (1001, 'Simpson', 'Mr.', 'Springfield', 2001)");
*/
    }

    @Override
    public boolean delete(String id) {




        return false;
    }

    @Override
    public Student update(Student student) {




        return null;
    }
}

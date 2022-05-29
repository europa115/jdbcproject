package es.eoi.jdbc.repository;

import es.eoi.jdbc.entity.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;


public interface StudentRepository {

   private Connection openConnection() throws SQLException {

       final String url = "jdbc:mysql://127.0.0.1:3306/base";
       final String user = "root";
       final String password = "1234";

       Connection connection = DriverManager.getConnection(url, user, password);
       System.out.println(String.format("[DEBUG] Already Connected to  %s", url));


       return  connection;
   }
    public Student findById(String id);
    public List<Student> findAll();
    public Student create(Student student);
    public boolean delete(String id);
    public Student update(Student student);


}

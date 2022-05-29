package es.eoi.jdbc.repository;

import es.eoi.jdbc.entity.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;


public interface StudentRepository {

    public Student findById(String id) throws SQLException;
    public List<Student> findAll();
    public void create(Student student) throws SQLException;
    public boolean delete(String id);
    public Student update(Student student);


}

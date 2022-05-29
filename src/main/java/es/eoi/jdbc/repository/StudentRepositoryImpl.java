package es.eoi.jdbc.repository;

import es.eoi.jdbc.entity.Student;

import java.sql.*;
import java.util.List;

public class StudentRepositoryImpl implements StudentRepository{

    private Connection openConnection() throws SQLException {

        final String url = "jdbc:mysql://127.0.0.1:3306/base";
        final String user = "root";
        final String password = "1234";

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(String.format("[DEBUG] Already Connected to  %s", url));


        return  connection;
    }


    @Override
    public Student findById(String id) throws SQLException {

        return null;
    }




    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student create(Student student) throws SQLException {



        return null;
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

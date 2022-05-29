package es.eoi.jdbc.service;

import es.eoi.jdbc.entity.Student;
import es.eoi.jdbc.repository.StudentRepository;
import es.eoi.jdbc.repository.StudentRepositoryImpl;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class StudentService implements  StudentRepository{

    StudentService(){

        repository=new StudentRepositoryImpl();



    }

    private StudentRepositoryImpl repository;

    @Override
    public Student findById(String id) {



        return null;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public void create(Student student) {




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

package es.eoi.jdbc.service;

import es.eoi.jdbc.entity.Student;
import es.eoi.jdbc.repository.StudentRepository;

import java.util.List;

public class StudentService {

    StudentService(){


        repositorio=new StudentRepository() {
            @Override
            public Student findById(String id) {
                return null;
            }

            @Override
            public List<Student> findAll() {
                return null;
            }

            @Override
            public Student create(Student student) {
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
        };


    }

    private StudentRepository repositorio;

}

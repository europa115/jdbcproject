package es.eoi.jdbc.entity;

import java.util.Date;

public class Student {

    public Student(int id, String name, String surName, Date birth_date) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.birth_date = birth_date;
    }

    private int id;

    private String name;

    private  String surName;

    private Date birth_date;

}

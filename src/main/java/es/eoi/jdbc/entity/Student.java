package es.eoi.jdbc.entity;

import java.util.Date;

public class Student {

    public Student(int id, String name, String surName, String birth_date) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.birth_date = birth_date;
    }

    public static void imprimeStudent(Student t){


        System.out.println(t.id+"---"+t.name+"---"+t.surName+"---"+t.birth_date);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    private int id;

    private String name;

    private  String surName;

    private String birth_date;

}

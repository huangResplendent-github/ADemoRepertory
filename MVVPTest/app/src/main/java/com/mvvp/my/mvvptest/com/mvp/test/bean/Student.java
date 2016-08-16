package com.mvvp.my.mvvptest.com.mvp.test.bean;

/**
 * Created by huangResplendent on 16/7/26.
 */
public class Student {
    private static Student student;
    private int id;
    private String name;
    private String age;

    public static final Student getInstance(){
        if(student==null){
            student=new Student();
            student.age="21";
            student.name="huangResplendent";
        }
        return student;
    }

    public Student() {
    }

    public Student(int id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

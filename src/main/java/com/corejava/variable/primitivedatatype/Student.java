package com.corejava.variable.primitivedatatype;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Student {
    //static Variable
    public static final String School = "DPS";

    //Instance Variable
    private String name;
    private int id;
    private char grade;
    private Marks marks;

    //parameterized Constuctor
    public Student(String name, int id, char grade, int maths, int science, int english){
        this.name = name;
        this.id = id;
        this.grade = grade;
        this.marks = new Marks(maths, science, english);

    }
    public void printStudent(){
        log.info(School);
        log.info("Student_Name: " +name+ " Student_ID: " +id+ " Student_Grade: " +grade);
        marks.printMarks();

    }

}

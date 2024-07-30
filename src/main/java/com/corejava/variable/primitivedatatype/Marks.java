package com.corejava.variable.primitivedatatype;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Marks {
    //Instance Variable
    private int maths;
    private int science;
    private int english;

    // Parametirized Constructor

    public Marks(int maths, int science, int english) {
        this.maths = maths;
        this.science = science;
        this.english = english;
    }

    public void printMarks(){
        log.info("Maths_Marks: " +maths+ " Science_Marks: " +science+ " English_Marks: " +english);

    }
}

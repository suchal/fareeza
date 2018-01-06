package com.example.suchal.quiz.Model;

/**
 * Created by Hashim Ali Khan on 1/4/2018.
 */

public class exam {
    subject Subject;
    student Student;
    float marks;
    int term;

    public subject getSubject() {
        return Subject;
    }

    public void setSubject(subject subject) {
        Subject = subject;
    }

    public student getStudent() {
        return Student;
    }

    public void setStudent(student student) {
        Student = student;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }
}

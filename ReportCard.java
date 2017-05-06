package com.example.android.report;

import java.util.Arrays;

/**
 * Irish Primary School Report Card
 * Created by Cian on 06/05/2017.
 */

public class ReportCard {

    // Variables
    private static final String School = "Scoil Naoife Mhuire";
    private String mStudent, mYear, mSubject[], mTeacher[], mComment[];
    private char mGrade[];

    public ReportCard (String student, String year, String[] subject,
                       String[] teacher, String[] comment, char[] grade) {
        this.mStudent = student;
        this.mYear = year;
        this.mSubject = subject;
        this.mTeacher = teacher;
        this.mComment = comment;
        this.mGrade = grade;
    }

    public String getStudent(){
        return mStudent;
    }

    public void setStudent(String student){
        this.mStudent = student;
    }

    public String getYear(){
        return mYear;
    }

    public void setYear(String year){
        this.mYear = year;
    }

    public String[] getComment(){
        return mComment;
    }

    public void setComment(String[] comment){
        this.mComment = comment;
    }

    public String[] getTeacher(){
        return mTeacher;
    }

    public void setTeacher(String[] teacher){
        this.mTeacher = teacher;
    }

    public String[] getSubject(){
        return mSubject;
    }

    public void setSubject(String[] subjects){
        this.mSubject = subjects;
    }

    public char[] getGrade(){
        return mGrade;
    }

    public void setGrade(char[] grade){
        this.mGrade = grade;
    }

    @Override
    public String toString(){
        return "School: " + School
                + "\nStudent: " + mStudent
                + " Year: " + mYear
                + "\nSubjects: " + Arrays.toString(mSubject)
                + " Teacher: " + Arrays.toString(mTeacher)
                + " Comment: " + Arrays.toString(mComment)
                + " Grade: " + Arrays.toString(mGrade);
    }
}

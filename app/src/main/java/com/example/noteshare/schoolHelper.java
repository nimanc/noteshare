package com.example.noteshare;

public class schoolHelper {
    String school, board, grade, location;


    public schoolHelper() {
    }

    public schoolHelper(String school, String board, String grade, String location) {
        this.school = school;
        this.board = board;
        this.grade = grade;
        this.location = location;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

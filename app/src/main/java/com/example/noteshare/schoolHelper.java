package com.example.noteshare;


public class schoolHelper {
    String school, board, grade, phone, locationS;
    public schoolHelper() {
    }

    public schoolHelper(String school, String board, String grade, String phone, String locationS) {
        this.school = school;
        this.board = board;
        this.grade = grade;
        this.locationS = locationS;
        this.phone = phone;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocationS() {
        return locationS;
    }

    public void setLocationS(String locationS) {
        this.locationS = locationS;
    }
}

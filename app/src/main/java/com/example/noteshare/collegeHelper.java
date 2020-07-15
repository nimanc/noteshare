package com.example.noteshare;

public class collegeHelper {
    String college, university, session, locationC;

    public collegeHelper() {
    }

    public collegeHelper(String college, String university, String session, String locationC) {
        this.college = college;
        this.university = university;
        this.session = session;
        this.locationC = locationC;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public String getLocationC() {
        return locationC;
    }

    public void setLocationC(String locationC) {
        this.locationC = locationC;
    }
}

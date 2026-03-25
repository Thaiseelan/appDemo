package com.practice.Student;

public class students {
    private int StuId;
    private String StuName;

    public students(int StuId, String StuName) {
        this.StuId = StuId;
        this.StuName = StuName;
    }

    public int getStuId() {
        return StuId;
    }

    public void setStuId(int StuId) {
        this.StuId = StuId;
    }

    public String getStuName() {
        return StuName;
    }

    public void setStuName(String StuName) {
        this.StuName = StuName;
    }
}

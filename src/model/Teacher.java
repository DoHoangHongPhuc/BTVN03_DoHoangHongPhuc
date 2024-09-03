package model;

public class Teacher {
    private String iD, teacherName, major;
    private int age;

    public Teacher(int age, String iD, String major, String teacherName) {
        this.age = age;
        this.iD = iD;
        this.major = major;
        this.teacherName = teacherName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getNameTeacher() {
        return teacherName;
    }

    public void setNameTeacher(String nameTeacher) {
        this.teacherName = nameTeacher;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "age=" + age +
                ", iD='" + iD + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}

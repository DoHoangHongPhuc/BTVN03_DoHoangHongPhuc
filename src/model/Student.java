package model;

public class Student {
    private String iD;
    private String studentName;
    private String dob;
    private int age;
    private String className;
    private double weight;
    private double height;

    public Student(int age, String className, String dob, double height, String iD, String studentName, double weight) {
        this.age = age;
        this.className = className;
        this.dob = dob;
        this.height = height;
        this.iD = iD;
        this.studentName = studentName;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String printValue(int age) {
        return "Tuoi la " + age;
    }

    public String printValue(String name, int age) {
        return name + ":" + age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", iD='" + iD + '\'' +
                ", studentName='" + studentName + '\'' +
                ", dob='" + dob + '\'' +
                ", className='" + className + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}

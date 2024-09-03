package main;

import model.Student;
import model.Teacher;

import static main.Chucnang.calculateBMIOfStudent;

public class Test {
    public static void main(String[] args) {


        Student student1 = new Student(19, "SE1901", "19-6-2005", 1.65, "CE190614", "Tan Dat", 67);
        Student student2 = new Student(19, "SE1901", "30-1-2005", 1.70, "CE190615", "Minh Nam", 65);
        Teacher teacher1 = new Teacher(45, "S5109", "Computer Science", "John Van");
        Teacher teacher2 = new Teacher(46, "S810", "Math for engineer", "Peter Wall");
        System.out.println("Student1 :" + student1);
        student1.setStudentName("Tan Wuoc");
        student1.setAge(21);
        student1.setClassName("SE1906");
        student1.setDob("30-1-2003");
        student1.setHeight(1.80);
        student1.setWeight(70);
        System.out.println("Student1's information after changing: ");
        System.out.println(student1);
        System.out.println("BMI of student1 is: " + calculateBMIOfStudent(student1.getHeight(), student1.getWeight()));
        System.out.println(student1.printValue(student1.getAge()));
        System.out.println();

        System.out.println("Student2 :" + student2);
        student2.setStudentName("Manh Cuong");
        student2.setAge(30);
        student2.setClassName("SE1907");
        student2.setDob("30-1-1994");
        student2.setHeight(1.75);
        student2.setWeight(65);
        System.out.println("Student2's information after changing: ");
        System.out.println(student2);

        System.out.println("BMI of student1 is: " + calculateBMIOfStudent(student2.getHeight(), student2.getWeight()));
        System.out.println(student2.printValue(student2.getAge()));
        System.out.println();

        System.out.println("Teacher1: " + teacher1);
        teacher1.setAge(46);
        teacher1.setiD("S5107");
        teacher1.setNameTeacher("John Taylor");
        teacher1.setMajor("Data base");
        System.out.println("Teacher1's information after changing: ");
        System.out.println(teacher1);
        System.out.println();

        System.out.println("Teacher2: " + teacher2);
        teacher2.setAge(51);
        teacher2.setiD("S5115");
        teacher2.setNameTeacher("Megan Huge");
        teacher2.setMajor("Soft Skill");
        System.out.println("Teacher2's information after changing: ");
        System.out.println(teacher2);


    }
}
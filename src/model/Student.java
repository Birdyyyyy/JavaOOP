package model;

public class Student {

    private String studentName;

    private int age;

    private String gender;

    private int IDNumber;

    public Student() {};

    public Student(String studentName,int age, String gender,int IDNumber) {
        this.studentName = studentName;
        this.age =age;
        this.gender = gender;
        this.IDNumber = IDNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }
}

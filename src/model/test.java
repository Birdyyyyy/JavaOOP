package model;

public class test {
    public static void main (String[] args) {
        Student stu = new Student("Birdy",20,"Female",1);
        System.out.println(stu.getStudentName()+" "+stu.getAge()+" "+stu.getGender()+" "+stu.getIDNumber());
    }
}

package lesson5;

public class Employee {
    String fullName;
    String position;
    String email;
    int phoneNumber;
    int salary;
    int age;



    public  Employee(String fullName, String position, String email, int phoneNumber, int salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

    }
    public void printInfo(){
        System.out.printf("\nФИО - %s\nдолжность - %s\nпочта - %s\nтелефон - %d\nзарплата - %d\nвозраст - %d\n",fullName,position,email,phoneNumber,salary,age);

    }
}

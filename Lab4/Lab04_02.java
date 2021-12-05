import java.util.Scanner;

// A program to demonstrate custom exceptions. Create a com.myname.stuent.Student class with three private fields name, rollNo, & CPI. Create Getter and Setter for all the fields, override the public String toString() method of Object class, to represent Student objects as String. Create a com.myname.main.StudentMain class which is the implementation class contains main method and a search() method. main method will create a list of students i.e array and initialize each objects by taking input from user using java.util.Scanner class.
//  This method will also call search method and print the result. search() method will accept two arguments first is Student[] list and int rollNo. 
// This method will return Student object if rollNo matches with any of the Student object or else it will throw an user defined exception InvalidStudentException. com.myname.exception.InvalidStudentException is a class which extends java.lang.Exception class and have one parameterized constructor which accept an argument String message.

class Student {
    private int rollNo;
    private int Cpi;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getCpi(){
        return Cpi;
    }
    public void setCpi(int Cpi){
        this.Cpi=Cpi;
    }
    public int getRollno(){
        return rollNo;
    }
    public void setRollno(int rollNo){
        this.rollNo=rollNo;
    }
    @Override
    public String toString(){
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", Cpi=" + Cpi +
                '}';
    }
}
class StudentMain{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the student");
        public int n=sc.nextInt();
        String Student[]=new String[n];
        Student obj = new Student();
        // int rollNo[]=new int[n];
        // int Cpi[]=new int[n];
        String s;
        int r,c;
        for(int i=0;i<n;i++){
            System.out.println("Enter name:- ");
            s=sc.nextLine();
            Student[i]=s;
            
            System.out.println("Enter Rollno:- ");
            r=sc.nextInt();
            // rollNo[i]=r;
            System.out.println("Enter Cpi:- ");
            
            // c=sc.nextInt();
            // Cpi[i]=c;
        }
        System.out.println("Enter rollno you want to access:- ");
        r=sc.nextInt();

    }
    public Student search(String Student[],int r){
        for (Student student : list) {
            if(student.getRollNo() == rollNo){
                response = student;
                break;
            }
        }

    }
}
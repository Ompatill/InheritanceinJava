package com.infogalaxy;

import javax.naming.Name;
import java.util.Scanner;

public class Student {
    String Name;
    int Id;
    Scanner sc = new Scanner(System.in);

        public void setStudent(){
            System.out.println("Enter the Student Name:");
            Name = sc.next();
            System.out.println("Enter the Student ID:");
            Id = sc.nextInt();
        }
}
class Result extends Student {

    Double Perc;
    public void setMarks(){

        System.out.println("Enter the Percentage");
        Perc = sc.nextDouble();
    }
    public void getResult() {
        System.out.println("Student Name:"+Name);
        System.out.println("Student ID:"+Id);
        System.out.println("Student Percentage:"+Perc);
    }
}
class Main {
    public static void main(String args[]){
        Result result = new Result();
        result.setStudent();
        result.setMarks();
        result.getResult();
    }
}




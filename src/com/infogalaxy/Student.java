package com.infogalaxy;

import java.util.Scanner;

public class Student {
    String Name;
    int Id;
    Scanner sc = new Scanner(System.in);
        //  Student's Data
        public void setStudent(){
            System.out.println("Enter the Student Name:");
            Name = sc.next();
            System.out.println("Enter the Student ID:");
            Id = sc.nextInt();
        }
}
class InternalMarks extends Student {
    int im1;
    int im2;
    //Student's Internal Marks
    public void setInternal() {
        System.out.println("Enter the 1st Internal Marks of " + Name + ":");
        im1 = sc.nextInt();
        System.out.println("Enter the 2nd Internal Marks of " + Name + ":");
        im2 = sc.nextInt();
    }
}


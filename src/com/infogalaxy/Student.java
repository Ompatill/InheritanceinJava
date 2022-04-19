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

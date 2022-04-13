package com.infogalaxy;

public class Result extends InternalMarks {

        int total;
        Double percentage;

        // Calculating Student's Result
        public void Calculate(){
            total = im1+im2;
            percentage = total/2.0;
            if (percentage <= 35.0){
                System.out.println(Name+" is Fail ");
            }
            else {
                System.out.println(Name+" is Pass ");
            }
            System.out.println("Percentage of " +Name+ " :"+percentage);
        }
        // Displaying Student Data
        public void showResult() {
            System.out.println("Student Name : "+Name);
            System.out.println(Name+ " ID : "+Id);
            System.out.println("1 Internal Marks :"+im1);
            System.out.println("2 Internal Marks :"+im2);
            System.out.println("Total of Internal Marks : "+total);
            System.out.println( Name+ " Percentage : "+percentage);
        }

    }
class Main {
    // Main Function
    public static void main(String args[]){
        Result result = new Result();
        result.setStudent();
        result.setInternal();
        result.Calculate();
        result.showResult();
    }
}








package com.infogalaxy;

public class Resultimpl extends Student implements ISportsSector {
    int perc;
    void setPer(){
        System.out.println("Enter the Percentage :");
        perc = sc.nextInt();
    }
    @Override
    public void calculate(){
        if( perc < 35 && perc > 30){
            perc = perc + sperc;
        }
    }
    void showResult(){
        System.out.println("ID:"+Id);
        System.out.println("Name:"+Name);
        System.out.println("Percentage:"+ perc);
    }
}

package com.VakhovYS;

public class Main {

    public static void main(String[] args) {

        int a = (int) (5 + Math.random()*155);

        if (a>= 25 && a<=100) {
            System.out.println("Число " + a + " входит в интервал (25, 100)");
        }else{
            System.out.println("Число "+ a +" не входит в интервал (25, 100)");




        }
    }
}

package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//       Первое задание
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("Четное");
        }else{
            System.out.println("Нечетное");
        }
////////////////////////////////////////////////////////////
        ///Второе задание/////
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter 2 числа для сравнения с 10");

        double i = sc1.nextInt();
        double k = sc1.nextInt();
        int c = 10;

        double a = Math.abs(c-i);
        double b = Math.abs(c-k);

        if(b==a){
            System.out.println("Числа "+i+"и "+k+"равноудаленны от "+a);
        }
        if(b>a){
            System.out.println("Числo "+i+" ближе к "+a);
        }
        if(b<a){
            System.out.println("Числo "+k+" ближе к  "+a);
        }
    }
}

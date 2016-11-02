package com.VakhovYS;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double a;
        double v;
        Circle c = new Circle();
        Circle c2 = new Circle();
        // c.createRadius();// Заданиие 2
        // c.printCircle();//Задание 2
        // c2.printCircle();// выводит рандомные координаты центар
        c2.distanceCirlce(c);// Задание 4
        c.lengthCircle();
        //c.moveCircle();//
        if(c.hitCircle(c2)){    //задание 5
            System.out.println("Hits in 1 point");
        }else
        {
            System.out.println("Circls doesnt hit");
        }

    }
}






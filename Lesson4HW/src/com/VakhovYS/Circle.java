package com.VakhovYS;


import java.util.Scanner;

public class Circle {
    public double x = 0;
    public double y = 0;
    public double R = 0;

    Scanner sc = new Scanner(System.in);

    Circle() {
        System.out.println("Enter X");
        x = sc.nextDouble();

        System.out.println("Enter Y");
        y = sc.nextDouble();

        System.out.println("Enter Raduis");
        R = sc.nextDouble();

    }

    public double distanceCirlce(Circle cr) {
        double distanceX = Math.abs(this.x - cr.x);
        double distanceY = Math.abs(this.y - cr.y);
        double distance = Math.sqrt(distanceX * distanceX + distanceY * distanceY);
        System.out.println("Distance = "+distance);
        return distance;

    }

    public void createRadius() {
        System.out.println("Enter Raduis");
        R = sc.nextDouble();
    }

    public void moveCircle() {
        double a = (int) (Math.random() * 199 - 99);
        double b = (int) (Math.random() * 199 - 99);
        x = x + a;
        y = y + b;
        System.out.println("crircle moves on points X:= " + x + " Y:= " + y + " radius " + R);
    }

    public void printCircle() {
        x = (int) (Math.random() * 199 - 99);
        y = (int) (Math.random() * 199 - 99);
        System.out.println("Circle with center on x: " + x + " and y: " + y + " Radius = " + R);
    }

    public double lengthCircle() {
        double length = Math.PI * 2 * R;
        System.out.println("Length = " + length);
        return length;
    }

    public boolean hitCircle(Circle cr) {
        if(this.distanceCirlce(cr)==(double)(this.R+cr.R)||this.distanceCirlce(cr)==(double)(this.R-cr.R)) {
            if(this.x!=cr.x||this.y!=cr.y||this.R!=cr.R) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

}}

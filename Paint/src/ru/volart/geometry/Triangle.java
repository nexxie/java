package ru.volart.geometry;

import java.awt.*;

/**
 * Created by vakhovys on 09.11.2016.
 */
public class Triangle implements Shape {


    private Point pT1,pT2,pT3;



    public Point getpT1() {

        return pT1;
    }

    public Point getpT2() {
        return pT2;
    }

    public Point getpT3() {
        return pT3;
    }

    public Triangle(Point t1, Point t2, Point t3) {
        if(t1.getColl(t2,t3)!= true){
        pT1 = t1;
        pT3 = t3;
        pT2 = t2;
    }else{
            System.out.println("all bad 2");

        }}

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.cyan);
        g.drawLine(pT1.getX(), pT1.getY(), pT2.getX(), pT2.getY());
        g.drawLine(pT2.getX(), pT2.getY(), pT3.getX(),pT3.getY());
        g.drawLine(pT3.getX(), pT3.getY(), pT1.getX(), pT1.getY());

    }
}

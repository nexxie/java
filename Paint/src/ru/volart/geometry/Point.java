package ru.volart.geometry;

import java.awt.*;

/**
 * Created by volart on 07.11.16.
 */
public class Point implements Shape {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }



    public int distance(Point p) {
        return (int) Math.sqrt(Math.pow((p.x - x), 2) + Math.pow((p.y - y), 2));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean  getColl(Point c1,Point c2){

        if (((x * c1.y + c1.x * c2.y + c2.x * y) - (c1.x * y + c2.x * c1.y + x * c2.y))/2 == 0) {
            return true;
        }else System.out.println("all not good");
            return false;
            }




    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawOval(x, y, 1, 1);
    }

}
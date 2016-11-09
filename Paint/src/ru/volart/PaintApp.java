package ru.volart;

import ru.volart.geometry.*;
import ru.volart.ui.Panel;

import javax.swing.*;

public class PaintApp {

    private static final String TITLE = "Paint";


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createUI());
    }

    private static void createUI() {
        JFrame frame = new JFrame(TITLE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel panel = new Panel();
        frame.setSize(800, 800);
        frame.add(panel);
        frame.setVisible(true);

        Point a = new Point(50,50);
        Point b = new Point(350,120);
        Point c = new Point(400,500);

        Point t1 = new Point(50,50);
        Point t2 = new Point(350,120);
        Point t3 = new Point(400,500);
//        Rectangle rect = new Rectangle(start,end);
//        panel.setShape(rect);

        panel.setShape(new Circle(b, 80));
        panel.setShape(new Circle(a, 50));
        panel.setShape(new Circle(c, 80));
        panel.setShape(new Triangle(t1, t2, t3));
        panel.setShape(new Rectangle(a, b));


    }
}

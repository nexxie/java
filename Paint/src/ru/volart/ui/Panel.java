package ru.volart.ui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import ru.volart.geometry.Shape;

/**
 * Created by volart on 06.11.16.
 */
public class Panel extends JPanel {
    private java.util.List<Shape> shapes = new ArrayList<Shape>();

    private Shape shape;

    public Panel() {

        setBorder(BorderFactory.createLineBorder(Color.GREEN));
    }

    @Override
    public Dimension getPreferredSize() {

        return new Dimension(900, 1000);
    }

    @Override
    public void paintComponent(Graphics g) {
        //super.paintComponent(g);

        g.drawRect(150, 150, 180, 450);
        g.drawLine(150, 150, 240, 50);
        g.drawLine(240, 50, 330, 150);
        g.drawOval(200, 200, 80, 80);
        g.drawOval(200, 300, 80, 80);
        g.drawOval(200, 400, 80, 80);
        g.drawLine(180, 600, 150, 700);
        g.drawLine(200, 600, 230, 700);
        g.drawLine(280, 600, 250, 700);
        g.drawLine(300, 600, 330, 700);

        if (shapes != null) {
            shape.paint(g);
            for (Shape sh :shapes) {
                sh.paint(g);
            }
        }

    }


    public void setShape(Shape shape) {
        this.shape = shape;
        //repaint();
    }
}

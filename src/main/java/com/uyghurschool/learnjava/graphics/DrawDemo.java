package com.uyghurschool.learnjava.graphics;

import javax.swing.*;
import java.awt.*;

public class DrawDemo extends Canvas {

    public static void main(String[] args) {
        //define a frame
        JFrame frame=new JFrame("Uyghur School Java Project");
        Canvas canvas=new DrawDemo();
        canvas.setSize(600,600);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }
    public void paint(Graphics g)
    {
        g.drawString("Uyghur School Java Code",100,50);
        g.setColor(Color.GREEN);
        g.fillOval(100,100,200,200);
        g.setColor(Color.blue);
        g.fillOval(100,200,200,200);
        g.drawArc(100,500,50,50,0,180);
    }
}

package main.java.com.vaneks.patterns.sructural.composite;

import java.awt.*;

public class ProgramRun {
    public static void main(String[] args) {
        Graphic  graphic = new Graphic ();

        Dot circle = new Circle();
        Dot square = new Square();
        Dot cube = new Cube();

        graphic.addDot(circle);
        graphic.addDot(square);
        graphic.addDot(cube);
        graphic.drawDot();
    }
}

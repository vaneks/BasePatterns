package main.java.com.vaneks.patterns.sructural.composite;

import java.util.ArrayList;
import java.util.List;

public class Graphic {
    private List<Dot> dots = new ArrayList<>();
    public void addDot(Dot dot) {
        dots.add(dot);
    }
    public void removeDot(Dot dot) {
        dots.remove(dot);
    }
    public void drawDot() {
        for(Dot dot : dots) {
            dot.draw();
        }
    }
}

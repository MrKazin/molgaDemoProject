package ru.molga.testing.figures;

public class Line extends GraphObject{
    private int coordX1;
    private int coordY1;
    private int coordX2;
    private int coordY2;

    private String color;

    public Line(int coordX1, int coordY1, int coordX2, int coordY2, String color) {
        this.coordX1 = coordX1;
        this.coordY1 = coordY1;
        this.coordX2 = coordX2;
        this.coordY2 = coordY2;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Line "+hashCode()+": {" +
                "coordX1=" + coordX1 +
                ", coordY1=" + coordY1 +
                ", coordX2=" + coordX2 +
                ", coordY2=" + coordY2 +
                ", color='" + color + '\'' +
                '}'+"\n";
    }
}

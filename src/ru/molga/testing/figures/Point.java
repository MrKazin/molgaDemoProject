package ru.molga.testing.figures;

public class Point extends GraphObject {
    private int coordX;
    private int coordY;

    private String color;

    public Point(int coordX, int coordY, String color) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Point "+hashCode()+": {" +
                "coordX=" + coordX +
                ", coordY=" + coordY +
                ", color='" + color + '\'' +
                '}'+"\n";
    }
}
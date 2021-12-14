package ru.molga.testing.figures;

public class Circle extends GraphObject {
    private int coordX;
    private int coordY;
    private int radius;

    private String color;

    public Circle(int coordX, int coordY, int radius, String color) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Circle "+hashCode()+": {" +
                "coordX=" + coordX +
                ", coordY=" + coordY +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}'+"\n";
    }
}

package ru.molga.testing.factories;

import ru.molga.testing.Scene;
import ru.molga.testing.figures.Circle;
import ru.molga.testing.figures.GraphObject;
import ru.molga.testing.figures.Line;
import ru.molga.testing.figures.Point;

public class ColorfulSceneFactory extends SceneFactory{

    @Override
    public GraphObject createCircle() {
        GraphObject circle = new Circle(5,5,10,"orange");
        onCreate(circle);
        return circle;
    }

    @Override
    public GraphObject createLine() {
        GraphObject line = new Line(5,5,10,10,"blue");
        onCreate(line);
        return line;
    }

    @Override
    public GraphObject createPoint() {
        GraphObject point = new Point(5,5,"yellow");
        onCreate(point);
        return point;
    }

    @Override
    protected void onCreate(GraphObject object) {
        Scene scene = Scene.getInstance();
        scene.addGraphObject(object);
    }
}

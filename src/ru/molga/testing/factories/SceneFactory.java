package ru.molga.testing.factories;

import ru.molga.testing.figures.GraphObject;

public abstract class SceneFactory {
    public abstract GraphObject createCircle();
    public abstract GraphObject createLine();
    public abstract GraphObject createPoint();
    protected abstract void onCreate(GraphObject object);
}

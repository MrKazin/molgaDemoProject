package ru.molga.testing;

import ru.molga.testing.figures.GraphObject;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    private List<GraphObject> objectsCollection;

    public void addGraphObject(GraphObject graphObject){
        objectsCollection.add(graphObject);
    }

    public void clearObjects(){
        if (objectsCollection.size() > 0)
            objectsCollection.clear();
    }

    public void drawScene(){
        for (GraphObject graphObject: objectsCollection) {
            graphObject.draw();
        }
    }

    private static Scene instance;

    private Scene() {
        objectsCollection = new ArrayList<>();
    }

    public static synchronized  Scene getInstance(){
        if(instance == null)
            instance = new Scene();

        return instance;
    }

    @Override
    public String toString() {
        return "Scene "+hashCode()+": {" +
                "objectsCollection=" + objectsCollection +
                '}';
    }
}

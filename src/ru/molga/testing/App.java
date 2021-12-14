package ru.molga.testing;

import ru.molga.testing.factories.BlackSceneFactory;
import ru.molga.testing.factories.ColorfulSceneFactory;
import ru.molga.testing.factories.SceneFactory;

public class App {
    public static void main(String[] args) {
        //проверка на singleton
        //Scene scene = Scene.getInstance();
        //System.out.println(scene.toString());
        //Scene scene1 = Scene.getInstance();
        //System.out.println(scene1.toString());

        //использование абстрактной фабрики и фабричных методов с хуками
        SceneFactory factory = new BlackSceneFactory();
        //SceneFactory factory = new ColorfulSceneFactory();
        factory.createCircle();
        factory.createLine();
        factory.createPoint();
        Scene scene = Scene.getInstance();
        System.out.println(scene.toString());
    }
}

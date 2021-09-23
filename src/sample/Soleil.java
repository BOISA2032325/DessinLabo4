package sample;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class Soleil {

    Circle soleil = new Circle();
    Group soleilTotal = new Group();
    Group lesRayon = new Group();
    Line rayon1 = new Line(550,0,550,75);
    Line rayon2 = new Line(485,35,530,60);
    Line rayon3 = new Line(435,80,530,80);


    public Circle getSoleil() {
        soleil.setRadius(45);
        soleil.setTranslateX(550);
        soleil.setTranslateY(75);
        soleil.setFill(Color.YELLOW);
        return soleil;
    }

    public Group getLesRayon() {
        rayon1.setStrokeWidth(3);
        rayon1.setStroke(Color.YELLOW);
        rayon2.setStrokeWidth(3);
        rayon2.setStroke(Color.YELLOW);
        rayon3.setStrokeWidth(3);
        rayon3.setStroke(Color.YELLOW);
        lesRayon.getChildren().addAll(rayon1,rayon2,rayon3);
        return lesRayon;
    }

    public Group getSoleilTotal() {
        soleilTotal.getChildren().addAll(getSoleil(),getLesRayon());
        return soleilTotal;
    }
}

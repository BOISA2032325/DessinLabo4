package sample;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class Maison {
    Rectangle rectangle = new Rectangle();
    Rectangle porte = new Rectangle();
    Circle poigner = new Circle();
    Polygon triangle = new Polygon(245,175,350,100,455,175);
    Group fenetres = new Group();
    Group maisonFinal = new Group();


    public Group getFenetres() {
        Rectangle fenetre = new Rectangle();
        fenetre.setWidth(65);
        fenetre.setHeight(50);
        fenetre.setTranslateX(365);
        fenetre.setTranslateY(210);
        fenetre.setStrokeWidth(5);
        fenetre.setStroke(Color.GRAY);
        fenetre.setFill(Color.LIGHTSKYBLUE);
        Line ligne1 = new Line(398,211,398,259);
        Line ligne2 = new Line(365,236,430,236);
        ligne2.setStrokeWidth(5);
        ligne2.setStroke(Color.GRAY);
        ligne1.setStrokeWidth(5);
        ligne1.setStroke(Color.GRAY);
        ligne1.setFill(Color.GRAY);
        fenetres.getChildren().addAll(fenetre,ligne1,ligne2);
        return fenetres;
    }

    public Circle getPoigner() {
        poigner.setRadius(5);
        poigner.setTranslateX(315);
        poigner.setTranslateY(295);
        poigner.setFill(Color.YELLOW);
        return poigner;
    }

    public Rectangle getRectangle() {
        rectangle.setHeight(150);
        rectangle.setWidth(200);
        rectangle.setTranslateX(250);
        rectangle.setTranslateY(175);
        rectangle.setFill(Color.BEIGE);
        return rectangle;
    }

    public Rectangle getPorte() {
        porte.setHeight(60);
        porte.setWidth(45);
        porte.setTranslateY(265);
        porte.setTranslateX(280);
        porte.setFill(Color.SADDLEBROWN);
        return porte;
    }

    public Polygon getTriangle() {
        triangle.setFill(Color.BROWN);

        return triangle;
    }

    public Group getMaisonFinal() {
        maisonFinal.getChildren().addAll(getRectangle(),getPorte(),getPoigner(),getFenetres(),getTriangle());
        return maisonFinal;
    }

}

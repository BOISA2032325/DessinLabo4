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
    Rectangle rectangle2 = new Rectangle();
    Rectangle porte2 = new Rectangle();
    Circle poigner2 = new Circle();
    Polygon triangle2 = new Polygon(945,175,1050,100,1155,175);
    Group fenetres2 = new Group();
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

    public Group getFenetres2() {
        Rectangle fenetre2 = new Rectangle();
        fenetre2.setWidth(65);
        fenetre2.setHeight(50);
        fenetre2.setTranslateX(1065);
        fenetre2.setTranslateY(210);
        fenetre2.setStrokeWidth(5);
        fenetre2.setStroke(Color.GRAY);
        fenetre2.setFill(Color.LIGHTSKYBLUE);
        Line ligne3 = new Line(1098,211,1098,259);
        Line ligne4 = new Line(1065,236,1130,236);
        ligne4.setStrokeWidth(5);
        ligne4.setStroke(Color.GRAY);
        ligne3.setStrokeWidth(5);
        ligne3.setStroke(Color.GRAY);
        ligne3.setFill(Color.GRAY);
        fenetres2.getChildren().addAll(fenetre2,ligne3,ligne4);
        return fenetres2;
    }

    public Circle getPoigner2() {
        poigner2.setRadius(5);
        poigner2.setTranslateX(1015);
        poigner2.setTranslateY(295);
        poigner2.setFill(Color.YELLOW);
        return poigner2;
    }

    public Rectangle getRectangle2() {
        rectangle2.setHeight(150);
        rectangle2.setWidth(200);
        rectangle2.setTranslateX(950);
        rectangle2.setTranslateY(175);
        rectangle2.setFill(Color.BEIGE);
        return rectangle2;
    }

    public Rectangle getPorte2() {
        porte2.setHeight(60);
        porte2.setWidth(45);
        porte2.setTranslateY(265);
        porte2.setTranslateX(980);
        porte2.setFill(Color.SADDLEBROWN);
        return porte2;
    }

    public Polygon getTriangle2() {
        triangle2.setFill(Color.BROWN);

        return triangle2;
    }

    public Group getMaisonFinal() {
        maisonFinal.getChildren().addAll(getRectangle(),getPorte(),getPoigner(),getFenetres(),getTriangle(),getRectangle2(),getPorte2(),getPoigner2(),getFenetres2(),getTriangle2());
        return maisonFinal;
    }

}

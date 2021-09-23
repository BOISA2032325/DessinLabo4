package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Collection;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setWidth(1400);
        primaryStage.setHeight(500);
        primaryStage.setTitle("Maison");
        Maison maison1 = new Maison();
        Group dessin= new Group();
        Rectangle deuxiemePartieDuDessin = new Rectangle(700,0,700,500);
        deuxiemePartieDuDessin.setFill(Color.BLACK);



        Soleil soleil1 = new Soleil();
        dessin.getChildren().addAll(deuxiemePartieDuDessin,maison1.getMaisonFinal(),soleil1.getSoleilTotal());
        primaryStage.setScene(new Scene(dessin));

        primaryStage.getScene().setFill(Color.LIGHTGREY);

        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}

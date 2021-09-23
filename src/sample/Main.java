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
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Collection;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setWidth(700);
        primaryStage.setHeight(500);
        primaryStage.setTitle("Maison");

        //La maison
        Maison maison1 = new Maison();
        Group maison= new Group();

        //Soleil

        Soleil soleil1 = new Soleil();

        maison.getChildren().addAll(maison1.getMaisonFinal(),soleil1.getSoleilTotal());


        primaryStage.setScene(new Scene(maison));

        primaryStage.getScene().setFill(Color.LIGHTGREY);

        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}

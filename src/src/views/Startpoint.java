/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.views;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import src.views.LoginViews.LoginMainView;

/**
 *
 * @author Dhia
 */
public class Startpoint extends Application {
   public static LoginMainView loginmainview = new LoginMainView();
   public static Pane mainView = new Pane();
    @Override
    public void start(Stage primaryStage) {
      
        mainView.getChildren().add(loginmainview);
        
        Scene scene = new Scene(mainView, 300, 250);
        
        primaryStage.setTitle("Log in");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

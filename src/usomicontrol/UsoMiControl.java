/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package usomicontrol;

import controles.MiControl;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class UsoMiControl extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        MiControl miControl = new MiControl();
        
        
        miControl.setOnAction(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Has clickado el área roja");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(miControl);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Demo MiControl");
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

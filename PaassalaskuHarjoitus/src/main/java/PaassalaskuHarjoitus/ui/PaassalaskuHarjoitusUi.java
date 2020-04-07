/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaassalaskuHarjoitus.ui;

import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author koskiron
 */
public class PaassalaskuHarjoitusUi extends Application {
    
    @Override
    public void start(Stage stage) {
        
        stage.setTitle("Päässälaskuharjoittelu");
        
        Button startButton = new Button("Aloita");
        FlowPane components = new FlowPane();
        components.getChildren().add(startButton);
        
        Scene startScene = new Scene(components);
        stage.setScene(startScene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}

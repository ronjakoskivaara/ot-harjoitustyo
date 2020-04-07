/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaassalaskuHarjoitus.ui;

import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author koskiron
 */
public class PaassalaskuHarjoitusUi extends Application {
    
    private Scene calculationScene;
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("Päässälaskuharjoittelu");
        
        Button startButton = new Button("Aloita");
        FlowPane flowPaneStart = new FlowPane();
        Scene startScene = new Scene(flowPaneStart);
        flowPaneStart.getChildren().add(startButton);
        startButton.setOnAction((event) -> {
            primaryStage.setScene(calculationScene);
        });
        
        BorderPane calculationBorderPane = new BorderPane();
        
        VBox calculationVBox = new VBox();
        calculationVBox.setSpacing(10);
        
        calculationBorderPane.setCenter(calculationVBox);
        TextField question = new TextField();
        TextField answer = new TextField();
        
        Button answerButton = new Button("Vastaa");
        
        calculationVBox.getChildren().add(question);
        calculationVBox.getChildren().add(answer);
        calculationVBox.getChildren().add(answerButton);
        
        calculationScene = new Scene(calculationBorderPane);
        
        primaryStage.setScene(startScene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}

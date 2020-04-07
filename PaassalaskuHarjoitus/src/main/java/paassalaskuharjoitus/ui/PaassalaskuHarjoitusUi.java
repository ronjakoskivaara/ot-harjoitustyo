/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paassalaskuharjoitus.ui;

import paassalaskuharjoitus.domain.Sum;
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
        calculationBorderPane.setPrefSize(500, 200);
        
        VBox calculationVBox = new VBox();
        calculationVBox.setSpacing(10);
        
        Sum sumCalculation = new Sum();
        TextField calculationTitle = new TextField();
        calculationTitle.setText(sumCalculation.printCalculationInstruction());
        
        calculationBorderPane.setCenter(calculationVBox);
        calculationBorderPane.setTop(calculationTitle);
        
        Label question = new Label(sumCalculation.printCalculation());
        TextField rightAnswer = new TextField();
        TextField answer = new TextField();
        
        
        Button answerButton = new Button("Vastaa");
        
        calculationVBox.getChildren().add(question);
        calculationVBox.getChildren().add(answer);
        calculationVBox.getChildren().add(answerButton);
        calculationVBox.getChildren().add(rightAnswer);
        
        answerButton.setOnAction((event) -> {
            rightAnswer.setText(
            sumCalculation.compareAnswer(answer.getText()));
        });        
        calculationScene = new Scene(calculationBorderPane);
        
        primaryStage.setScene(startScene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}

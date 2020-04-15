/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paassalaskuharjoitus.ui;

import paassalaskuharjoitus.domain.Sum;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author koskiron
 */
public class PaassalaskuHarjoitusUi extends Application {
    
    private Scene sumCalculationScene;
    private Scene chooseCalculationScene;
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("Päässälaskuharjoittelu");
        primaryStage.setHeight(500);
        primaryStage.setWidth(500);
        
        Button startButton = new Button("Aloita");
        BorderPane borderPaneStart = new BorderPane();
        Scene startScene = new Scene(borderPaneStart);
        borderPaneStart.setCenter(startButton);
        
        
        startButton.setOnAction((event) -> {
            primaryStage.setScene(this.chooseCalculationScene);
        });
        
        BorderPane chooseCalculationBorderPane = new BorderPane();
        Label chooseCalculationInstructionLabel = new Label("Valitse harjoituksen tyyppi");
        Button sumButton = new Button("Pluslaskut");
        Button subtractionButton = new Button("Miinuslaskut");
        VBox calculationButtonsVBox = new VBox();
        calculationButtonsVBox.setSpacing(10);
        calculationButtonsVBox.setAlignment(Pos.CENTER);
        calculationButtonsVBox.getChildren().add(sumButton);
        calculationButtonsVBox.getChildren().add(subtractionButton);
        
        chooseCalculationBorderPane.setTop(chooseCalculationInstructionLabel);
        chooseCalculationBorderPane.setAlignment(chooseCalculationInstructionLabel, Pos.TOP_CENTER);
        chooseCalculationBorderPane.setCenter(calculationButtonsVBox);

        
        this.chooseCalculationScene = new Scene(chooseCalculationBorderPane);
        
        sumButton.setOnAction((event) -> {
            primaryStage.setScene(this.sumCalculationScene);
        });
        
        BorderPane calculationBorderPane = new BorderPane();
        calculationBorderPane.setPrefSize(500, 200);
        
        VBox calculationVBox = new VBox();
        calculationVBox.setSpacing(10);
        
        calculationBorderPane.setCenter(calculationVBox);
        
        TextField calculationTitle = new TextField();
        
        Sum sumCalculation = new Sum();

        calculationTitle.setText(sumCalculation.printCalculationClassInstruction());
        
        calculationBorderPane.setTop(calculationTitle);
        
        this.sumCalculationScene = new Scene(calculationBorderPane);
        
        Label question = new Label();
        question.setText(sumCalculation.printCalculation());
        
        TextField answer = new TextField();        
        TextField rightAnswer = new TextField();
      
        Button answerButton = new Button("Vastaa");     
        Button newCalculationButton = new Button("Uusi lasku");
        
        HBox answerAndNewCalculationButtonsHBox = new HBox();
        answerAndNewCalculationButtonsHBox.setSpacing(10);
        answerAndNewCalculationButtonsHBox.getChildren().add(answerButton);
        answerAndNewCalculationButtonsHBox.getChildren().add(newCalculationButton);
        
        calculationVBox.getChildren().add(question);
        calculationVBox.getChildren().add(answer);
        calculationVBox.getChildren().add(answerAndNewCalculationButtonsHBox);
        calculationVBox.getChildren().add(rightAnswer);
        
        answerButton.setOnAction((event) -> {
            rightAnswer.setText(
            sumCalculation.compareAnswer(answer.getText()));
        });        

        
        newCalculationButton.setOnAction((event) -> { 
            question.setText(sumCalculation.printCalculation());
            answer.clear();
            rightAnswer.clear();
            
            
        });
        
        primaryStage.setScene(startScene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}

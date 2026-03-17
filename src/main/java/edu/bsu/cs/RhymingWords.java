package edu.bsu.cs;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;

public class RhymingWords{
    Button button = new Button();

    // Game variables
    int currentQuestion = 0;

    String[] questions = {
        "Which word rhymes with CAT?",
        "Which word rhymes with DOG?",
        "Which word rhymes with BALL?",
        "Which word rhymes with SUN?",
        "Which word rhymes with BEE?",
        "Which word rhymes with CAKE?",
        "Which word rhymes with MOON?",
        "Which word rhymes with STAR?",
        "Which word rhymes with BLUE?",
        "Which word rhymes with BED?",
        "Which word rhymes with HOUSE?",
        "Which word rhymes with PLAY?"
    };

    String[][] options = {
        {"Dog","Hat","Sun"},
        {"Log","Tree","Book"},
        {"Wall","Cup","Fish"},
        {"Run","Tree","Cat"},
        {"Tree","Ball","Hat"},
        {"Bake","Ball","Dog"},
        {"Spoon","Cup","Pen"},
        {"Car","Ball","Fish"},
        {"Shoe","Hat","Tree"},
        {"Red","Ball","Cup"},
        {"Mouse","Tree","Sun"},
        {"Day","Dog","Book"}
    };

    int[] correctAnswers = {1,0,0,0,0,0,0,0,0,0,0,0};

    public void show(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Rhyming Words");
        button.setText("Click me");
        Pane layout = new Pane();

        // MUST GO LAST
        Scene scene = new Scene(layout, 1400, 750);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Get current question
    public String getQuestion(){
        return questions[currentQuestion];
    }

    // Get options
    public String[] getOptions(){
        return options[currentQuestion];
    }

    // Check answer
    public boolean checkAnswer(int selectedOption){
        boolean correct = selectedOption == correctAnswers[currentQuestion];
        currentQuestion++;
        return correct;
    }

    // Check if game finished
    public boolean isFinished(){
        return currentQuestion >= questions.length;
    }

    // Reset game
    public void reset(){
        currentQuestion = 0;
    }
}

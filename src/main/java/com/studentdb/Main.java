package com.studentdb;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import com.studentdb.views.StudentTableView;

public class Main extends Application {
    
    @Override
    public void start(Stage window) {
        // Set the window title
        window.setTitle("Student Management System");
        
        // Create the main container
        VBox mainContainer = new VBox();
        
        // Create and add the student table view
        StudentTableView studentView = new StudentTableView();
        mainContainer.getChildren().add(studentView);
        
        // Create the scene and set it on the window
        Scene scene = new Scene(mainContainer, 1200, 800);
        
        // Load the CSS file
        String cssFile = getClass().getResource("/styles/main.css").toExternalForm();
        scene.getStylesheets().add(cssFile);
        
        // Show the window
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        // Launch the application
        launch(args);
    }
} 
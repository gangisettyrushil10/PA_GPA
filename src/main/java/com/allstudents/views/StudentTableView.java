package com.studentdb.views;

import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.collections.FXCollections;
import com.studentdb.model.Student;
import java.util.ArrayList;
import javafx.scene.control.CheckBox;

public class StudentTableView extends VBox {
    private TableView<Student> table;
    private TextField searchField;
    private ArrayList<Student> studentList;

    public StudentTableView() {
        // Set spacing between elements
        setSpacing(20);
        setPadding(new javafx.geometry.Insets(20));
        
        // Create the header
        createHeader();
        
        // Create the controls (search, buttons)
        createControls();
        
        // Create the table
        createTable();
        
        // Add sample data
        addSampleData();
    }

    private void createHeader() {
        // Create title and subtitle
        Label title = new Label("Student Management");
        Label subtitle = new Label("Manage student records, track performance, and generate reports.");
        
        // Create header container
        VBox header = new VBox(5);
        header.getChildren().addAll(title, subtitle);
        
        // Add CSS classes
        title.getStyleClass().add("title");
        subtitle.getStyleClass().add("subtitle");
        header.getStyleClass().add("header");
        
        // Add header to main container
        getChildren().add(header);
    }

    private void createControls() {
        // Create search field
        searchField = new TextField();
        searchField.setPromptText("Search students or advisors...");
        searchField.getStyleClass().add("search-field");
        
        // Create buttons
        Button sortButton = new Button("Sort");
        Button filterButton = new Button("Filter");
        Button reportButton = new Button("Generate Report");
        
        // Add CSS classes to buttons
        sortButton.getStyleClass().add("control-button");
        filterButton.getStyleClass().add("control-button");
        reportButton.getStyleClass().addAll("control-button", "primary-button");
        
        // Create controls container
        HBox controls = new HBox(10);
        controls.getChildren().addAll(searchField, sortButton, filterButton, reportButton);
        controls.getStyleClass().add("controls");
        
        // Add controls to main container
        getChildren().add(controls);
    }

    private void createTable() {
        // Create table
        table = new TableView<>();
        table.getStyleClass().add("student-table");
        
        // Create columns
        TableColumn<Student, String> nameColumn = new TableColumn<>("Student Name");
        nameColumn.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getName()));
        
        TableColumn<Student, String> gpaColumn = new TableColumn<>("GPA");
        gpaColumn.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(
            String.format("%.1f", data.getValue().getGpa())
        ));
        
        TableColumn<Student, String> riskColumn = new TableColumn<>("Risk Level");
        riskColumn.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getRiskLevel()));
        
        TableColumn<Student, String> advisorColumn = new TableColumn<>("Advisor");
        advisorColumn.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getAdvisor()));
        
        // Add columns to table
        table.getColumns().addAll(nameColumn, gpaColumn, riskColumn, advisorColumn);
        
        // Add table to main container
        getChildren().add(table);
    }

    private void addSampleData() {
        // Create sample student list
        studentList = new ArrayList<>();
        studentList.add(new Student("Alex Johnson", 3.8, "Good Standing", "Dr. Smith"));
        studentList.add(new Student("Casey Miller", 2.8, "Moderate Risk", "Dr. Chen"));
        studentList.add(new Student("Jamie Williams", 3.2, "Moderate Risk", "Dr. Chen"));
        studentList.add(new Student("Jordan Wilson", 2.3, "At Risk", "Dr. Patel"));
        studentList.add(new Student("Morgan Davis", 3.9, "Good Standing", "Dr. Smith"));
        studentList.add(new Student("Quinn Thomas", 2.9, "Moderate Risk", "Dr. Chen"));
        studentList.add(new Student("Riley Moore", 3.5, "Good Standing", "Dr. Smith"));
        
        // Add students to table
        table.setItems(FXCollections.observableArrayList(studentList));
    }
} 
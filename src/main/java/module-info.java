module main {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    
    opens main to javafx.fxml;
    
    exports main;
} 
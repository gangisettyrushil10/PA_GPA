module com.austincollege.pagpa {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    
    opens com.austincollege.pagpa to javafx.fxml;
    opens com.austincollege.pagpa.controller to javafx.fxml;
    
    exports com.austincollege.pagpa;
    exports com.austincollege.pagpa.controller;
} 
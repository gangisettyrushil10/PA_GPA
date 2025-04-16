module main {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
	requires org.junit.jupiter.api;
	requires junit;
	requires jdk.incubator.vector;
    
    opens main to javafx.fxml;
    
    exports main;
} 
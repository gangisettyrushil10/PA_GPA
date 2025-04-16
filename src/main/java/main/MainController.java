package main;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;

public class MainController implements Initializable {
    // Empty controller - will be used for future functionality
	
	@FXML
	private PieChart pieChart;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		PieChart.Data dismissed = new PieChart.Data("Dismissed", 1.0);
		PieChart.Data remediation = new PieChart.Data("In Remediation", 3.0);
		PieChart.Data notAtRisk = new PieChart.Data("Not at Risk", 25.0);
		PieChart.Data atRisk = new PieChart.Data("At Risk", 5.0);
		
		pieChart.getData().addAll(dismissed,remediation,atRisk,notAtRisk);
		
	}
} 
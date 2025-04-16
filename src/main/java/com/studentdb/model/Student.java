package com.studentdb.model;

public class Student {
    private String name;
    private double gpa;
    private String riskLevel;
    private String advisor;

    public Student(String name, double gpa, String riskLevel, String advisor) {
        this.name = name;
        this.gpa = gpa;
        this.riskLevel = riskLevel;
        this.advisor = advisor;
    }

    // Getters and setters
    public String getName() { 
        return name; 
    }
    
    public void setName(String name) { 
        this.name = name; 
    }

    public double getGpa() { 
        return gpa; 
    }
    
    public void setGpa(double gpa) { 
        this.gpa = gpa; 
    }

    public String getRiskLevel() { 
        return riskLevel; 
    }
    
    public void setRiskLevel(String riskLevel) { 
        this.riskLevel = riskLevel; 
    }

    public String getAdvisor() { 
        return advisor; 
    }
    
    public void setAdvisor(String advisor) { 
        this.advisor = advisor; 
    }
} 
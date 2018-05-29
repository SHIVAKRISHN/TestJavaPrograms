package com.shiva.testJavaPrograms.Comparator;

public class Student {
    private String name;
    private int    rollNumber;
    private int    marksObtained;
    
    public Student(String name, int rollNumber, int marksObtained) {
        super();
        this.name = name;
        this.rollNumber = rollNumber;
        this.marksObtained = marksObtained;
    }
    
    public String getName() {
        return name;
    }
    
    public int getRollNumber() {
        return rollNumber;
    }
    
    public int getMarksObtained() {
        return marksObtained;
    }
    
    @Override
    public String toString() {
        return name + ", " + rollNumber + ", "
                + marksObtained + "]";
    }
}

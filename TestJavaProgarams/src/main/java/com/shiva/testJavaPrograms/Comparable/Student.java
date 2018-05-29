package com.shiva.testJavaPrograms.Comparable;

class Student implements Comparable<Student> {
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
        return "[ " + name + ", " + rollNumber + ", "
                + marksObtained + " ] ";
    }
    
    public int compareTo(Student otherStudent) {
        
        // return this.rollNumber - otherStudent.rollNumber; /* To compare the integers in acceding order */
        return otherStudent.rollNumber - this.rollNumber; /* To compare the integers in descending order */
        // return this.name.compareTo(otherStudent.name); /* To compare the Strings in acceding order */
        // return otherStudent.name.compareTo(this.name); /* To compare the Strings in descending order */
    }
}

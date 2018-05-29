package com.shiva.testJavaPrograms.Comparator;

import java.util.Comparator;

public class StudentMarksComparator implements Comparator<Student> {
    
    @Override
    public int compare(Student st1, Student st2) {
        return st1.getMarksObtained() - st2.getMarksObtained();
    }
}
package com.shiva.testJavaPrograms.Comparator;

import java.util.Comparator;

public class StudentRollNumberComparator implements Comparator<Student> {
    
    @Override
    public int compare(Student st1, Student st2) {
        return st1.getRollNumber() - st2.getRollNumber();
    }
}
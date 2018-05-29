package com.shiva.testJavaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparableDemo {
	  public static void main(String[] args) {
	    Student james = new Student("James", 3, 100);
	    Student andy = new Student("Andy", 1, 99);
	    Student peter = new Student("Peter", 2, 95);
	    Student mike = new Student("Mike", 4, 94);
	    
	    //------------ Testing thisObject.compareTo(anotherObject) ------
	    
	    System.out.println();
	    if(james.compareTo(andy) > 1) {
	      System.out.println("James has higher roll number than Andy");
	    } else {
	      System.out.println("James has lower roll number than Andy");
	    }
	    
	    
	    
	    //------------ Testing for Sorting -------------------------------
	    
	    List<Student> students = new ArrayList<>();
	    students.add(james);
	    students.add(andy);
	    students.add(peter);
	    students.add(mike);
	    
	    System.out.println("students before sorting: " + students);
	    Collections.sort(students);  // Sorting
	    System.out.println("students after sorting: " + students);
	  }
	}

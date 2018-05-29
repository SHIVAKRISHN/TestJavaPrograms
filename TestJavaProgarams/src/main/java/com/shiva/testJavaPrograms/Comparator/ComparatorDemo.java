package com.shiva.testJavaPrograms.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {

  public static void main(String[] args) {
    Student james = new Student("James", 3, 100);
    Student andy = new Student("Andy", 1, 99);
    Student peter = new Student("Peter", 2, 94);
    Student mike = new Student("Mike", 4, 95);

    //------------ Testing compare(thisObject, anotherObject) ------
    
    StudentRollNumberComparator rollNumberComparator = new StudentRollNumberComparator();
    if(rollNumberComparator.compare(james, andy) > 1) {
      System.out.println("James has higher roll number than Andy");
    } else {
      System.out.println("James has lower roll number than Andy");
    }
    
    StudentMarksComparator marksComparator = new StudentMarksComparator();
    if(marksComparator.compare(mike, peter) > 1 || marksComparator.compare(mike, peter) == 1  ) {
      System.out.println("Mike has more marks than Peter");
    } else if(marksComparator.compare(mike, peter) == 0) 
    {
        System.out.println("Mike and  Peter Marks are same");
    }
    else {
      System.out.println("Mike has less marks than Peter");
    }
    
    if(marksComparator.compare(james, andy) > 1) {
        System.out.println("James has more marks than Andy");
      } else {
        System.out.println("James has less marks than Andy");
      }
    System.out.println();
    
    //------------ Testing for Sorting -------------------------------
    
    List<Student> students = new ArrayList<>();
    students.add(james);
    students.add(andy);
    students.add(peter);
    students.add(mike);
    
    Collections.sort(students, new StudentMarksComparator());
    
    System.out.println(students);
    
    // This won't compile. 
    // Exception: The method sort(List<T>) in the type Collections is not applicable for the 
    //            arguments (List<Student>)
   // Collections.sort(students);
    // Fix is simple. Either make your Student class implement Comparable as we saw in the
    // previous tutorial or use a Collections.sort overload which takes comparator instance
    // as an extra parameter. e.g, Collections.sort(students, new StudentMarksComparator());
    
  }
}
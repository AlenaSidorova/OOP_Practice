package Practice6;

import java.util.*;
import java.lang.*;

public class Main
{
    public static void main(String[]args)
    {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(1, 15, "Mark"));
        students.add(new Student(2, 9 , ""));
        students.add(new Student(3, 12 , ""));
        students.add(new Student(4, 3 , ""));
        students.add(new Student(5, 19 , ""));
        students.add(new Student(6, 7 , ""));
        students.add(new Student(7, 1 , ""));

        for(Student it : students)
            System.out.println(it);
        Collections.sort(students, new StudentComparator());

        System.out.println("\nSorted list:");
        for(Student it : students)
            System.out.println(it);
    }
}

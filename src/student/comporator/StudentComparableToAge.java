package student.comporator;

import java.util.Comparator;

import student.Student;

public class StudentComparableToAge implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
       return Integer.compare(o1.getAge(), o2.getAge());
    }
    
}

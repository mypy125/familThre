package student.comporator;

import java.util.Comparator;

import student.Student;

public class StudentComparatorByName implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }

}

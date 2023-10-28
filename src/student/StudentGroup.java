package student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import student.comporator.StudentComparableToAge;
import student.comporator.StudentComparatorByName;

public class StudentGroup implements Iterable<Student>{
    private List<Student> students;
    
    public StudentGroup(){
        students = new ArrayList<>();
    }

    public void add(Student student){
        students.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return students.iterator();
    }

    public void sortByName(){
        students.sort(new StudentComparatorByName());
    }

    public void sortByAge(){
        students.sort(new StudentComparableToAge());
    }
}

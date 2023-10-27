package student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
        return new StudentIterator(students);
    }
}

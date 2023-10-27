package student;

import java.util.Iterator;
import java.util.List;

public class StudentIterator implements Iterator<Student>{
    private List<Student> students;
    private int index;

    public StudentIterator(List<Student> students){
        this.students = students;
    }
    
    @Override
    public boolean hasNext() {
        return index < students.size();
    }
    
    @Override
    public Student next() {
        return students.get(index++);
    }
    
}

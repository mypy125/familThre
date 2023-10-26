package student;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private int id;
    private StudentGroup activeGroup;
    private List<StudentGroup> studentListGroup;

    public Service(StudentGroup group) {
        activeGroup = new StudentGroup();
        studentListGroup = new ArrayList<>();
        studentListGroup.add(group);
    }
    
    public void addStudent(String name, int age) {
        activeGroup.add(new Student(id++, name, age));
    }

}

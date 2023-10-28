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

    public Service() {
        this(new StudentGroup());
    }
    
    public void addStudent(String name, int age) {
        activeGroup.add(new Student(id++, name, age));
    }

    public void addStudentGroup(StudentGroup group) {
        studentListGroup.add(group);
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        for (Student student : activeGroup) {
            sb.append(student).append("\n");
        }
        return sb.toString();
    }

    public void sortByName(){
        activeGroup.sortByName();
    }

    public void sortByAge(){
        activeGroup.sortByAge();
    }
}

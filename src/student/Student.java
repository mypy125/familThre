package student;

public class Student {
    private String name;
    private int age;
    private int id;

    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return id + " " + name + " " + age;
    }
}

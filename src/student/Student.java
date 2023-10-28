package student;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private int id;

    public Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return "id:"+id + ", "+"name: " + name + ", "+"age: " + age;
    }
  
    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }
}

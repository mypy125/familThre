package student;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        service.addStudent("sasha", 15);
        service.addStudent("masha", 14);
        service.addStudent("pasha", 21);
        service.addStudent("vasia", 19);
        System.out.println(service.getInfo());
    }
}

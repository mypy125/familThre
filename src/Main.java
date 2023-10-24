import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        FamilyThree three = new FamilyThree();

        three.addHuman(new Human("gor", Gender.Male, LocalDate.of(1990, 6, 2), null, null));
        three.addHuman(new Human("grigor", Gender.Male, LocalDate.of(2010, 4, 5), null, null));
        
        
        System.out.println(three.getInfo());
        FileHandler fileHandler = new FileHandler();
        fileHandler.saveToFile("human.txt");
        
    }


}
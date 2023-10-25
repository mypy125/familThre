import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        String filePath = "src/tree.txt";
        Writable writable = new FileHandler();

        FamilyThree three = (FamilyThree) writable.readFromFile(filePath);

        // FamilyThree three = new FamilyThree();

        // three.add(new Human("gor", Gender.Male, LocalDate.of(1990, 6, 2), null, null));
        // three.add(new Human("grigor", Gender.Male, LocalDate.of(2010, 4, 5), null, null));

       // writable.saveToFile(three, filePath);
        System.out.println(three.getInfo());
     
    }


}
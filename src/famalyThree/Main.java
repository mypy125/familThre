package famalyThree;

import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        
        FamilyThree three = new FamilyThree();
        Service service = new Service();

       three.add(new Human("gor", Gender.Male, LocalDate.of(1990, 6, 2), null, null));
       three.add(new Human("grigor", Gender.Male, LocalDate.of(2010, 4, 5), null, null));

       service.save(three);
       // service.readFile();
       System.out.println(three.getInfo());
        
    }


}
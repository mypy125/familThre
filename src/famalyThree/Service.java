package famalyThree;

import java.io.Serializable;

public class Service {
    private String filePath;
    private Writable writable;
    private FamilyThree three;
    
    public Service() {
        this.filePath = "src/three.txt";
        this.writable = new FileHandler();     
        this.three = new FamilyThree();
    }

    public void save(Serializable serializable) {
        writable.saveToFile(serializable, filePath);
    }

    public Object readFile() {
       return writable.readFromFile(filePath);
    }

}

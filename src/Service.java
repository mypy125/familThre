

import java.io.Serializable;

public class Service {
    private Writable writable;
    private FamilyThree three;

    public Service() {
        this.writable = new FileHandler();     
    }

    public void save(Serializable serializable, String filePath) {
        writable.saveToFile(three, filePath);
    }

    public Object readFile(String filePath) {
       return (Human) writable.readFromFile(filePath);
    }

}

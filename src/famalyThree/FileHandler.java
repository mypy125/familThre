package famalyThree;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class FileHandler implements Writable{
    
    @Override
    public boolean saveToFile(Serializable serializable, String filePath) {
        try (ObjectOutputStream objectOutput = new ObjectOutputStream(new FileOutputStream(filePath))){
            objectOutput.writeObject(serializable);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Object readFromFile(String filePath) {
        try (ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(filePath))){ 
            return objectInput.readObject();
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}

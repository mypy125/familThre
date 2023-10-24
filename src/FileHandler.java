
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
class FileHandler implements Writable{
    File path = new File("human.txt");
    
    @Override
    public void saveToFile(String path) {
        try (FileOutputStream fileOutput = new FileOutputStream(path);
        ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput)) {
        objectOutput.writeObject(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void readFromFile(String path) {
        try (FileInputStream fileInput = new FileInputStream(path);
        ObjectInputStream objectInput = new ObjectInputStream(fileInput)) {
        path = (String) objectInput.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}

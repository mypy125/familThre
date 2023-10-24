import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FamilyThree implements Serializable{
    private List<Human> humanList;

    public FamilyThree(){ 
        this(new ArrayList<>());
    }

    public FamilyThree(List<Human> humanList){
        this.humanList = humanList;
    }

    public boolean addHuman(Human human){
        if (!humanList.contains(human)){
            humanList.add(human);
            return true;
        }
        return false;
    }

    public Human getByName(String name){
        for (Human human : humanList){
            if (human.getName().equals(name)){
                return human;
            }
        }
        return null;
    }

    public String getInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("in Three: ");
        sb.append(humanList.size());
        sb.append(" objects:").append("\n");
        for (Human human : humanList){
            sb.append(human.getInfo()).append("\n");
        }
        return sb.toString();
    }

}

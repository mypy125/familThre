import java.util.ArrayList;
import java.util.List;

public class FamilyThree {
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

}

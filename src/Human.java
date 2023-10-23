import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Human {
    private String name;
    private Gender gender;
    private LocalDate birthDate;
    private LocalDate deathDate;
    private Human father;
    private Human mother;
    private List<Human> children;

    public Human(String name, Gender gender, LocalDate biDate){
        this(name, gender, biDate, null, null);
    }

    public Human(String name, Gender gender, LocalDate biDate,Human father, Human mother){
        this.name = name;
        this.gender = gender;
        this.birthDate = biDate;
        this.father = father;
        this.mother = mother;
        this.children = new ArrayList<>();
    }

    public boolean addChild(Human child){
        if (!children.contains(child)){
            children.add(child);
            return true;
        }
        return false;
    }

    public String getName(){return name;}

    public LocalDate getBirthDate(){return birthDate;}

    public LocalDate getDeathDate(){return deathDate;}

    public Human getFather(){return father;}

    public Human getMother(){return mother;}

    public List<Human> getChildren(){return children;}

    public Gender getGender(){return gender;}

    public void setDathDate(LocalDate deathDate){this.deathDate = deathDate;}

    public void setBirthDate(LocalDate birthDate){this.birthDate = birthDate;}

    public void setFather(Human father){this.father = father;}

    public void setMother(Human mother){this.mother = mother;}

    public String getInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("name").append(name).append("\n");
        sb.append("Mother name").append(getMotherInfo()).append("\n");
        sb.append("Father name").append(getFatherInfo()).append("\n");
        sb.append("Children").append(getChildrenInfo()).append("\n");
        return sb.toString();
    }

    private String getChildrenInfo() {
        String rez = "Children: ";
        if (children.size() > 0){
            for (Human child : children){
                rez += child.getName();
            }
        }else{
            rez += "Is not";
        }
        return rez;
    }

    private String getMotherInfo() {
        String rez = "Mother: ";
        if (mother != null){
            rez += mother.getName();
        }else {
            rez += "Is not";
        }
        return rez;
    }

    private String getFatherInfo(){
        String rez = "Father: ";
        if (father != null){
            rez += father.getName();
        }else {
            rez += "Is not";
        }
        return rez;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Human))return false;
        Human human = (Human) obj;
        return human.getName().equals(getName());
    }

}

package kingdom;

public class Dog extends Animals{
    private String owner = "";

    public String getOwner() {
        return "Wagner";
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public String walk() {
        return "walk";
    }
}

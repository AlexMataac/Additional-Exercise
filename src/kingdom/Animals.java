package kingdom;

public class Animals {

    private String type;
    private int numberOfFeet;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfFeet() {
        return numberOfFeet;
    }

    public void setNumberOfFeet(int numberOfFeet) {
        this.numberOfFeet = numberOfFeet;
    }
    public String move() {
        return "move";
    }
    public String eat() {
        return "eat";
    }
    public String sound() {
        return "sound";
    }
}

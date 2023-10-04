package game;

abstract class Armor extends Unit implements Iarmor{
    private int weight = 10;
    private String color = "black";
    private int strength = 40;


    public int getWeight() {
        return weight;
    }
    public String getColor() {
        return color;
    }
    protected void setWeight(int weight) {
        this.weight = weight;
    }
    protected void setColor(String color) {
        this.color = color;
    }
    public int getStrength() {
        return strength;
    }
    protected void setStrength(int strength) {
        this.strength = strength;
    }
}

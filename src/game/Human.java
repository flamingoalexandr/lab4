package game;

public class Human extends Unit {
    private double walk_speed;
    private int health;

    public double getWalk_speed() {
        return walk_speed;
    }

    protected void setWalk_speed(double walk_speed) {
        this.walk_speed = walk_speed;
    }

    public int getHealth() {
        return health;
    }

    protected void setHealth(int health) {
        this.health = health;
    }
}

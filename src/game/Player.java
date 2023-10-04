package game;

public class Player extends Human {
    private Iweapon main_gun;
    private double health = 100;
    private int weight;
    private Iarmor armor;
    public Player(int weight)
    {
        this.weight = weight;
        calculateSpeed();
    }
    public Player()
    {
        this(70);
    }

    public void set_main_gun(Iweapon weapon){
        this.main_gun = weapon;
    }
    public void set_armor(Iarmor armor){
        this.armor= armor;
        weight += armor.getWeight();
        calculateSpeed();
    }
    public void pull_the_trigger(){
        main_gun.fire();
    }
    public void reloadGun(){
        main_gun.reload();
    }
    private void calculateSpeed()
    {
        setWalk_speed(10 - ((weight - 70) * 0.1));
    }
    public void checkAmmo(){
        main_gun.checkAmmo();
    }
}

package game;

abstract class Weapon extends Unit implements Iweapon{
    int ammo;
    public abstract void fire();
    public abstract void reload();
    protected abstract void sound();
    public abstract void checkAmmo();
}

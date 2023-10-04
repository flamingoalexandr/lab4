package game;

public class Termninator_suit extends Armor implements Iarmor, Iweapon{

    public Termninator_suit()
    {
        ammo = 4;
        setWeight(70);
        setColor("grey");
        setStrength(100);
    }
    private int ammo;
    public void fire()
    {
        if (ammo > 0)
        {
            ammo -= 1;
            sound();
        }
        else{
            System.out.println("<ракеты в костюме закончились>");
        }
    }

    @Override
    public void checkAmmo() {
        if (ammo == 0)
        {
            System.out.println("Пусто");
        } else if (ammo == 1) {
            System.out.println("На исходе");
        } else if (ammo == 2){
            System.out.println("Меньше половины");
        } else if (ammo == 4 ) {
            System.out.println("Полон");
        } else
        {
            System.out.println("Больше половины");
        }
    }

    public void reload()
    {
        ammo = 4;
    }
    private void sound()
    {
        System.out.println("<звук выстрела ракеты>");
    }
}

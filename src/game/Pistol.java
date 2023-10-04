package game;

public class Pistol extends Weapon {
    private int ammo;
    public void fire()
    {
        if (ammo > 0)
        {
            ammo -= 1;
            sound();
        }
        else{
            System.out.println("<щелчок пистолета>");
        }
    }
    public void reload()
    {
        ammo = 8;
        System.out.println("Пистолет перезаряжен");
    }
    public Pistol()
    {
        ammo = 0;
    }
    protected void sound()
    {
        System.out.println("ПАМ");
    }

    public void checkAmmo()
    {
        if (ammo == 0)
        {
            System.out.println("Пусто");
        } else if (ammo <= 2) {
            System.out.println("На исходе");
        } else if (ammo >= 3 && ammo <= 6){
            System.out.println("Меньше половины");
        } else if (ammo == 13 ) {
            System.out.println("Полон");
        } else
        {
            System.out.println("Больше половины");
        }
    }

}

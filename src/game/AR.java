package game;

public class AR extends Weapon {
    private int ammo;
    public void fire()
    {
        if (ammo > 0)
        {
            ammo -= 1;
            this.sound();
        }
        else{
            System.out.println("<щелчок винтовки>");
        }
    }
    public void reload()
    {
        ammo = 30;
        System.out.println("Винтовка перезаряжена");
    }
    public AR()
    {
        ammo = 0;
    }
    protected void sound()
    {
        System.out.println("Тратата");
    }
    public void checkAmmo()
    {
        if (ammo == 0)
        {
            System.out.println("Пусто");
        } else if (ammo <= 7) {
            System.out.println("На исходе");
        } else if (ammo >= 7 && ammo <= 15){
            System.out.println("Меньше половины");
        } else if (ammo == 30 ) {
            System.out.println("Полон");
        } else
        {
            System.out.println("Больше половины");
        }
    }
}

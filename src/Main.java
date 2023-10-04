import game.*;
public class Main {
    public static void main(String[] args) {
        Player alexandr = new Player();
        Termninator_suit t1 = new Termninator_suit();
        alexandr.set_main_gun(t1);
        alexandr.checkAmmo();
        alexandr.pull_the_trigger();
        alexandr.pull_the_trigger();
        alexandr.pull_the_trigger();
        alexandr.checkAmmo();
        alexandr.pull_the_trigger();
        alexandr.pull_the_trigger();
    }
}
package game;

abstract class Unit {
    private int id;
    public int getId() {
        return id;
    }
    protected Unit()
    {
        this.id = 1;
    }

}

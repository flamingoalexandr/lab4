package math;

import org.w3c.dom.ls.LSOutput;

class Point implements printable {
    private double x;
    private double y;
    protected double getX() {
        return x;
    }

    protected void setX(double x) {
        this.x = x;
    }

    protected double getY() {
        return y;
    }

    protected void setY(double y) {
        this.y = y;
    }
    protected  <T> Point (T x, T y)
    {
        if (x instanceof Integer)
        {
            this.x = ((Integer) x).doubleValue();
        } else if (x instanceof Double) {
            this.x = (double) x;
        }
        else {
             throw new IllegalArgumentException("Nenado");
        }
        if (y instanceof Integer)
        {
            this.y = ((Integer) y).doubleValue();
        } else if (y instanceof Double) {
            this.y = (double) y;
        }
        else {
            throw new IllegalArgumentException("Nenado");
        }
    }
    public static String help()
    {
        return "point_info";
    }
    public void print()
    {
        System.out.println("X coordinate: " + x);
        System.out.println("Y coordinate: " + y);
    }

}

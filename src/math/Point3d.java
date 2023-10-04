package math;

class Point3d extends Point{
    private double z;

    public <T> Point3d(T x, T y, T z) {
        super(x, y);
        if (z instanceof Integer)
        {
            this.z = ((Integer) z).doubleValue();
        } else if (y instanceof Double) {
            this.z = (double) z;
        }
        else {
            throw new IllegalArgumentException("Nenado");
        }
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}

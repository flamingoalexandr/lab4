package math;

abstract class Figure
{
    protected double area;
    protected double perimeter;
    public void calculateArea()
    {}
    public void calculatePerimetr()
    {}

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}

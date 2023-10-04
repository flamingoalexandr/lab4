package math;
import math.TrigFunc.*;

import math.*;

public class Circle extends Figure {
    private double R;

    // Конструктор класса Circle
    public Circle(double R) {
        this.R = R;
        calculateArea();
        calculatePerimeter();
    }
    public Circle() {
        this.R = 0;
        area = 0;
        perimeter = 0;
    }

    // Реализация методов расчета площади и периметра для круга
    @Override
    public void calculateArea() {
        this.area = Math.PI * simpleFunc.pow(2, 2);
    }
    public void calculatePerimeter() {
        this.perimeter = 2 * Math.PI * R;
    }
}
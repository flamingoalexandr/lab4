package math;

import static math.simpleFunc.*;

public abstract class TrigFunc implements standard_math {
    public static double calculateSin(double x) {
        boolean isPos = true;
        if (x < 0)
        {
            x = abs(x);
            isPos = false;
        }
        double pi = Math.PI; // Значение π в Java Math библиотеке
        double sinValue = 0;
        int numberOfTerms = 15;
        int counter = 0;
        while (x > pi / 4)
        {
            x = pi / 2 - x;
            counter += 1;
        }
        if (counter % 2 == 0)
        {

            for (int i = 0; i < numberOfTerms; i++) {
                int exponent = 2 * i + 1;
                double term = pow(-1, i) * pow(x, exponent) / factorial(exponent);
                sinValue += term;

            }
        }
        else {
            sinValue = calculateCos(x);
        }
        if (!isPos)
        {
            sinValue = -sinValue;
        }
        return sinValue;
    }
    public static double calculateCos(double x) {
        x = abs(x);
        double pi = Math.PI; // Значение π в Java Math библиотеке
        double CosValue = 0;
        int numberOfTerms = 15;
        int counter = 0;
        while (x > pi / 4) {
            x = pi / 2 - x;
            counter += 1;
        }
        if (counter % 2 == 0) {
            for (int i = 0; i < numberOfTerms; i++) {
                int exponent = 2 * i + 1;
                CosValue += pow(-1, i) * pow(x, 2 * i) / factorial(2 * i);
            }
        } else {
            CosValue = calculateSin(x);
        }
        return CosValue;
    }
    public static String help()
    {
        return "Decription of TriFunc Class";
    }


}

package math;

public abstract class simpleFunc implements standard_math {
    public static double pow(double base, int exponent) {
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
    public static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
    public static <T extends Number> T abs(T number) {
        if (number instanceof Integer) {
            int intValue = (Integer) number;
            return intValue < 0 ? (T) Integer.valueOf(-intValue) : number;
        } else if (number instanceof Double) {
            double doubleValue = (Double) number;
            return doubleValue < 0 ? (T) Double.valueOf(-doubleValue) : number;
        } else {
            throw new IllegalArgumentException("Неподдерживаемый тип данных");
        }
    }
    public static String help()
    {
        return "Decription of sF Class";
    }

}

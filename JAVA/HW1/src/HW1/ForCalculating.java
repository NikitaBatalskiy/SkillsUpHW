package HW1;

public class ForCalculating {
    private static final String NO_RESULTS = "No results";
    private static final String ROOT_ONE = " x1: ";
    private static final String ROOT_TWO = " x2: ";

    public void reshenie(double a, double b, double c) {
        double x1;
        double x2;
        x1 = ((-b) + (Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / 2 * a);
        x2 = ((-b) - (Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / 2 * a);
        System.out.println("X1: " + x1 + "; " + "X2: " + x2);
    }

    public String getRootsByViet(final int indexA, final int indexB, final int indexC) {

        int firstResult = indexB / indexA;
        int secondResult = indexC / indexA;
        int sign1 = 1;
        int sign2 = 1;

        if (secondResult < 0) {
            sign1 = -1;
        } else if ((secondResult > 0) && (firstResult > 0)) {
            sign1 = -1;
            sign2 = -1;
        }

        secondResult = Math.abs(secondResult);

        double[] results = getAllVariables(secondResult);

        int length = 0;
        double x1;
        double x2;
        while (length < results.length) {
            double variable = results[length];
            x1 = variable * sign1;
            x2 = secondResult / variable * sign2;
            if (x1 + x2 == -firstResult) {
                return ROOT_ONE + x1 + ROOT_TWO + x2;
            }
            length++;
        }

        return NO_RESULTS;
    }

    private double[] getAllVariables(final int numbersLimit) {
        double[] result = new double[numbersLimit];

        final int limit = (int) Math.sqrt(numbersLimit);

        for (int firstIndex = 1; firstIndex <= limit; firstIndex++) {
            if (numbersLimit % firstIndex == 0) {
                if (numbersLimit / firstIndex != firstIndex) {
                    result[firstIndex] = numbersLimit / (double) firstIndex;
                }
                result[firstIndex] = firstIndex;
            }
        }

        return result;

    }

    public double SRound(double Pi, double r) {
        double SR = Math.pow(r, 2) * Pi;
        return SR;
    }

    public double CRound(double Pi, double r) {
        double CR = 2 * Pi * r;
        return CR;
    }

    public double hipotenusa(double first, double second) {
        double hip = Math.pow(first, 2) + Math.pow(second, 2);
        return hip;
    }
}

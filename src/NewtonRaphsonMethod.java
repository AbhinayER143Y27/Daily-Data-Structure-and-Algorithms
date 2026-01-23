import java.util.Scanner;

public class NewtonRaphsonMethod {

    public static double f(double x) {
        return Math.pow(x, 3) - 4 * x - 9;
    }

    public static double df(double x) {
        return 3 * Math.pow(x, 2) - 4;
    }

    public static void main(String[] args) {
        System.out.println("----- Newton-Raphson Method for Root Approximation -----");
        double x0 = 2.5;
        double tol = 1e-6;
        int maxIter = 20;
        System.out.printf("%-5s %-12s %-12s%n", "Iter", "x_n", "f(x_n)");
        double root = Double.NaN;

        for (int i = 1; i <= maxIter; i++) {
            double fx = f(x0);
            double dfx = df(x0);
            if (dfx == 0) {
                System.out.println("Derivative is zero. Method fails.");
                return;
            }

            System.out.printf("%-5d %-12.6f %-12.6f%n", i, x0, fx);

            double x1 = x0 - (fx / dfx);

            if (Math.abs(x1 - x0) < tol) {
                root = x1;
                break;
            }
            x0 = x1;

            if (i == maxIter) {
                root = x1;
            }
        }

        if (!Double.isNaN(root)) {
            System.out.println("\nApproximate Root = " + root);
        } else {
            System.out.println("\nMethod did not converge within the maximum iterations.");
        }
    }
}
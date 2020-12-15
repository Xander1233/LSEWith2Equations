import java.util.*;
public class rechner {
    public static void main(String[] args) {
        double[] vektorX = new double[2];
        double[] vektorY = new double[2];
        double[][] matrixA = new double[2][2];
        String hauptMenu = "Menu\n\n1. a1 * x + b1 * y = c1\n2. a2 * x + b2 * y = c2\nLösen eines LGS\nBitte geben sie a1 ein: ";
        Scanner sc = new Scanner(System.in);
        System.out.print(hauptMenu);
        matrixA[0][0] = sc.nextDouble();
        System.out.print("Geben sie b1 ein: ");
        matrixA[0][1] = sc.nextDouble();
        System.out.print("Geben sie c1 ein: ");
        vektorY[0] = sc.nextDouble();
        System.out.print("Geben sie a2 ein: ");
        matrixA[1][0] = sc.nextDouble();
        System.out.print("Geben sie b2 ein: ");
        matrixA[1][1] = sc.nextDouble();
        System.out.print("Geben sie c2 ein: ");
        vektorY[1] = sc.nextDouble();
        vektorX[0] = (vektorY[0] * matrixA[1][1] - vektorY[1] * matrixA[0][1]) / (matrixA[0][0] * matrixA[1][1] - matrixA[1][0] * matrixA[0][1]);
        vektorX[1] = (vektorY[1] * matrixA[0][0] - vektorY[0] * matrixA[1][0]) / (matrixA[0][0] * matrixA[1][1] - matrixA[1][0] * matrixA[0][1]);
        System.out.println("\nResult:\nx = " + (vektorX[0]) + "\ny = " + (vektorX[1]));
    }
}

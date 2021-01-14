/**
 * COPYRIGHT © 2020 David Neidhart
 */

import java.util.*;
public class rechner {
    public static void main(String[] args) {

        double[] vektorX = new double[2];
        double[] vektorY = new double[2];
        double[][] matrixA = new double[2][2];

        Scanner sc = new Scanner(System.in);

        System.out.print("Menu\n\n1. a11 * x + a12 * y = b1\n2. a21 * x + a22 * y = b2\nLösen eines LGS\n");

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                System.out.println("a" + (i + 1) + (j + 1) + ": ");
                matrixA[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < vektorY.length; i++) {
            System.out.println("b" + i + 1 + ": ");
            vektorY[i] = sc.nextDouble();
        }

        vektorX[0] = (vektorY[0] * matrixA[1][1] - vektorY[1] * matrixA[0][1]) / (matrixA[0][0] * matrixA[1][1] - matrixA[1][0] * matrixA[0][1]);
        vektorX[1] = (vektorY[1] * matrixA[0][0] - vektorY[0] * matrixA[1][0]) / (matrixA[0][0] * matrixA[1][1] - matrixA[1][0] * matrixA[0][1]);

        System.out.println("\nResult:\nx = " + (vektorX[0]) + "\ny = " + (vektorX[1]));
    }
}

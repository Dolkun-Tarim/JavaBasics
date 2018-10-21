package com.uyghurbook.learnjava;

import org.apache.commons.math3.linear.*;

public class MathProblem {

    //x + 2y  = 1
    //3x + 2y + 4z = 7
    //-2x +y - 2z = -1
    public static void main(String[] args) {
        RealMatrix coefficients =
                new Array2DRowRealMatrix(new double[][]{{1, 2, 0}, {3, 2, 4}, {-2, 1, -2}},
                        false);
        DecompositionSolver solver = new LUDecomposition(coefficients).getSolver();
        RealVector constants = new ArrayRealVector(new double[]{1, 7, -1}, false);
        RealVector solution = solver.solve(constants);
        System.out.println("x=" + solution.getEntry(0));
        System.out.println("y=" + solution.getEntry(1));
        System.out.println("z=" + solution.getEntry(2));
    }
}

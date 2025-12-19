package p2;

import java.util.Arrays;

public class P2_main {
    public static void main(String[] args) {
        int[][] grid = new int[3][3];
        /*for (int i = 0; i < 3; i++) {
            grid[i][i] = -1;
        }*/

        grid[2][0] = -1;
        grid[0][2] = -1;
        grid[2][2] = -1;

        grid = replaceZeroes(grid);
        printArray(grid);
    }

    public static int[][] replaceZeroes(int[][] a) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] == -1) {
                    for (int k = -1; k <= 1; k++) {
                        if (Math.abs(i + k - 1) <= 1) {
                            for (int l = -1; l <=1; l++) {
                                if (Math.abs(j + l - 1) <= 1 && a[i + k][j + l] != -1) {
                                    a[i + k][j + l] += 1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return a;
    }

    public static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }
}

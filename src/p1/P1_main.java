package p1;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class P1_main {
    public static void main(String[] args) {
        printArray(randomArray4(2));
    }

    public static int[] randomArray(int x) {
        int[] a = new int[x];
        Random random = new Random();
        for (int i = 0; i < x; i++) {
            a[i] = random.nextInt();
        }
        return a;
    }

    public static int[] randomArray2(int x) {
        int[] a = new int[x];
        Random random = new Random();
        for (int i = 0; i < x; i++) {
            a[i] = random.nextInt(x);
        }
        return a;
    }

    public static int[] randomArray3() {
        int[] a = new int[6];
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            a[i] = random.nextInt(21) + 55;
        }
        return a;
    }

    public static int[] randomArray4(int n) {
        int[] a = new int[n+1];
        Random random = new Random();
        short sum = 0;
        for (int i = 0; i < n; i++) {
            int next = random.nextInt(50) + 1;
            a[i] = next;
            sum += (short)next;
        }
        a[n] = sum / (short)n;
        return a;
    }

    public static void printArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }
}
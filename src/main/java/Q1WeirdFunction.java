// src/main/java/Q1WeirdFunction.java

public class Q1WeirdFunction {

    public static int fRecursive(int n) {
        //recursive function
        if (n < 3) {
            return n;
        }
        return fRecursive(n - 1) + 2 * fRecursive(n - 2) + 3 * fRecursive(n - 3);
    }

    public static int fIterative(int n) {
        //iterative function
        if (n < 3) {
            return n;
        }
        int f0 = 2;
        int f1 = 1;
        int f2 = 0;

        int fn = 0;

        for (int i = 3; i <= n; i++) {
            fn = f0 + 2 * f1 + 3 * f2;

            f2 = f1;
            f1 = f0;
            f0 = fn;
        }
        
        return fn;
    }
}
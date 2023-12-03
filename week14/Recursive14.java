package week14;

public class Recursive14 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(factorialRecursive(5));
        System.out.println(factorialIterative(5));
        
    }
    static int factorialRecursive(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }
    static int factorialIterative(int n) {
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

}

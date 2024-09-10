package telran.util;

public class RecursionMethods {
    public static void f(int a) {
        if (a > 3) {
            f(a - 1);
        }     
    }
    
    public static long factorial(int n) {
        n = Math.abs(n);
        return n == 0 ? 1 : n * factorial(n - 1);
    }

    public static int pow(int num, int degree) {
        if (degree < 0) {
            throw new IllegalArgumentException();
        }
        return degree == 0 ? 1 : multiplication(num, pow(num, degree - 1));
    }

    public static int multiplication(int num, int factor) {
        if (factor < 0) {
            factor = -factor;
            num = -num;
        }
        return factor == 0 ? 0 : num + multiplication(num, factor - 1);
    }

    public static int sum(int[] array) {
        return sum(array, array.length);
    }

    private static int sum(int[] array, int len) {
        return len == 0 ? 0 : array[len - 1] + sum(array, len - 1);
    }

    public static int square(int x) {
        x = x < 0 ? -x : x;
        return x == 0 ? 0 : x + x - 1 + square(x - 1);
    }

    public static boolean isSubstring(String string, String subString) {
        return string.length() < subString.length() ? false : isFirstSubstring(string, subString) || isSubstring(string.substring(1), subString);
    }

    public static boolean isFirstSubstring(String string1, String string2) {
        return string2.length() == 0 ? true : string1.charAt(0) == string2.charAt(0) && isFirstSubstring(string1.substring(1), string2.substring(1)); 
    }
}

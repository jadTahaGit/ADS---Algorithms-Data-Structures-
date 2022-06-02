package uebungen;

public class f2 {

    public static void main(String[] args) {
        double a = 1.0;
        int n = 1;
        fnk2(a,n);
    }

    public static double fnk2 (double a, int n) {
        double x = 1.0;
        for (int i = 0; i < n; i++)
        x = 0.5 * (x + a / x);
        System.out.println(x);
        return x;
        }
}

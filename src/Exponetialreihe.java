public class Exponetialreihe {

    public static void main(String[] args) {

        System.out.println(exp(1.0, 100));

    }

    public static double exp(double x, int k){
        double e = 0.0;

        for (int i = 0; i <= k; i++) {
            e += (Math.pow(x, (double) i)) / (double) fakultaet(i);
        }

        return e;
    }

    private static double fakultaet(int n){
        return n < 2 ? 1 : n * fakultaet(n-1);
    }
}

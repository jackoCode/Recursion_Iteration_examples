public class SinusCosinus {

    public static void main(String[] args) {

        System.out.println(sin(Math.PI, 100));
        System.out.println(cos(Math.PI, 100));

    }

    public static double sin(double x, int k){
        double sinus = 0.0;

        for (int i = 0; i < k; i++) {
            sinus += (Math.pow(-1.0, (double) i)) * ((Math.pow(x, (double)(2*i+1))) / (double) fakultaet(2 * i + 1));
        }

        return sinus;
    }

    public static double cos(double x, int k){
        double cosinus = 0.0;

        for (int i = 0; i < k; i++) {
            cosinus += (Math.pow(-1.0, (double) i)) * ((Math.pow(x, (double)(2*i))) / (double) fakultaet(2 * i));
        }

        return cosinus;
    }

    private static double fakultaet(int n){
        return n < 2 ? 1 : n * fakultaet(n-1);
    }
}

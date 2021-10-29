public class SummeKubikZahlen {

    public static void main(String[] args) {
        System.out.println(berechneSummeKubikZahlen(100));
    }

    public static long berechneSummeKubikZahlen(int n){
        long summe = 0;

        for (int i = 1; i <= n; i++) {
            summe += (i*i*i);
        }

        return summe;
    }
}

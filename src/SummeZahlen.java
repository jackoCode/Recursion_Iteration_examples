public class SummeZahlen {

    public static void main(String[] args) {

        System.out.println(berechneSummeUngeraderZahler(10));
        System.out.println(berechneSummeGeraderZahlen(10));
    }

    public static long berechneSummeUngeraderZahler(int n){
        long summe = 0;

        for (int i = 1; i <= n; i+=2) {
            summe += i;
        }

        return summe;
    }

    public static long berechneSummeGeraderZahlen(int n){
        long summe = 0;

            for (int i = 0; i <= n; i+=2) {
            summe += i;
        }

        return summe;
    }
}

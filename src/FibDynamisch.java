public class FibDynamisch {

    private long[] berechneteFiboWerte;

    public long fibDynProg(int n){
        if(n < 0){
            throw new IllegalArgumentException();
        }

        berechneteFiboWerte = new long[n+1];

        fibRekursivDyn(n);

        return berechneteFiboWerte[n];
    }

    private long fibRekursivDyn(int n){
        if(n == 0 || n == 1){
            berechneteFiboWerte[n] = 1;
            return 1;
        }

        if(berechneteFiboWerte[n] != 0){
            return berechneteFiboWerte[n];
        }

        return berechneteFiboWerte[n] = fibRekursivDyn(n-1) + fibRekursivDyn(n-2);
    }
}

public class FibDynamischIterativ {
    private long[] berechneFiboWerte;

    public long fibDynProgIterativ(int n){
        if(n < 0){
            throw new IllegalArgumentException();
        }

        berechneFiboWerte = new long[n+1];

        if(n < 2){
            return 1;
        }

        berechneFiboWerte[0] = berechneFiboWerte[1] = 1;

        for (int i = 2; i <= n; i++) {
            berechneFiboWerte[i] = berechneFiboWerte[i-1] + berechneFiboWerte[i-2];
        }

        return berechneFiboWerte[n];
    }
}

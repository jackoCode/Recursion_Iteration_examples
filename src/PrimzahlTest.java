public class PrimzahlTest {

    public static void main(String[] args) {
        newArray(500);
    }

    public static void newArray(int n){
        long[] newArray = new long[n];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i;
        }

        zahlenPruefenObPrim(newArray);
    }

    private static void zahlenPruefenObPrim(long[] newArray) {
        for (int i = 0; i < newArray.length; i++) {
            if(istPrimzahl(newArray[i])){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean istPrimzahl(long n){
        boolean istPrim = true;

        if(n < 2){
            istPrim = false;
        }
        if(n % 2 == 0){
            istPrim = false;
        }
        if(n == 2){
            istPrim = true;
        }

        for (int i = 3; i * i <= n; i+=2) {
            if(n % i == 0){
                istPrim = false;
            }
        }

        return istPrim;
    }
}

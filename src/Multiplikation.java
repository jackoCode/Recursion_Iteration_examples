public class Multiplikation {

    public static void main(String[] args) {
        System.out.println(multipliziere(2,2));
    }

    public static long multipliziere(long a, long b){
        if(a < 0 || b < 0){
            throw new IllegalArgumentException("Die Zahlen a und b müssen positiv sein!");
        }

        long result;
        result = Math.multiplyExact(a,b);
        return result;
    }
}

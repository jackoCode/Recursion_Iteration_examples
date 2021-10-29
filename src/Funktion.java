public class Funktion {

    public static void main(String[] args) {
        System.out.println(tIterativ(0));
    }

    public static long tIterativ(int n){
        if(n == 0){
            return 3;
        }else if(n % 3 == 0){
            return n/3 + 2;
        }
        return 2 * (n - 1);
    }
}

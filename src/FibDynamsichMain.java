public class FibDynamsichMain {

    public static void main(String[] args) {
        FibDynamisch a = new FibDynamisch();
        System.out.println(a.fibDynProg(23));

        FibDynamischIterativ b = new FibDynamischIterativ();
        System.out.println(b.fibDynProgIterativ(23));
    }
}

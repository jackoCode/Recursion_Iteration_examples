import java.util.ArrayList;
import java.util.LinkedList;

public class Listen {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        final long startTimeLL = System.nanoTime();
        linkedList.remove(1);
        final long endTimeLL = System.nanoTime();

        final long startTimeAL = System.nanoTime();
        arrayList.remove(1);
        final long endTimeAL = System.nanoTime();

        long totalTimeLL = endTimeLL - startTimeLL;
        long totalTimeAL = endTimeAL - startTimeAL;

        System.out.println("LinkedList: " + totalTimeLL);
        System.out.println("ArrayList: " + totalTimeAL);
    }
}

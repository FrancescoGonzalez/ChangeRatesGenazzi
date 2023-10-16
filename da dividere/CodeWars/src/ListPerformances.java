import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ListPerformances {

    public static void main(String[] args){
        long[] test1 = timeSpent(100);
        System.out.println(Arrays.toString(test1));
        long[] test2 = timeSpent(1000);
        System.out.println(Arrays.toString(test2));
        long[] test3 = timeSpent(10000);
        System.out.println(Arrays.toString(test3));
        long[] test4 = timeSpent(100000);
        System.out.println(Arrays.toString(test4));
        long[] test5 = timeSpent(200000);
        System.out.println(Arrays.toString(test5));

    }

    static long[] timeSpent(int number){
        ArrayList<Integer> AL = new ArrayList<>();
        LinkedList<Integer> LL = new LinkedList<>();
        long[] results = new long[4];

        long start =  System.currentTimeMillis();

        for (int i = 0; i < number; i++) {
            AL.add(i);
        }

        long stop = System.currentTimeMillis();
        results[0] = stop-start;

        start =  System.currentTimeMillis();

        for (int i = 0; i < number; i++) {
            LL.add(i);
        }

        stop = System.currentTimeMillis();
        results[1] = stop-start;

        start =  System.currentTimeMillis();

        for (int i = 0; i < number; i++) {
            AL.get(i);
        }

        stop = System.currentTimeMillis();
        results[2] = stop-start;

        start =  System.currentTimeMillis();

        for (int i = 0; i < number; i++) {
            LL.get(i);
        }

        stop = System.currentTimeMillis();
        results[3] = stop-start;

        return results;
    }
}

import java.util.*;

public class MaxRange2{
    public static void main(String []args){
        List<Integer> input ;
        int size = 10;
        while(size < 1000000000){
            input = new ArrayList<>();
            fill(input, size);
            System.out.println("n = " + size);
            rangeAlg(input, size);
            size*=2;
        }
    }

    private static void rangeAlg(List<Integer> list, int n){
        long start, end;
        start = System.currentTimeMillis();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
            max = Math.max(max, list.get(i));
            min = Math.min(min, list.get(i));
        }
        int maxRange = max - min;

        end = System.currentTimeMillis();

        double timeElipse = (end - start)/1000.0;
        System.out.println("Algorithm 2: range = " + maxRange + ", Time = " + timeElipse);
        return;
    }

    private static void fill(List<Integer> list, int size){
        Random rand = new Random();
        for(int i = 0; i<size; i++){
            int num = rand.nextInt()%1000;
            list.add( (num >= 0 ? num : num*-1) );
        }
    }
}
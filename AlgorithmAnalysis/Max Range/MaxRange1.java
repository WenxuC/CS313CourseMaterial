import java.util.*;

public class MaxRange1{
    public static void main(String []args){
        List<Integer> input ;
        int size = 10;
        while(size < 10000000){
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

        int maxRange = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                maxRange = Math.max(maxRange, Math.abs(list.get(i)-list.get(j)));
            }
        }

        end = System.currentTimeMillis();

        double timeElipse = (end - start)/1000.0;
        System.out.println("Algorithm 1: range = " + maxRange + ", Time = " + timeElipse);
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
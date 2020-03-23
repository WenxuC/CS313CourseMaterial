import java.util.*;
import java.util.ArrayList;
class SortingTime{
    public static void main(String args[]){
        int size = (args.length == 0)? 20: Integer.parseInt(args[0]);
        long start, end;
        ArrayList<Integer> list = new ArrayList<>();
        
        fill(list, size);
        System.out.println("Insertion Sort:");
        start = System.currentTimeMillis();
        SortAlgorithms.insertionSort(list);
        end = System.currentTimeMillis();
        System.out.println((end - start));

        list = new ArrayList<>();
        fill(list, size);
        System.out.println("Bubble Sort:");
        start = System.currentTimeMillis();
        SortAlgorithms.bubbleSort(list);
        end = System.currentTimeMillis();
        System.out.println((end - start));

        list = new ArrayList<>();
        fill(list, size);
        System.out.println("MergeSort Sort:");
        start = System.currentTimeMillis();
        SortAlgorithms.mergeSort(list, 0, size-1);
        end = System.currentTimeMillis();
        System.out.println((end - start));

        list = new ArrayList<>();
        fill(list, size);
        System.out.println("QuickSort Sort:");
        start = System.currentTimeMillis();
        SortAlgorithms.quickSort(list, 0, size-1);
        end = System.currentTimeMillis();
        System.out.println((end - start));
    }

    private static void fill(ArrayList<Integer> list, int size){
        Random rand = new Random();
        for(int i = 0; i<size; i++ )
            list.add(rand.nextInt()%size);
    }
}
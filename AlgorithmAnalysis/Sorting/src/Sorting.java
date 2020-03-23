import java.util.*;
import java.util.ArrayList;
class Sorting{
    public static void main(String args[]){
        int size = (args.length == 0)? 20: Integer.parseInt(args[0]);
        
        List<Integer> list = new ArrayList<>();
        
        fill(list, size);
        System.out.println("Insertion Sort:\n" + list.toString());
        SortAlgorithms.insertionSort(list);
        System.out.println(list.toString());

        list = new ArrayList<>();
        fill(list, size);
        System.out.println("Bubble Sort:\n" + list.toString());
        SortAlgorithms.bubbleSort(list);
        System.out.println(list.toString());

        list = new ArrayList<>();
        fill(list, size);
        System.out.println("MergeSort Sort:\n" + list.toString());
        SortAlgorithms.mergeSort(list, 0, size-1);
        System.out.println(list.toString());

        list = new ArrayList<>();
        fill(list, size);
        System.out.println("QuickSort Sort:\n" + list.toString());
        SortAlgorithms.quickSort(list, 0, size-1);
        System.out.println(list.toString());
    }

    private static void fill(List<Integer> list, int size){
        Random rand = new Random();
        for(int i = 0; i<size; i++ )
            list.add(rand.nextInt()%size);
    }
}
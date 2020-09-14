import java.util.ArrayList;
import java.util.*;

class Main{
    public static void main(String args[]){
        List<Integer> unsortedList = new ArrayList<>();
        fill(unsortedList, 10);
        SortAlgorithms.mergeSort(unsortedList, 0, 9);

        // for(int i =0; i< unsortedList.size(); i++){
        //     System.out.print(unsortedList.get(i));
        // }

        // for(Integer x: unsortedList){
        //     System.out.println(x);
        // }

        Iterator<Integer> iter = unsortedList.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }

    private static void fill(List<Integer> list, int size){
        Random rand = new Random();
        for(int i = 0; i<size; i++ )
            list.add(rand.nextInt()%size);
    }
}
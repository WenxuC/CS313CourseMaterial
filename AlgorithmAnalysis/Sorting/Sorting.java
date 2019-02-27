import java.util.*;
import java.util.ArrayList;
class Sorting{
    public static void main(String args[]){
        int size = Integer.parseInt(args[0]);
        ArrayList<Integer> list = new ArrayList<>();
        
        fill(list, size);
        System.out.println(list.toString());
        insertionSort(list);
        System.out.println(list.toString());

        list = new ArrayList<>();
        fill(list, size);
        System.out.println(list.toString());
        bubbleSort(list);
        System.out.println(list.toString());

        list = new ArrayList<>();
        fill(list, size);
        System.out.println(list.toString());
        mergeSort(list, 0, size-1);
        System.out.println(list.toString());
    }

    private static void fill(ArrayList<Integer> list, int size){
        Random rand = new Random();
        for(int i = 0; i<size; i++ )
            list.add(rand.nextInt()%size);
    }

    public static void insertionSort(ArrayList<Integer> list){
        int n = list.size(); 
        for (int i=1; i<n; i++){ 
            int target = list.get(i); 
            int j = i-1;
            while (j >= 0 && list.get(j) > target){ 
                list.set(j+1, list.get(j));
                j--; 
            } 
            list.set(j+1, target);
        } 
    }

    public static void bubbleSort(ArrayList<Integer> list){
        int n = list.size(); 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++)
                if(list.get(j) > list.get(j+1)){

                    int temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
    }

    public static void mergeSort(ArrayList<Integer> list, int low, int high){
        if (low < high) { 
            int m = (low + high) / 2;
            mergeSort(list, low, m); 
            mergeSort(list, m+1, high); 
            merge(list, low, m, high); 
        } 
    }

    private static void merge(ArrayList<Integer> list, int l, int m, int r) { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
        
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = list.get(l + i); 
        for (int j=0; j<n2; ++j) 
            R[j] = list.get(m + 1 + j); 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2){ 
            if (L[i] <= R[j]) { 
                list.set(k, L[i]);
                i++; 
            } 
            else{ 
                list.set(k, R[j]);
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1){ 
            list.set(k, L[i]);
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2){ 
            list.set(k, R[j]);
            j++; 
            k++; 
        } 
    } 

    public static void quickSort(ArrayList<Integer> list){
        
    }


}
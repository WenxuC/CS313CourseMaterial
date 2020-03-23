import java.util.List;
class SortAlgorithms{
    public static void bubbleSort(List<Integer> unsortedList){
        int n = unsortedList.size(); 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++)
                if(unsortedList.get(j) > unsortedList.get(j+1)){
                    swap(unsortedList, j+1, j);
                }
    }

    public static void insertionSort(List<Integer> unsortedList){
        int n = unsortedList.size(); 
        for (int i=1; i<n; i++){ 
            int target = unsortedList.get(i); 
            int j = i-1;
            while (j >= 0 && unsortedList.get(j) > target){ 
                unsortedList.set(j+1, unsortedList.get(j));
                j--; 
            } 
            unsortedList.set(j+1, target);
        } 
    }

    public static void mergeSort(List<Integer> unsortedList, int low, int high){
        if (low < high) { 
            int m = (low + high) / 2;
            mergeSort(unsortedList, low, m); 
            mergeSort(unsortedList, m+1, high); 
            merge(unsortedList, low, m, high); 
        } 
    }

    private static void merge(List<Integer> unsortedList, int l, int m, int r) { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
        
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = unsortedList.get(l + i); 
        for (int j=0; j<n2; ++j) 
            R[j] = unsortedList.get(m + 1 + j); 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2){ 
            if (L[i] <= R[j]) { 
                unsortedList.set(k, L[i]);
                i++; 
            } 
            else{ 
                unsortedList.set(k, R[j]);
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1){ 
            unsortedList.set(k, L[i]);
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2){ 
            unsortedList.set(k, R[j]);
            j++; 
            k++; 
        } 
    } 

    public static void quickSort(List<Integer> unsortedList, int low, int high){
        if(low<high){
            int m = partition(unsortedList, low, high);
            quickSort(unsortedList, low, m-1);
            quickSort(unsortedList, m+1, high);
        }
    }

    private static int partition(List<Integer> unsortedList, int low, int high){
        //partition into unsortedList[low - j-1],
        int i = low, j = high+1;
        int pivot = unsortedList.get(low);
        while(true){
            while(unsortedList.get(++i) < pivot) if (i == high) break;
            while(pivot < unsortedList.get(--j)) if (j == low) break;
            if( i >= j) break;
            swap(unsortedList, i , j);
        }
        swap(unsortedList, low, j);
        return j;
    }

    private static void swap(List<Integer> unsortedList, int a, int b){
        int temp = unsortedList.get(a);
        unsortedList.set(a, unsortedList.get(b));
        unsortedList.set(b, temp);
    }
    
}
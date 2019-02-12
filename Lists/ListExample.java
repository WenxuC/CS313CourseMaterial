import java.util.*;

class ListExample{
    public static void main(String args[]){
        try{
            System.out.println("Arrays:");
            int[] array = new int[5];
            fill(array);
            System.out.println(Arrays.toString(array));
            Arrays.sort(array);
            System.out.println(Arrays.toString(array));
            array[5] = 10;
        }catch(Exception e){
            System.out.println(e);
        }

        System.out.println("ArrayList 1:");
        ArrayList<Integer> list1 = new ArrayList<>();
        fill(list1);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);

        list1.add(99);
        list1.set(0, 99);
        System.out.println(list1);

        System.out.println("ArrayList 2:");
        List<Integer> list2 = new ArrayList<>();
        fill(list2);
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);

        list2.add(999);
        list2.set(0, 999);
        System.out.println(list2);

        System.out.println("LinkedList 3:");
        List<Integer> list3 = new LinkedList<>(list1); // Creates a LinkedList containing the same elements as list1
        System.out.println(list3);
        
    }

    private static void fill(int array[]){
        Random rand = new Random();
        for(int i = 0; i<array.length; i++)
            array[i] = rand.nextInt()%10;
    }

    private static void fill(List<Integer> list){
        Random rand = new Random();
        for(int i = 0; i<10; i++)
            list.add(rand.nextInt()%10);
    }

}

/*
        System.out.println("ArrayList 1:");
        ArrayList<Integer> list1 = new ArrayList<>();
        fill(list1);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);

        list1.add(99);
        list1.set(0, 99);
        System.out.println(list1);

        System.out.println("ArrayList 2:");
        List<Integer> list2 = new ArrayList<>();
        fill(list2);
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);

        list2.add(999);
        list2.set(0, 999);
        System.out.println(list2);
*/
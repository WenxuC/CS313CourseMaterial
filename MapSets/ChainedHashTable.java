//Array of chains(ArrayLst) that links same keys together with its values
import java.util.ArrayList;
import java.util.Iterator;
public class ChainedHashTable<E> implements Set<E> {
    int size;
    int capacity;
    ArrayList<E> chain[];
 
    ChainedHashTable() {
       this(1000); //calls ChainedHashTable(int cap) constuctor with 1000 capacity
    }
 
    public ChainedHashTable(int cap) {
       capacity = cap;
       chain = (ArrayList<E>[]) new ArrayList[cap];//arrays cannot be declared with generics, must be casted
       size = 0;//size is the sum of the size of all the Arraylists
       for (int i = 0; i < cap; i++)
          chain[i] = null; // each list is empty
    }
 
    public int size() {
       return size;
    }
 
    public boolean isEmpty() {
       return size == 0;
    }
 
    public E get(E k) {
       int h = k.hashCode() % capacity;
       //h is the index of the key value
       if (chain[h] != null) { // check is the key is in there
          for (int i = 0; i < chain[h].size(); i++) {//loop goes through this key's list 
             E p = chain[h].get(i);
             //uses Entry class equals method, returns the equalivent keys Entry object
             if (p.equals(k))
                return p;
          } 
       }
       return null; // no key, return null
    }
    
    //checks if key is in any of the list
    public boolean contains(E k) {
       return get(k) != null; 
    }

    public void add(E k) {
       int h = k.hashCode() % capacity;//get the index for the key
       //if there nothing set to this key yet, create new list
       if (chain[h] == null)
          chain[h] = new ArrayList<>();
      //goes through the list,
       for (int i = 0; i < chain[h].size(); i++) {
          E p = chain[h].get(i);
          //if the key already exist, replace it
          if (p.equals(k)) {
             chain[h].set(i, k);
             return;
          }
       }
       //if the key doesnt exist in the list yet, add to back of the list
       chain[h].add(k);
       size++;
    }
 
    public void remove(E k) {
       int h = k.hashCode() % capacity;//get the index for the key
       if (chain[h] != null) {//only do anything, if the key exist
            // goes through the list
          for (int i = 0; i < chain[h].size(); i++) {
             E p = chain[h].get(i);
             //find the key and its entry, remove it from the list
             if (p.equals(k)) {
                chain[h].remove(i);
                size--;
                return;
             }
          }
       }
    }
    
    public void dumpData() {
       for (int i = 0; i < capacity; i++) {
          if (chain[i] != null) {
             System.out.print("" + i + ": ");
             for (int j = 0; j < chain[i].size(); j++) {
                E p = chain[i].get(j);
                System.out.print(p);
                if (j < chain[i].size() - 1) System.out.print(", ");
             }
             System.out.println();
          }
       }
    }
    // gets an iterator of the Entries
    public Iterator<E> iterator() {
       ArrayList<E> content = new ArrayList<E>();
       for (int i = 0; i < capacity; i++) {
          if (chain[i] != null) {
             for (int j = 0; j < chain[i].size(); j++)
                content.add(chain[i].get(j));
          }
       }
       return content.iterator();
    }
 }
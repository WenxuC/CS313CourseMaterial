//Map implementation through a set implementation
public class SetAdapterMap<K, V> implements Map<K, V> {
    protected Set<Entry<K, V>> table;
 
    public SetAdapterMap(Set<Entry<K, V>> s) {
       table = s;
    }
 
    public int size() {
       return table.size();
    }
 
    public boolean isEmpty() {
       return table.isEmpty();
    }
 
    public V get(K k) {
        /* Gets the value through a key:
        i) create a entry of just the key and no value
        ii) the .get method of a set return a Entry object
        iii) .getValue of Entry Class returns the value*/
       try {
          return table.get(new Entry<K, V>(k, null)).getValue();
       } catch (Exception e) {
          return null;
       }
    }

    public void put(K k, V v) throws Exception {
        //adding a (Key -> Value) through anding a Entry(Key Value) into the table
       table.add(new Entry<K, V>(k, v));
    }
 
    public void remove(K k) {
       table.remove(new Entry<K, V>(k, null));
    }
 
    public Set<K> keySet() throws Exception {
       Set<K> answer = new ChainedHashTable<K>(size());
       for (Entry<K, V> e : table)
          answer.add(e.getKey());
       return answer;
    }
 
    public void dumpTable() {
       table.dumpData();
    }
 }
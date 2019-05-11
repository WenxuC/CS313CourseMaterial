//interface for Maps
//Map is a set of Entry of <Key and Value> pairs

public interface Map<K, V>{
    public int size();
    public boolean isEmpty();
    public V get(K k);
    public void put(K k, V v) throws Exception;
    public void remove(K k);
    public Set<K> keySet() throws Exception;
    public void dumpTable();
}
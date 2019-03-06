import java.util.Iterator;

public class IterableObject<T> implements Iterable<T>{
    public Iterator<T> iterator(){
        return new ObjectIterator<T>(front);
    }
}

class ObjectIterator<T> implements Iterator<T>{

    private T current;

    public ObjectIterator(T c){
        current = c;
    }

    public T next(){
        T answer = current.getData();
        current = current.getNext();
        return answer;
    }

    public boolean hasNext(){
        return current!=null;
    }

    public void remove(){
        throw new UnsupportedOperationException();
    }
}
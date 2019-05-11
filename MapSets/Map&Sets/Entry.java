//An entry contains pair of key and value
public class Entry<Key, Value> {
    protected Key k;
    protected Value v;

    public Entry(Key k, Value v) {
        this.k = k;
        this.v = v;
     }
 
    public int hashCode() {
       return k.hashCode();
    }
    //checks if the keys matches, no need to check the values
    public boolean equals(Object x) {
       Key kk;
       /*Try and Catch block check is the value set to kk is of the type key.
       if not, mismatch type exception is thrown. When exception is caught, the key does not exist and false is returned */
       try {
          kk = (Key) ((Entry) x).k; //because of the object class being passed in, cast to Entry type is needed
       } catch (Exception e) {
          return false;
       }
       return k.equals(kk); //check is the this key value is equal to kk key value
    }
 
    public Key getKey() {
       return k;
    }
 
    public void setKey(Key k) {
       this.k = k;
    }
 
    public Value getValue() {
       return v;
    }
 
    public void setValue(Value v) {
       this.v = v;
    }
 
}
class DoublyLinkedList implements LinkedListInterface {
    private DNode header, trailer;
    private int size;

    DoublyLinkedList(){
        header = new DNode();
        trailer = new DNode();
        header.setNext(trailer);
        trailer.setPrev(header);
        size = 0;
    }

    public void addFirst(int data){
        DNode newNode = new DNode(data);
        addAfter( newNode, header);
        size++;
    }

    private void addAfter( DNode newData, DNode after){
        after.getNext().setPrev(newData);
        newData.setNext(after.getNext());
        after.setNext(newData);
        newData.setPrev(after);
    }

    public void addLast(int data) {
    
    }

    private void addBefore (DNode newData, DNode before) {
        
    }

    public void addAfter(int data, int after){
        DNode newData = new DNode(data);
        DNode afterNode = findNode(after);
        if(afterNode == trailer) {
            System.out.println("After node does not exist, defaulting insertion at rear");
            addBefore(newData, trailer);
            size++;
            return;
        }
        addAfter(newData, afterNode);
        size ++;
        return;
    }

    public void addBefore(int data, int before){

    }

    private DNode findNode(int target){
        DNode targetNode = header.getNext();
        while(targetNode != trailer && targetNode.getData()!=target){
            targetNode = targetNode.getNext();
        }
        return targetNode;
    }

    public boolean contains(int target){

    }
    public int get(int index){

    }
    public void removeHead(){

    }
}
package earlyJavaObjects.chapter7;

public class List1Impl implements List1 {
    private Node head = null;
    private static int counter;

    public List1Impl(){

    }

    @Override
    public void add(int data) {

        if(head == null){
            head = new Node(data);
        }
        Node temp = new Node(data);
        Node current = head;

        if(current != null){

            while (current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(temp);
        }
        incrementCounter();
    }

    public static int getCounter(){
        return counter;
    }
    public static void incrementCounter(){
        counter ++;
    }

    @Override
    public void delete(int index) {
        // if index out of range
        if(index < 1 || index > size()){
            return;
        }

        Node current = head;

        if(head != null){
            for (int i = 0; i < index; i++){
                // check for last data
                if(current.getNext() == null){
                    return;
                }
                // transverse through the list
                current = current.getNext();
            }

            current.setNext(current.getNext().getNext());
        }
    }

    @Override
    public int size() {
        return getCounter();
    }

    public void printList() {
        Node n = head.getNext();
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.getNext();
        }
        System.out.println();
    }
}

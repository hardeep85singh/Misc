package ListInterfaces;

public class List1Impl implements List1 {
    private Node head = null;
    private int counter;

    @Override
    public void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = new Node(data);
            return;
        }
        node.setNext(null);

        Node last = head;
        while (last.getNext() != null) {
            last = last.getNext();
        }
        last.setNext(node);

        counter++;
    }

       @Override
    public void delete(int index) {
        // if index out of range
        if (index < 1 || index > size()) {
            return;
        }
        Node current = head;

        if (head != null) {
            for (int i = 0; i < index; i++) {
                // check for last data
                if (current.getNext() == null) {
                    return;
                }
                // transverse through the list
                current = current.getNext();
            }

            current.setNext(current.getNext().getNext());
        }
        counter --;
    }

    @Override
    public int size() {
        return counter;
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

package ListInterfaces;

public class StackListimpl implements Stack {
    private Node head = null;
    private int counter;


    @Override
    public void push(int data) {
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
    public void pop() {
        if (head == null) {
            throw new IllegalArgumentException(
                    "Stack is empty");
        }
        Node current = head;
        if (current.getNext() == null) {
            head = null;
        }
        while (current.getNext() != null) {
            if (current.getNext().getNext() == null) {
                current.setNext(null);

            } else {
                current = current.getNext();
            }
        }
        counter--;
    }

    @Override
    public boolean isEmpty() {
        if (counter == 0) {
            return true;
        }
        return false;
    }

}

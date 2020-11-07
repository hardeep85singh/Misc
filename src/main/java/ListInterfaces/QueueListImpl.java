package ListInterfaces;

import java.util.NoSuchElementException;

public class QueueListImpl implements Queue {
    private int size;
    private Node first;
    private Node last;

    private class Node{
        private int value;
        private Node next;
    }
    public QueueListImpl(){
        first = null;
        last = null;
        size = 0;

    }
    private int getSize(){
        return size;
    }

    @Override
    public void addFirst(int value) {
        Node temp = new Node();
        temp.value = value;
        if(isEmpty()){
            first = temp;
            last = first;
        }else {
            temp.next = first;
            first = temp;
        }
        size++;
    }

    @Override
    public void addLast(int value) {
        Node temp = new Node();
        temp.value = value;
        if(isEmpty()){
            last = temp;
            first = last;
        } else {
            temp.next = last;
            last = temp;
        }
        size ++;
    }

    @Override
    public void deleteFirst() {
        if(isEmpty()) {throw new NoSuchElementException("Queue is Empty.");}
        while (!isEmpty()){
            if(size == 1){
                first = null;
            } else if ( size == 2){
                last = first;
                first = null;
            } else {
                first.next = first;
                first = null;
            }
        }
        size --;
    }

    @Override
    public void deleteLast() {
        if(isEmpty()){throw new NoSuchElementException("Queue is Empty.");}
        Node current = new Node();
        current = first;
        while (current != last){
            if(size == 1){
                first = null;
                break;
            } else if(size == 2){
                last = first;
                last.next = null;
                break;
            } else{
                while (current.next != null){
                    if(current.next.next == null){
                        last = current;
                        current.next = null;
                    } else {
                        current = current.next;
                    }
                }
            }

        }
        size--;
    }

    @Override
    public boolean isEmpty() {
        if(size != 0){
            return false;
        }
        return true;
    }

    @Override
    public void print() {
        Node n = new Node();
        n = first;
        while (n != last) {
            System.out.print(n.value + ",");
            n = first.next;
        }
        System.out.println();
    }
}

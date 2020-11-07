package ListInterfaces;

public class QueueArrayImpl implements Queue {
    private int front;
    private int rear;
    private int size;
    private int length;
    private int[] arr;

    public QueueArrayImpl(int length) {
        this.length = length;
        front = this.size = 0;
        rear = length - 1;
        arr = new int[length];
    }

    private boolean isFull(QueueArrayImpl queue) {
        if (queue.size == queue.length) {
            return true;
        }
        return false;
    }

    @Override
    public void addFirst(int value) {
        if (isFull(this)) {
            throw new IllegalArgumentException(
                    "Queue is Full."
            );
        }
        this.rear = (this.rear + 1) % this.length;
        this.arr[this.rear] = value;
        this.size = this.size + 1;
    }

    @Override
    public void addLast(int value) {

    }

    @Override
    public void deleteFirst() {

    }

    @Override
    public void deleteLast() {

    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void print() {

    }
}

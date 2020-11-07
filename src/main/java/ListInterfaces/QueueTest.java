package ListInterfaces;

public class QueueTest {
    public static void main(String[]args) {
        Queue queue = new QueueListImpl();

       queue.addFirst(2);
       queue.addFirst(4);
       queue.addFirst(5);
       System.out.println(queue.isEmpty());
       queue.deleteLast();
       queue.deleteLast();
       queue.addLast(7);
       queue.addLast(9);
       queue.deleteFirst();

    }

}

package b11stackandqueue.Demo;

public class TestQueue {

    public static void main(String[] args) {
        Queue  q = new Queue();
        q.enQueue(14);
        q.enQueue(22);
        q.enQueue(4);
        q.enQueue(5);
        q.enQueue(6);
        q.enQueue(7);
        q.enQueue(8);

        q.displayQueue();

        System.out.println("Deleted value = " + q.deQueue());
        System.out.println("Deleted value = " + q.deQueue());

        q.displayQueue();

        q.enQueue(9);
        q.enQueue(20);
        q.displayQueue();
    }
}

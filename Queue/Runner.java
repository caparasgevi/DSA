public class Runner {
    public static void main(String[] args) {
        Queue num = new Queue();
        num.enQueue(5);
        num.enQueue(10);
        num.enQueue(15);
        num.enQueue(20);
        num.enQueue(25);
        num.show();
        System.out.println("The queue is full: " + num.isFull());
        System.out.println("Size: " + num.size());
        System.out.println(num.deQueue());
        System.out.println(num.deQueue());
        System.out.println(num.deQueue());
        System.out.println(num.deQueue());
        System.out.println(num.deQueue());
        System.out.println("The queue is empty: " + num.isEmpty());
        System.out.println("Size: " + num.size());
    }
}

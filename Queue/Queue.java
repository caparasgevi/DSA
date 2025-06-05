public class Queue {
    int[] queue = new int[5];
    int rear, front, size;

    public void enQueue(int data){
        queue[rear] = data;
        rear = (rear + 1) % 5;
        size++;
    }
    public int deQueue(){
        System.out.print("Dequeued: ");
        int data = queue[front];
        front = (front + 1) % 5;
        size--;
        return data;
    }
    public boolean isEmpty(){
        return size <= 0;
    }
    public boolean isFull(){
        return size == 5;
    }
    public void show(){
        System.out.print("Elements: ");
        for (int i = 0; i < size; i++){
            System.out.print(queue[front + i] + " ");
        }
        System.out.println();
    }
    public int size(){
        return size;
    }
}

public class Runner {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.insert(5);
        list.insert(12);
        list.insert(14);
        list.insertAt(2, 55);
        list.insertAtStart(25);
        list.insertAt(1, 22);
        list.insertAt(0,99);
        list.show();
    }
}

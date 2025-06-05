public class Runner {
    public static void main(String[] args) {
        Stack num = new Stack();
        num.push(5);
        num.push(10);
        num.push(15);
        num.push(20);
        num.push(25);
        num.show();
        System.out.println("Pop: " + num.pop());
        num.show();
        System.out.println("Peek: " + num.peek());
        num.show();
        System.out.println("The stack is empty: " + num.isEmpty());
        System.out.println("Size: " + num.size());
        num.pop();
        num.pop();
        num.pop();
        num.pop();
        System.out.println("The stack is empty: " + num.isEmpty());
        System.out.println("Size: " + num.size());
        num.pop();

    }
}

public class MyStackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push("chen");
        myStack.push("zi");
        myStack.push("hao");
        myStack.push("hao");
        myStack.push("hao");
        myStack.push("hao");
        myStack.push("hao");
        myStack.push("hao");
        myStack.push("hao");
        myStack.push("hao");
        myStack.push("hao");
        System.out.println(myStack);
        myStack.pop();
        System.out.println(myStack);
        myStack.pop();
        System.out.println(myStack);
        myStack.pop();
        myStack.pop();
    }
}

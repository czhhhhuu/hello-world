import java.util.Arrays;

public class MyStack {
    private Object[] elements;
    private int top;

    public MyStack() {
        elements = new Object[10];
        top = -1;
    }

    public Object[] getElements() {
        return elements;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public void push(Object object){
        if(top == elements.length-1){
            System.out.println("栈已满，不能压栈");
        }else{
            elements[++top] = object;
        }
    }

    public void pop(){
        if(top == -1){
            System.out.println("栈已空，不能弹栈");
        }else{
            elements[top--] = null;
        }
    }
}

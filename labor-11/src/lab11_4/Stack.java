package lab11_4;

import java.util.ArrayList;

public class Stack extends StackException{


    private ArrayList<Object> items = new ArrayList<>();
    private final int capacity;

    public Stack(int capacity){
        super("Stack Exception");
        this.capacity = capacity;
    }

    public boolean isFull(){
        return items.size() >= capacity;
    }

    public boolean isEmpty(){
        return items.size()<=0;
    }

    public void push(Object object) throws StackException {

        if (!isFull()) {
            items.add(object);
        } else {
            throw new StackException("Stack is full");
        }
    }


    public void pop() throws StackException{

        if (!isEmpty()) {
            items.remove(items.size() - 1);
        } else {
            throw new StackException("Stack is empty");
        }
    }

    public Object top() throws StackException {

        if (isEmpty()) {
            throw new StackException("Stack is empty");
        }
        return items.get(items.size() - 1);

    }

    public int getSize(){
        return items.size();
    }
}

package datastructures.stack;

public class StackAsLinkedList {
    int data;
    StackAsLinkedList node;

    public StackAsLinkedList(int data){
        this.data = data;
    }

    boolean isEmpty(){
        if(node != null){
            return false;
        }
        return true;
    }

    boolean push(int data){
        if(node != null){

        }
        new StackAsLinkedList(data);
        return false;
    }

    int pop(){
        return -1;
    }

    int peek(){
        return -1;
    }

    public static void main(String[] args) {
        StackAsLinkedList stack = new StackAsLinkedList(1);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop()
                + " popped from stack");

        System.out.println("Top element is " + stack.peek());
    }
    }


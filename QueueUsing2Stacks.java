import java.util.*;
public class QueueUsing2Stacks<T> {
    private Stack<T> insertionStack;
    private Stack<T> deletionStack;
    public QueueUsing2Stacks(){
        insertionStack = new Stack<>();
        deletionStack = new Stack<>();
    }
    public void enqueue(T item){
        insertionStack.push(item);
    }
    public void dequeue(){
        if(insertionStack.isEmpty()) {
            System.out.println("Queue is empty");
        }else{ 
            while(!insertionStack.isEmpty()){
                deletionStack.push(insertionStack.pop());
            }
            System.out.println("The element removed is : " +  deletionStack.pop());
            while(!deletionStack.isEmpty()) {
                insertionStack.push(deletionStack.pop());
            }
        }
    }
    public void peek(){
        if(insertionStack.isEmpty()){
            System.out.println("Queue is empty");
        }else{
            System.out.println("The peek element is : " + insertionStack.peek());
        }     
    }
    public static void main(String[] args) {
        QueueUsing2Stacks queue = new QueueUsing2Stacks();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(50);
        queue.dequeue();
        queue.peek();
    }
}



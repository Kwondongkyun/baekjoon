import java.util.*;
public class javaqueue {
    int MAX = 1000;
    int front;
    int rear;
    int[] queue;
    public javaqueue(){
        front = rear = 0;
        queue = new int[MAX];
    }
    public boolean queueisEmpty(){
        return front == rear;
    }
    public boolean queueisFull(){
        if(rear == MAX-1){
            return true;
        }
        else{
            return false;
        }
    }
    public void push(int value){
        if(queueisFull()){
            System.out.println("Queue is Full");
            return;
        }
        queue[rear++] = value;
    }
    public int pop() {
        if(queueisEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int popValue = queue[front++];
        return popValue;
    }
    public int peek(){
        if(queueisEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int popValue = queue[front];
        return popValue;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            String s = sc.next();

            switch(s){
                case "push":
                int a = sc.nextInt();
                
            }
        }
    }
}

import java.util.Scanner;
public class queue {
    int size;
    int arr[];
    int front;
    int rear;
    queue(int n){
        size = n;
        arr = new int[n];
        front = -1;
        rear = -1;
    }
    void enqueue(int n){
        if(rear == -1){
            rear = 0;
            front = 0;
            arr[rear] = n;
        }
        else if(rear == (size-1))
            System.out.println("Queue full");
        else
            arr[++rear] = n;
    }
    void dequeue(){
        if(front == -1)
            System.out.println("Queue empty");
        else if(front==rear){
            System.out.println(arr[front]);
            front = -1;
            rear = -1;
        }
        else{
            System.out.println(arr[front]);
            arr[front++] = 0;
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of queue");
        queue s = new queue(sc.nextInt());
        while(true){
            System.out.println("Enter 0 for enqueue, 1 for dequeue, any key for exit");
            int x = sc.nextInt();
            if(x==0){
                System.out.println("Enter number");
                s.enqueue(sc.nextInt());
            }
            else if(x==1)
                s.dequeue();
            else
                break;
        }
        sc.close();
    }
}

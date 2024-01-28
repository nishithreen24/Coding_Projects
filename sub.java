import java.util.Scanner;
class sub{
    int n;
    int arr[];
    int top = -1;
    sub(int size){
        n = size;
        arr = new int[n];
    }
    void push(int i){
        if(top==(n-1))
            System.out.println("Stack Overflow");
        else
            arr[++top] = i;
    }
    void pop(){
        if(top==-1)
            System.out.println("Empty Stack");
        else{
            System.out.println(arr[top]);
            arr[top--] = 0;
        }
    }
    void peek(){
        System.out.println(arr[top]);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of stack");
        sub s = new sub(sc.nextInt());
        while(true){
            System.out.println("Enter 0 for push, 1 for pop, any key for exit");
            int x = sc.nextInt();
            if(x==0){
                System.out.println("Enter number");
                s.push(sc.nextInt());
            }
            else if(x==1)
                s.pop();
            else
                break;
        }
        sc.close();
    }
}
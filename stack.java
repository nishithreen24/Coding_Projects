import java.util.Scanner;
class stack{
    int top = -1;
    int length;
    int arr[] = new int[length];
    void push(int i){
        arr[top++] = i;
    }
    void pop(){
        arr[--top] = 0;
    }
    void peek(){
        System.out.println(arr[top-1]);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        stack s = new stack();
        System.out.println("Enter maximum lentth of stack: ");
        s.length = sc.nextInt();
        
        sc.close();
    }
}
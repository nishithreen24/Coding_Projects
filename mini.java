import java.util.Scanner;
public class mini 
{
    int pos(int i, int m, int arr[], int n){
        if(i==(n))
            return m;
        else{
            if(arr[i]<=arr[m])
                return pos(i+1, i, arr, n);
            else
                return pos(i+1, m, arr, n);
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int [5];
        mini m = new mini();
        for(int i = 0; i < 5; i++)
            a[i] = sc.nextInt();
        System.out.println(a[m.pos(0, 0, a, 5)]);
        sc.close();
    }
}

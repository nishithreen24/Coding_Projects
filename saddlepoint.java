import java.util.Scanner;
public class saddlepoint {
    boolean getSaddle(int arr[][], int n){
        for (int i = 0; i < n; i++){
            int min = arr[i][0], column = 0;
            for (int j = 1; j < n; j++){
                if (min > arr[i][j]){
                    min = arr[i][j];
                    column = j;
                }
            }
            int k;
            for (k = 0; k < n; k++){
                if (min < arr[k][column])
                    break;
            }
            if (k == n){
               System.out.println("Value of Saddle Point " + min);
               return true;
            }
        }
        return false;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of square matrix: ");
        int l = sc.nextInt();
        int arr[][] = new int[l][l];
        for(int i = 0; i < l; i++){
            System.out.println("Enter elements of the " + (i+1) + "st row");
            for(int j = 0; j < l; j++)
                arr[i][j] = sc.nextInt();
        }
        saddlepoint sp = new saddlepoint();
        sp.getSaddle(arr, l);
        sc.close();
    }
}

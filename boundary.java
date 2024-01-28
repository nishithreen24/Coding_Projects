import java.util.Scanner;
public class boundary {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int l = sc.nextInt();
        int arr[][] = new int[l][l];
        System.out.println("Enter elements of array: ");
        for(int i = 0; i < l; i++){
            for(int j = 0; j < l; j++)
                arr[i][j] = sc.nextInt();
        }
        int l1 = (l-2)*(l-2);
        int arr1[] = new int[l1];
        int k = 0;
        for(int i = 1; i < l-1; i++){
            for(int j = 1; j < l-1; j++)
                arr1[k++] = arr[i][j];
        }
        for(int i = 0; i < l1; i++){
            int min = i;
            for(int j = i+1; j < l1; j++){
                if(arr1[j] < arr1[min])
                    min = j;
            }
            int temp = arr1[i];
            arr1[i] = arr1[min];
            arr1[min] = temp;
            System.out.print(arr1[i]+ " ");
        }
        System.out.println();
        k = 0;
        for(int i = 1; i < l-1; i++){
            for(int j = 1; j < l-1; j++)
            arr[i][j] = arr1[k++];
        }
        for(int i = 0; i < l; i++){
            for(int j = 0; j < l; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
        sc.close();
    }
}

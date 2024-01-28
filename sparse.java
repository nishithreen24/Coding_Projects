import java.util.Scanner;
public class sparse {
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
        int counter = 0;
        for(int i = 0; i < l; i++){
            for(int j = 0; j < l; j++)
                if(arr[i][j]==0)
                    counter++;
        }
        if(counter>(l*l/2))
            System.out.println("Its a sparse matrix");
        else
            System.out.println("Not a sparse matrix");
        sc.close();
    }
}

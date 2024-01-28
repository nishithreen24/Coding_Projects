import java.util.Scanner;
class product_matrix{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the square matrix: ");
        int l = sc.nextInt();
        int arr1[][] = new int[l][l];
        int arr2[][] = new int[l][l];
        System.out.println("Enter elements of the first array: ");
        for(int i = 0; i < l; i++){
            System.out.println("Enter elements of the " + (i+1) + "st row");
            for(int j = 0; j < l; j++)
                arr1[i][j] = sc.nextInt();
        }
        System.out.println("Enter elements of the second array: ");
        for(int i = 0; i < l; i++){
            System.out.println("Enter elements of the " + (i+1) + "st row");
            for(int j = 0; j < l; j++)
                arr2[i][j] = sc.nextInt();
        }
        int arr[][] = new int[l][l];
        for(int i = 0 ; i < l ; i++){
            for(int j = 0; j < l; j++){
                arr[i][j] = (arr1[i][j]*arr2[i][j]) + (arr1[i][j+1]*arr2[i+1][j]);
            }
        }
        sc.close();
    }
}
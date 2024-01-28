import java.util.Scanner;
class odd_sum{
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
        boolean check = true;
        int sum = 0;
        for(int i = 0; i < l; i++){
            int sumi = 0;
            for(int j = 0; j < l; j++)
                sumi  = sumi + arr[i][j];
            if(i==0)
                sum = sumi;
            else{
                if(sum!=sumi){
                    check = false;
                    break;
                }
            }
            if(check==false){
                System.out.println("Matrix is unequal");
                break;
            }
        }
        if(check==true)
            System.out.println("Matrix is equal");
        sc.close();
    }
}
import java.util.Scanner;
class casino{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("n");
        int n = sc.nextInt();
        System.out.println("m");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < m; j++)
                arr[i][j] = sc.nextInt();
        }
        int winnings = 0;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j<n;j++){
                for(int k = 0; k < m; k++){
                    int ai = arr[i][k];
                    int bi = arr[j][k];
                    winnings = winnings + Math.abs(ai-bi);
                }
            }
        }
        System.out.println(winnings);
        sc.close();
    }
}
import java.util.Scanner;
public class pointsonplane {
    public static void main(String  [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        if(n>20)
            System.out.println(n);
        sc.close();
    }
}

import java.util.Scanner;
public class gcd {
    int eval(int a, int b){
        if(b==0)
            return a;
        else
            return eval(b, a%b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        gcd g = new gcd();
        System.out.println(g.eval(i1, i2));
        sc.close();
    } 
}

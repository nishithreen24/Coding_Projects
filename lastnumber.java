import java.util.Scanner;
class lastnumber{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        if(n>20)
            System.out.println("last");
        sc.close();
    }
}
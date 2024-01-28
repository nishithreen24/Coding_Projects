import java.util.Scanner;
class garland{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter garland");
        int arr[] = new int[4];
        int freq = 0;
        for(int i = 0; i< 4; i++){
            arr[i] = sc.nextInt();
            for(int j = i; j >= 0; j--){
                if(arr[i]==arr[j])
                    freq++;
            }
        }
        //System.out.println(freq);
        if((freq==4)||(freq==5))
            System.out.println("4");
        else if(freq==7)
            System.out.println("6");
        else
            System.out.println("-1");
        sc.close();
    }
}
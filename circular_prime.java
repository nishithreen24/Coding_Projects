import java.util.Scanner;
class circular_prime{
    boolean isPrime(int num){
        for(int i = 0 ; i <= num/2 ; i++){
            if((num%i) == 0)
                return false;
        }
        return true;
    }
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number: ");
            int input = sc.nextInt();
            int remainder = input;
            Integer x = input;
            int length = (x.toString()).length();
            int arr[] = new int[length];
            int counter = length-1;
            while(remainder>0){
                arr[counter] = (remainder%10);
                remainder = remainder/10;
                counter--;
            }
            for(int i = 0; i < length; i++)
                System.out.print(arr[i]);
            System.out.println();
            for(int i = 1 ; i < length ; i ++){
                int temp = 0;
                for(int j = 0; j < length; j++){
                    if(j==0){
                        temp = arr[j];
                        arr[j] = arr[j+1];
                    }
                    else if(j==(length-1)){
                        arr[j] = temp;
                    }
                    else{
                        arr[j] = arr[j+1];
                    }
                }
                for(int j = 0; j < length; j++){
                    System.out.print(arr[j]);
                }
                int numb = 0;
                for(int j = 0; j < length; j++){
                    numb = numb + (int)Math.pow(10, j);
                }
                System.out.println();
            }
            sc.close();
        }
    }
}
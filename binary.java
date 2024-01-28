public class binary {
    int bin(int arr[], int find, int start, int end){
        if(end<start)
            return -1;
        else{
            if(find>arr[(start+end)/2])
                return bin(arr, find, ((start+end)/2)+1, end);
            else if(find<arr[(start+end)/2])
                return bin(arr, find, start, ((start+end)/2)-1);
            else
                return (start+end)/2;
        }
    }
    public static void main(String [] args){
        int a [] = {1,3,7,9,14,21};
        binary b = new binary();
        System.out.println(b.bin(a, 21, 0, 5));
    }
}

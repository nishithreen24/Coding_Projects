import java.lang.Math;
class sol{
    public int numSubseq(int[] nums, int target) {
        int counter = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length-i; j++){
                int min = nums[i];
                int max = 0;
                for(int k = i; k <= i+j; k++){
                    min = Math.min(min, nums[k]);
                    max = Math.max(max, nums[k]);
                    System.out.print(nums[k]+" ");
                }
                System.out.println();
                if((min+max)<=target)
                    counter++;
            }
        }
        return counter;
    }
    public static void main(String [] args){
        sol s = new sol();
        int arr[] = {3,5,6,7};
        System.out.println(s.numSubseq(arr, 9));
    }
}
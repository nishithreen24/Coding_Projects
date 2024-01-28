import java.util.ArrayList;
class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        ArrayList<Integer> sub = new ArrayList<Integer>(0);
        outer: for(int i = 0;i < n; i++){
            for(int j = 0; j< n; j++){
                if(i==manager[j])
                    continue outer;
            }
            sub.add(i);
        }
        int max = 0;
        for(int i = 0; i< sub.size(); i++){
            int sum = 0;
            int boss = manager[sub.get(i)];
            do{
                sum = sum + informTime[boss];
                boss = manager[boss];
            }while(boss!=-1);
            max = Math.max(max, sum);
        }
        return max;
    }
    public static void main(String [] args){
        Solution s = new Solution();
        int [] manager = {-1,0,0,1,1,2,2,3,3,4,4,5,5,6,6};
        int [] informTime = {1,1,1,1,1,1,1,0,0,0,0,0,0,0,0};
        System.out.println(s.numOfMinutes(15, 0, manager, informTime));
    }
}
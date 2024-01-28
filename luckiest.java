import java.util.Scanner;
class luckiest{
    public int measureluck(int i){
        String is = Integer.toString(i);
            int digs = is.length();
            int max = 0;
            int min = 9;
            int temp = i;
        for(int j = 0; j < digs; j++){
                int dig = temp%10;
                temp = temp/10;
                //System.out.println(dig+"dig");
                if(dig>max)
                    max = dig;
                else if(dig<min)
                    min = dig;
                //System.out.println(max+ "max");
                //System.out.println(min+"min");
            }
            return (max-min);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        luckiest n = new luckiest();
        System.out.println("enter l");
        String ls = sc.nextLine();
        System.out.println("enter r");
        String rs = sc.nextLine();
        int l = Integer.parseInt(ls);
        int r = Integer.parseInt(rs);
        int luck = 0;
        int lucky = l;
        for(int i = l ; i <= r; i++){
            luck = n.measureluck(i);
            if(luck>=n.measureluck(lucky))
                lucky = i;
        }
        System.out.println(lucky);
        //System.out.println(n.measureluck(lucky));
        //System.out.println(n.measureluck(60));
        sc.close();
    }
}
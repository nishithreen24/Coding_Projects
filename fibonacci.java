class fibonacci{
    int n = 3;
    int fib(int i){
        if (i==1)
            return 0;
        else if (i==2)
            return 1;
        else{
            return fib(i-1)+fib(i-2);
        }
    }
    public static void main(String [] args){
        fibonacci f = new fibonacci();
        System.out.println(f.fib(f.n));
    }
}
class palindrome {
    String s = "i";
    int i = 0;
    boolean b = true;
    boolean check(){
        if(b==false)
            return false;
        else if(i==(s.length()/2))
            return true;
        else{
            if(s.charAt(i)==s.charAt(s.length()-i-1)){
                i++;
                return check();
            }
            else
                return false;
        }
    }
    public static void main(String [] args){
        palindrome p = new palindrome();
        System.out.println(p.check());
    }    
}

public class basecon {
    int hex = 0;
    int dec = 0;
    int count = 0;
    int octtodec(int o){
        if(o==0)
            return dec;
        else{
            dec = dec + (o%10)*(int)Math.pow(8, count++);
            return octtodec(o/10);
        }
    }
    int c = 0;
    int dectohex(int d){
        if(d==0)
            return hex;
        else{
            hex = hex + (d%16)*(int)Math.pow(10, c++);
            return dectohex(d/16);
        }
    }
    public static void main(String [] args){
        basecon b = new basecon();
        System.out.println(b.dectohex(b.octtodec(67)));
    }
}
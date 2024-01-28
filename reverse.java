public class reverse {
    String rev(String s, int l, String output, int i){
        if(i==-1)
            return output;
        else{
            output = output + s.charAt(i);
            return rev(s, l, output, i-1);
        }
    }
    public static void main(String [] args){
        String input = "1i2i3i4";
        reverse r = new reverse();
        System.out.println(r.rev(input, input.length(), "", (input.length()-1)));
    }
}

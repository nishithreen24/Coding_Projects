import java.util.Scanner;
import java.util.StringTokenizer;
public class vowel {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentence in Upper Case: ");
        String s = sc.nextLine();
        StringTokenizer str  = new StringTokenizer(s);
        int counter = 0;
        String vow = "";
        String con = "";
        while(str.hasMoreTokens()){
            String word = str.nextToken();
            char ch1 = word.charAt(0);
            if((ch1=='A')||(ch1=='E')||(ch1=='I')||(ch1=='O')||(ch1=='U')){
                char ch2 = word.charAt((word.length()-1));
                if((ch2=='A')||(ch2=='E')||(ch2=='I')||(ch2=='O')||(ch2=='U')){
                    counter++;
                    vow = vow + word + " ";
                }
            }
            else
                con = con + word +" ";
        }
        System.out.println("NUMBER OF WORDS BEGINNING AND ENDING WITH A VOWEL = " + counter);
        System.out.println(vow + " " + con);
        sc.close();
    }
}

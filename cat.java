import java.util.Scanner;
class cat{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("S");
        String s = sc.nextLine();
        int n = s.length();
        boolean meow = true;
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(i==0){
                if(ch!='m'){
                    meow = false;
                    break;
                }
            }
            else{
                char c = s.charAt(i-1);
                if(c=='m'){
                    if(ch=='m')
                        continue;
                    else if(ch=='e')
                        continue;
                    else{
                        meow = false;
                        break;
                    }
                }
                else if(c=='e'){
                    if(ch=='e')
                        continue;
                    else if(ch=='o')
                        continue;
                    else{
                        meow = false;
                        break;
                    }
                }
                else if(c=='o'){
                    if(ch=='o')
                        continue;
                    else if(ch=='w')
                        continue;
                    else{
                        meow = false;
                        break;
                    }
                }
                else if(c=='w'){
                    if(ch!='w'){
                        meow = false;
                        break;
                    }
                }
                else{
                    meow = false;
                    break;
                }
            }
        }
        if(meow)
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }
}
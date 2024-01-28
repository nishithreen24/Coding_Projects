import java.util.Scanner;
class nods{
    public static void main(String [] args){
        int i = 0;
        Scanner sc = new Scanner(System.in);
        while(i==0){
            System.out.println("What is your name?");
            String s = sc.nextLine();
            if((s.equals("nishith"))||(s.equals("tuktuk")))
                System.out.println("You're amazing");
            else if((s.equals("noddy"))||(s.equals("harshmander")))
                System.out.println("You are probably hungry and look like an ox");
            else if(s.equals("simran"))
                System.out.println("You are a hippopotamus and look like a buffalo");
            else if((s.equals("mitto"))||(s.equals("gurmeet")))
                System.out.println("You're an amazing singer");
            else if(s.equals("pinku"))
                System.out.println("You're a know it all");
            else if(s.equals("karuna"))
                System.out.println("Don't spill the tea!");
            else if(s.equals("rainy"))
                System.out.println("Canada has had enough");
            else if((s.equals("manmohan"))||(s.equals("pappu")))
                System.out.println("Happy retirement!");
            else if(s.equals("kuljeet"))
                System.out.println("Math teachers make a lot of money through teachers");
            else if(s.equals("amarjeet"))
                System.out.println("JO BULE SO NIHAL SATSRIAKAL");
            else if((s.equals("babli"))||(s.equals("rajender")))
                System.out.println("Come to Delhi quick");
            else if((s.equals("channa"))||(s.equals("gurcharan")))
                System.out.println("Khet de kya haal?");
            else{
                System.out.println("I don't know who that is but they're probably better than noddy");
            }
        }
        sc.close();
    }
}
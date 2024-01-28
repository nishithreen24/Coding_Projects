class time{
    public boolean hour(String time1, String time2){
        int h1 = Integer.parseInt(time1.substring(0, 2));
        int h2 = Integer.parseInt(time2.substring(0, 2));
        int m1 = Integer.parseInt(time1.substring(3));
        int m2 = Integer.parseInt(time2.substring(3));
        if(h1==h2){
            return true;
        }
        else if((h2-h1)==1){
            int tm = m2 + 60 - m1;
            {
                if(tm<=60)
                    return true;
                else
                    return false;
            }
        }
        else
            return false;
    }
    public static void main(String [] args){
        time t = new time();
        System.out.println(t.hour("21:30", "23:00"));
    }
}
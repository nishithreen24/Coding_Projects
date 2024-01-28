import java.util.*;
class UndergroundSystem {
    ArrayList<String> stationin = new ArrayList<String>(0);
    ArrayList<String> stationout = new ArrayList<String>(0);
    ArrayList<Integer> timein = new ArrayList<Integer>(0);
    ArrayList<Integer> timeout = new ArrayList<Integer>(0);
    ArrayList<Integer> idin = new ArrayList<Integer>(0);
    ArrayList<Integer> idout = new ArrayList<Integer>(0);
    public UndergroundSystem() {
        
    }
    
    public void checkIn(int id, String stationName, int t) {
        idin.add(id);
        idout.add(0);
        stationin.add(stationName);
        stationout.add("");
        timein.add(t);
        timeout.add(0);
    }
    
    public void checkOut(int id, String stationName, int t) {
        for(int i = 0; i < idin.size(); i++){
            if(id==idin.get(i)){
                idout.set(i, id);
                stationout.set(i, stationName);
                timeout.set(i, t);
            }
        }
    }
    
    public double getAverageTime(String startStation, String endStation) {
        int counter = 0;
        double average = 0;
        int sum = 0;
        for(int i = 0; i < stationin.size(); i++){
            if((stationin.get(i).equals(startStation))&&(stationout.get(i).equals(endStation))){
                sum = (timeout.get(i)-timein.get(i));
                counter++;
            }
        }
        average = sum/counter;
        return average;
    }
    public static void main(String [] args){
        UndergroundSystem US = new UndergroundSystem();
        US.checkIn(45,"Leyton",3);
        US.checkIn(32,"Paradise",8);
        US.checkIn(27,"Leyton",10);
        US.checkOut(45,"Waterloo",15);
        US.checkOut(27,"Waterloo",20);
        US.checkOut(32,"Cambridge",22);
        System.out.println(US.getAverageTime("Paradise","Cambridge"));
        System.out.println(US.getAverageTime("Leyton","Waterloo"));
    }
}
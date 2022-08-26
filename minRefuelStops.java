import java.util.*;

public class minRefuelStops {
    public int twoSumFunc(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> pqueue = new PriorityQueue<>(Collections.reverseOrder());
        long distance = startFuel;
        int idx = 0, noOfStations = 0;
        while (true){
            while(idx<stations.length && distance>=stations[idx][0]){
                System.out.println("At index "+idx+" stations value is: "+stations[idx][1]);
                pqueue.add(stations[idx][1]);
                idx++;
                System.out.println("/////////");
            }
            System.out.println("/////inner loop end////");
            if (distance>=target) return noOfStations;
            if (pqueue.isEmpty()) return -1;
            distance+=pqueue.poll();
            noOfStations++;
        }
    }

    public static void main(String[] args) {
        minRefuelStops ts1 = new minRefuelStops();
        int target = 100, startFuel = 10;
        int[][] nums = {{10,60},{20,30},{30,30},{60,40}};

        int result = ts1.twoSumFunc(target, startFuel, nums);
        
        System.out.println(result);
    }
}

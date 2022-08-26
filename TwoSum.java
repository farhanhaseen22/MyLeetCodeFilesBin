import java.util.*;

public class TwoSum {
    public int[] twoSumFunc(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("At "+i+": ");
            if (map.containsKey(target - numbers[i])) {
                System.out.println("Got in IF");
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
            for (Integer key: map.keySet()){
                System.out.println(key+ ": " + map.get(key));
            }
            System.out.println("/////////");
        }
        return result;
    }

    public static void main(String[] args) {
        TwoSum ts1 = new TwoSum();
        int[] nums = {2,7,11,15};
        int[] result = ts1.twoSumFunc(nums, 17);

        System.out.println();
        System.out.println("FINALLL");
        for (int i = 0; i < result.length;i++) 
        {
            System.out.println(result[i]);
        }
    }
}

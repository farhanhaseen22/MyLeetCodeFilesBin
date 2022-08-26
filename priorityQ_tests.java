import java.util.*;

public class priorityQ_tests {

    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        
        numbers.add(7);
        System.out.println("PriorityQueue: " + numbers);
        numbers.add(4);
        System.out.println("PriorityQueue: " + numbers);
        numbers.add(13);
        System.out.println("PriorityQueue: " + numbers);
        numbers.add(6);
        System.out.println("PriorityQueue: " + numbers);

        numbers.offer(2);
        System.out.println("PriorityQueue: " + numbers);
        numbers.offer(3);
        System.out.println("PriorityQueue: " + numbers);
        numbers.offer(9);
        System.out.println("PriorityQueue: " + numbers);
        Arrays.sort(numbers.toArray());
        System.out.println("After sorting: " + numbers);


        // System.out.println("///////////");
        // System.out.println("Item: " + numbers.poll());
        // System.out.println("Item: " + numbers.peek());
        // System.out.println("Item: " + numbers.poll());
        System.out.println("///////////");

        while (!numbers.isEmpty()) {
            System.out.println(numbers.poll());
        }
    }
}

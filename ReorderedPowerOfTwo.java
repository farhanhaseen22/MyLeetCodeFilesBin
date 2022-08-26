import java.util.Arrays;

public class ReorderedPowerOfTwo {
    public boolean reordering(int N) {
        System.out.println("The N: "+N);
        
        char[] res1 = String.valueOf(N).toCharArray();
        for (int i = 0; i < res1.length; i++) {
            System.out.print(res1[i]+" - ");
        }
        Arrays.sort(res1);
        
        System.out.println("\n//////////////////////");
        for (int i = 0; i < 30; i++) {
            System.out.println("Turn: "+i);

            char[] res2 = String.valueOf(1 << i).toCharArray();
            for (int k = 0; k < res2.length; k++) {
                System.out.print(res2[k]+" - ");
            }
            Arrays.sort(res2);
            if (Arrays.equals(res1, res2)) return true;
            System.out.println();
        }
        return false;
    }
    
    public static void main(String[] args) {
        ReorderedPowerOfTwo px4 = new ReorderedPowerOfTwo();
        
        System.out.println("After going thru the method: ");
        boolean res = px4.reordering(16);
        System.out.println(res);

        // byte a = 9, b;
        // int i;
        
        // i = a << 2;
        // b = (byte)(a << 2);
        // System.out.println("Original value of a: " + a);
        // System.out.println("i and b: " + i + " and " + b);
    }
}

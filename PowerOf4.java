public class PowerOf4 {
    public boolean isPowerOfFour(int num) {
        if (num <= 0) return false;
        int trial = num & (num - 1);
        System.out.println("Trial: "+trial);
        if (trial != 0) return false;
        System.out.println("Passed Trial");
        return num % 3 == 1;
    }
    
    public static void main(String[] args) {
        PowerOf4 px4 = new PowerOf4();
        
        // for (int M = 1; M <= 16; M++) {
        //     int trial = M & (M - 1);
        //     System.out.println("For number "+M+": "+trial);
        // }
        
        boolean res = px4.isPowerOfFour(3);
        System.out.println(res);
    }
}

public class PowerOf3 {
    public boolean isPowerOfThree(int n) {
        double logVal = (Math.log10(n) / Math.log10(3));
        boolean verdict = logVal % 1 == 0;
        return verdict;
    }
    
    public static void main(String[] args) {
        PowerOf3 px4 = new PowerOf3();
        
        // for (int M = 1; M <= 16; M++) {
        //     int trial = M & (M - 1);
        //     System.out.println("For number "+M+": "+trial);
        // }
        
        System.out.println("After going thru the method: ");
        boolean res = px4.isPowerOfThree(9);
        System.out.println(res);
    }
}

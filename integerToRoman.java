public class integerToRoman {
    public String intToRoman(int num) {
        int[] numerals = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanNums = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        
        StringBuilder strManipulator = new StringBuilder();
        
        for(int i=0;i<numerals.length;i++) {
            while(num >= numerals[i]) {
                num -= numerals[i];
                if(i!=0)
                    strManipulator.append("-"+romanNums[i]);
                else
                    strManipulator.append(romanNums[i]);
            }
        }
        return strManipulator.toString();
    }

    public static void main(String[] args) {
        integerToRoman itr = new integerToRoman();

        String res = itr.intToRoman(1783);
        System.out.println(res);
    }
}

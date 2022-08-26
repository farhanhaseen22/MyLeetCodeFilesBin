import java.util.HashMap;

public class canConstructFromRansomNote {
    public boolean isPowerOfFour(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : magazine.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for(char c : ransomNote.toCharArray()){
            if(!map.containsKey(c) || map.get(c) < 1) return false;
            map.put(c, map.get(c) - 1);
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        canConstructFromRansomNote can = new canConstructFromRansomNote();
        
        boolean res = can.isPowerOfFour("aa","aab");
        System.out.println(res);
    }
}

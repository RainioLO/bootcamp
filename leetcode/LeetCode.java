public class LeetCode {
    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for(int k = 0; k < words[i].length(); k++){
                if(!allowed.contains(String.valueOf(words[i].charAt(k)))){
                 break;
                }
                if(k == words[i].length()-1){
                     count++;
                }
                
            }
            
        }
        return count;
    }

    public static void main(String arg[]) {
        String allowed = "ab";
        String[] words = new String[] {"ad", "bd", "aaab", "baa", "badab"};
        System.out.println(countConsistentStrings(allowed, words));
    }
}

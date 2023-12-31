public class MergeStringsAlternately_1768 {
    public static String mergeAlternately(String word1, String word2){
        StringBuilder word = new StringBuilder();
        int i = 0;
        while(i<word1.length() || i<word2.length()){
            if(i<word1.length()){
                word.append(word1.charAt(i));
            }
            if(i<word2.length()){
                word.append(word2.charAt(i));
            }
            i++;
        }
        return word.toString();
    }
    public static void main(String[] args){
        String word1="abc";
        String word2="pqr";
        String word3 = "ab";
        String word4 = "pqrs";
        System.out.println(mergeAlternately(word1, word2));
        System.out.println(mergeAlternately(word3, word4));
    }
}

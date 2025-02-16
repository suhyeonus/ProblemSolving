import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int TC = Integer.parseInt(br.readLine());
        testLoop: for(int testCase = 0; testCase < TC; testCase++) {
            // input 
            int wordsAmount = Integer.parseInt(br.readLine());
            String[] words = new String[wordsAmount];
            for(int wa = 0; wa < wordsAmount; wa++) 
                words[wa] = br.readLine();
            
            boolean isPalindrome = false;
            for(int i = 0; i < wordsAmount; i++) {
                for(int j = 0; j < wordsAmount; j++) {
                    if (i == j) continue;
                    String newWord = words[i] + words[j];
                    if(palindrome(newWord) == true) {
                        isPalindrome = true;
                        System.out.println(newWord);
                        continue testLoop;
                    }
                }
            }
            if (isPalindrome == false) System.out.println(0);
        }
    }

    static boolean palindrome(String str) {
        for(int x = 0; x < str.length()/2; x++) {
            if(str.charAt(x) != str.charAt(str.length() - (x + 1)))
                return false;
        }
        return true;
    }
}
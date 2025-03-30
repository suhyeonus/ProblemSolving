import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        String s = "";
        int[] alp = new int[26];

            while ((input = br.readLine()) != null) { 
                s += input;
            }
            for(int i = 0; i < s.length(); i++)
                if (Character.isLowerCase(s.charAt(i)))
                    alp[s.charAt(i) - 97]++;

            int maxVal = -1;
            for(int i = 0; i < 26; i++)
                if (alp[i] > maxVal) maxVal = alp[i];
            for(int i = 0; i < 26; i++)
                if (alp[i] == maxVal)
                    System.out.printf("%c", i+97);
        
    }
}

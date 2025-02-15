import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String name = br.readLine();
        int[] alphabet = new int[26];
        
        // 알파벳 개수 세기
        for(int i = 0; i < name.length(); i++)
            alphabet[name.charAt(i) - 'A']++;
        
        // 개수가 홀수인 알파벳 세기 
        int isOdd = 0, oddIndex = 0;
        for(int i = 0; i < 26; i++) {
            if (alphabet[i] % 2 != 0) {
                isOdd++;
                oddIndex = i;

                if (isOdd > 1) {
                    System.out.print("I\'m Sorry Hansoo");
                    return;
                }
            }
        }
        
        // 팰린드롬의 앞부분 만들기 
        for(int i = 0; i < 26; i++)
            for(int j = 0; j < alphabet[i]/2; j++) 
                sb.append((char)(i + 'A'));
        
        // 홀수인 알파벳이 존재할 경우 중간에 추가하기
        // 팰린드롬의 앞부분을 뒤집어 뒷부분 완성하기 
        String result = sb.toString();
        if(isOdd != 0)  result += (char)(oddIndex + 'A');
        System.out.print(result + sb.reverse().toString());
    }
}
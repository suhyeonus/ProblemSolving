import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer mn = new StringTokenizer(br.readLine(), " ");
        int m = Integer.parseInt(mn.nextToken());
        int n = Integer.parseInt(mn.nextToken());
        
        int[] answer = new int[5];
        String[] windows = new String[m*5 + 1];
        for (int i = 0; i < m*5 + 1; i++) 
            windows[i] = br.readLine();
        
        for (int i = 0; i < m; i++) {
    Loop2: for (int k = 0; k < n; k++) {
                boolean flag = false;
                for (int j = i*5 + 4; j > i*5; j--) { 
                    if (windows[j].charAt(k*5 + 1) == '*') {
                        answer[j%5]++;
                        flag = true;
                        continue Loop2;
                    }
                }
                if (flag == false) answer[0]++;
            }
        }
        for (int i = 0; i < 5; i++)
            System.out.printf("%d ", answer[i]);
    }
}

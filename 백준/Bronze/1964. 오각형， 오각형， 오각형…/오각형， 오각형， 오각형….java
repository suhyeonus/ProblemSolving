import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        long answer = 0;
        for(int i = 1; i <= N; i++) {
            answer += (long)(i * 5);
            if (i != 1)
                answer -= (i * 2) - 1;
            answer %= 45678;
        }
        System.out.print(answer);
    }
}

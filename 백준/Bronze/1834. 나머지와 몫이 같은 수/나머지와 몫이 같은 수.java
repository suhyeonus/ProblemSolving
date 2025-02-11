import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long N = Integer.parseInt(br.readLine());
        long answer = 0;

        for (long i = 1; i < N; i++) {
            answer += i + i*N; 
        }
        System.out.print(answer);
    }
}
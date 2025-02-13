import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long N = Integer.parseInt(br.readLine());
        long answer = 0, i = 1;

        while (N > 0) {
            if (i > N)
                i = 1;
            N -= i;
            answer++;
            i++;
        }
        System.out.print(answer);
    }
}
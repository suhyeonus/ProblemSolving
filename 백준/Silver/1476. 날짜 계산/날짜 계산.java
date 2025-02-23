import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer numbers = new StringTokenizer(br.readLine(), " ");
        
        int E = Integer.parseInt(numbers.nextToken());
        int S = Integer.parseInt(numbers.nextToken());
        int M = Integer.parseInt(numbers.nextToken());
        int e_count = 0, s_count = 0, m_count = 0;
        int answer = 0;

        while(true) {
            e_count++; s_count++; m_count++; 
            answer++;

            if(e_count > 15) e_count %= 15;
            if(s_count > 28) s_count %= 28;
            if(m_count > 19) m_count %= 19;

            if(e_count == E && s_count == S && m_count == M) break;
        }


        System.out.print(answer);
    }
}

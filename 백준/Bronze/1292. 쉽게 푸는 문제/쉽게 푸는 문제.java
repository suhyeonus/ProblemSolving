import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer numbers = new StringTokenizer(br.readLine(), " ");
        
        int start = Integer.parseInt(numbers.nextToken()) - 1;
        int end = Integer.parseInt(numbers.nextToken());
        int answer = 0;

        int index = 1;
        Loop1: while (true) {
            for(int i = 0; i < index; i++) {
                answer += index;
                end--;
                if(end <= 0) break Loop1;
            }
            index++;
        }

        index = 1;
        Loop2: while (start > 0) {
            for(int i = 0; i < index; i++) {
                answer -= index;
                start--;
                if(start <= 0) break Loop2;
            }
            index++;
        }

        System.out.print(answer);
    }
}

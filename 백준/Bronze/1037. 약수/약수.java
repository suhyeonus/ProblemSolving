import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer numbers = new StringTokenizer(br.readLine(), " ");
        int maxInt = 0;
        int minInt = 1000001;
        
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(numbers.nextToken());
            if (maxInt < num) maxInt = num;
            if (minInt > num) minInt = num;
        }

        System.out.print(maxInt * minInt);
    }
}
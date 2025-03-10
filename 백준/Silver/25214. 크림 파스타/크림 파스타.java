import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];
        int min = 1000000001;
        int result = 0;

        StringTokenizer Ai = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(Ai.nextToken());
            min = Math.min(min, A[i]);
            result = Math.max(result, A[i]-min);
            System.out.print(result + " ");
        }
    }
}

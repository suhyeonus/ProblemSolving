import java.io.*;
import java.util.*;

public class Main {
    static int M, N, K;
    static int[][] graph, visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        int[] music = new int[N];
        int totalTime = 0;
        for(int i = 0; i < N; i++) {
            int currentTime = Integer.parseInt(br.readLine());
            music[i] = currentTime;
            totalTime += currentTime;
        }

        int[] totalLength = new int[totalTime];
        int index = 0;
        for(int i = 0; i < N; i++) {
            int currentTime = music[i];
            while(currentTime-- > 0)
                totalLength[index++] = i+1;
        }

        while(Q-- > 0) {
            int quest = Integer.parseInt(br.readLine());
            System.out.println(totalLength[quest]);
        }
    }

}

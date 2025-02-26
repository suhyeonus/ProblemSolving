import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer nm = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(nm.nextToken());
        int m = Integer.parseInt(nm.nextToken());

        int[][] painting = new int[100][100];
        for(int tc = 0; tc < n; tc++) {
            StringTokenizer xy = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(xy.nextToken());
            int y1 = Integer.parseInt(xy.nextToken());
            int x2 = Integer.parseInt(xy.nextToken());
            int y2 = Integer.parseInt(xy.nextToken());
        
            for(int i = x1-1; i < x2; i++) {
                for(int j = y1-1; j < y2; j++)
                    painting[i][j]++;                    
            }
        }
        
        int answer = 0;
        for(int i = 0; i < 100; i++) 
            for(int j = 0; j < 100; j++)
                if (painting[i][j] > m) answer++;             

        System.out.print(answer);
    }
}

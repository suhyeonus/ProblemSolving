import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer nm = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(nm.nextToken());
        int m = Integer.parseInt(nm.nextToken());

        int[][] array = new int[n][m];
        int[][] prefixSum = new int[n+1][m+1];

        for(int i = 0; i < n; i++) {
            StringTokenizer arrayLine = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < m; j++) 
                array[i][j] = Integer.parseInt(arrayLine.nextToken());
        }

        for(int i = 1; i <= n; i++) 
            for(int j = 1; j <= m; j++)
                prefixSum[i][j] = array[i-1][j-1] + prefixSum[i-1][j] + prefixSum[i][j-1] - prefixSum[i-1][j-1];
        
        int k = Integer.parseInt(br.readLine());
        while(k-- > 0) {
            StringTokenizer point = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(point.nextToken()); 
            int y1 = Integer.parseInt(point.nextToken()); 
            int x2 = Integer.parseInt(point.nextToken()); 
            int y2 = Integer.parseInt(point.nextToken()); 
            
            System.out.println(prefixSum[x2][y2] - prefixSum[x1-1][y2] - prefixSum[x2][y1-1] + prefixSum[x1-1][y1-1]);
        }
    }
}

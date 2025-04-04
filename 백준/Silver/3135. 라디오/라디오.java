import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer ab = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(ab.nextToken());
        int b = Integer.parseInt(ab.nextToken());

        int answer = 0;
        int now = a;

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            int radio = Integer.parseInt(br.readLine());
            if(Math.abs(now-b) > Math.abs(radio - b))
                now = radio;
        }
        
        if(now != a) answer++;
        System.out.print(answer + Math.abs(now-b));
      
    }
}

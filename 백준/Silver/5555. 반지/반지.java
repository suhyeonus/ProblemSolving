import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String letter = br.readLine();

        int answer = 0;
        int n = Integer.parseInt(br.readLine());

        while(n-- > 0) {
            String ring = br.readLine();
            ring += ring;
            if (ring.contains(letter)) answer++;
        }

        System.out.print(answer);
    }
}

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long M = Long.parseLong(st.nextToken());
        long N = Long.parseLong(st.nextToken());

        StringBuilder sb = new StringBuilder();
        for(long i = 0; i < gcd(M, N); i++)
            sb.append("1");
        System.out.print(sb);
    }

    public static long gcd(long a, long b) {
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}

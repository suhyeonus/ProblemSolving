import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());

        if (A<0 && B<0) 
            answer += (B-A) * C;
        else if (A>0 && B>0) 
            answer += (B-A) * E;
        else 
            answer += (A*C*-1) + (B*E) + D;

        System.out.print(answer);
    }
}
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int i = 1, j = 1;
        int answer = 0, nowSum = 1;
        while(i <= j && i <= N && j <= N) {
            if(nowSum == N) {
                answer++;
                j++;
                nowSum += j;
            } else if(nowSum > N) {
                nowSum -= i;
                i++;
            } else {
                j++;
                nowSum += j;
            }
        }

        System.out.print(answer);
    }

}

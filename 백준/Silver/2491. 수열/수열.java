import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[N];
        for(int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        int big = 1;
        int small = 1;

        int[] bigArr = new int[N];
        int[] smallArr = new int[N];

        bigArr[0] = 1;
        smallArr[0] = 1;

        for(int i = 1; i < N; i++) {
            if(arr[i] >= arr[i-1]) {
                bigArr[i] = bigArr[i - 1] + 1;
                if(bigArr[i] > big) big = bigArr[i];
            } else bigArr[i] = 1;

            if(arr[i] <= arr[i-1]) {
                smallArr[i] = smallArr[i - 1] + 1;
                if(smallArr[i] > small) small = smallArr[i];
            } else smallArr[i] = 1;
        }

        System.out.print(Math.max(big, small));
    }

}

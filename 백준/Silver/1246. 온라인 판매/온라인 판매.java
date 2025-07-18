import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Integer[] price = new Integer[M];
        for(int i = 0; i < M; i++)
            price[i] = Integer.parseInt(br.readLine());

        Arrays.sort(price, Collections.reverseOrder());
        int minVal = price[M-1];
        int maxVal = price[0];

        int answerPrice = 0, totalPrice = 0, nowPrice;
        for(int i = minVal; i <= maxVal; i++) {
            nowPrice = 0;
            for(int j = 0; j < Math.min(N, M); j++) {
                if(i <= price[j])
                    nowPrice += i;
            }
            if(nowPrice > totalPrice) {
                totalPrice = nowPrice;
                answerPrice = i;
            }
        }

        System.out.printf("%d %d", answerPrice, totalPrice);

    }

}

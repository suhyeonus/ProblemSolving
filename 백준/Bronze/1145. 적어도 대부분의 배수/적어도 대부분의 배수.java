import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int[] numbers = new int[5];
        int MIN_VALUE = 101;
        for (int i = 0; i < 5; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
            if (numbers[i] < MIN_VALUE) MIN_VALUE = numbers[i];
        }

        while (true) {
            int counter = 0;
            for (int i = 0; i < 5; i++) 
                if (MIN_VALUE % numbers[i] == 0)
                    counter++;
            if (counter >= 3) {
                System.out.print(MIN_VALUE);
                break;
            }
            MIN_VALUE++;
        }
    }
}

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        for (int i = 0; i < 8; i++) {
            String board = br.readLine();
            for (int j = 0; j < 8; j++) {
                if (board.charAt(j) == 'F' && (i+j)%2 == 0)  
                    answer++;
            }
        }
        System.out.print(answer);
    }
}
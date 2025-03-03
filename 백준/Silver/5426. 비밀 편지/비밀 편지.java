import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int testCase = 0; testCase < N; testCase++) {
            String letter = br.readLine();
            int letterLength = (int)Math.sqrt(letter.length());
            
            for (int i = letterLength - 1; i >= 0; i--) 
                for (int j = 0; j < letterLength; j++) 
                    System.out.print(letter.charAt(j * letterLength + i));

            System.out.print("\n");
        }
    }
}

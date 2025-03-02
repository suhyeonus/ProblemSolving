import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Loop1: for(int i = N; i >= 4; i--) {
            String stN = Integer.toString(i);

            for(int j = 0; j < stN.length(); j++) {
                if (!(stN.charAt(j) == '4' || stN.charAt(j) == '7')) 
                    continue Loop1;
            }
            
            System.out.print(i);
            break Loop1;
        }
    }
}

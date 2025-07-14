import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N;
        int answer;

        while(true) {
            N = br.readLine();
            if(N.equals("0")) break;

            answer = N.length() + 1;
            for(int i = 0; i < N.length(); i++) {
                if(N.charAt(i) == '1') answer += 2;
                else if(N.charAt(i) == '0') answer += 4;
                else answer += 3;
            }

            System.out.println(answer);
        }
    }

}

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String bowls = br.readLine();
        int answer = 10;
        for(int i = 1; i < bowls.length(); i++) {
            if(bowls.charAt(i) == bowls.charAt(i-1)) answer += 5;
            else answer += 10;
        }

        System.out.print(answer);

    }

}

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String a = st.nextToken();
        String b = st.nextToken();
        ;
        long answer = 0;
        for(int i = 0; i < a.length(); i++)
            for(int j = 0; j < b.length(); j++)
                answer += ((long)a.charAt(i) - 48) * ((long)b.charAt(j) - 48);

        System.out.print(answer);
    }

}

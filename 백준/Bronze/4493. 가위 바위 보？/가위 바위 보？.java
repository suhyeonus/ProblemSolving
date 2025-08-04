import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        int n;
        int[] players;
        char a, b;
        while(t-- > 0) {
            n = Integer.parseInt(br.readLine());
            players = new int[2];

            while(n-- > 0) {
                st = new StringTokenizer(br.readLine(), " ");
                a = st.nextToken().charAt(0);
                b = st.nextToken().charAt(0);

                if(a == 'R') {
                    if(b == 'S') players[0]++;
                    else if(b == 'P') players[1]++;
                }
                else if(a == 'S') {
                    if(b == 'P') players[0]++;
                    else if(b == 'R') players[1]++;
                }
                else if(a == 'P') {
                    if(b == 'R') players[0]++;
                    else if(b == 'S') players[1]++;
                }
            }

            if(players[0] > players[1]) System.out.println("Player 1");
            else if(players[0] < players[1]) System.out.println("Player 2");
            else System.out.println("TIE");

        }

    }

}

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer NM = new StringTokenizer(br.readLine(), " ");
        
        // input
        int N = Integer.parseInt(NM.nextToken());
        int M = Integer.parseInt(NM.nextToken());

        StringBuilder answerStr = new StringBuilder();
        int answer = 0;


        String[] dnas = new String[N];
        for(int n = 0; n < N; n++)
            dnas[n] = br.readLine();

        // hamming distance
        for(int m = 0; m < M; m++) {
            int[] count = new int[4];
            for(int n = 0; n < N; n++) {
                char ch = dnas[n].charAt(m);
                switch (ch) {
                    case 'A':
                        count[0]++;
                        break;
                    case 'C':
                        count[1]++;
                        break;
                    case 'G':
                        count[2]++;
                        break; 
                    case 'T':
                        count[3]++;
                        break;
                }
            }

            // max value
            int index = 0, maxVal = -1;
            for(int i = 0; i < 4; i++) {
                if(count[i] > maxVal) {
                    index = i;
                    maxVal = count[i];
                }
            }

            switch (index) {
                case 0:
                    answerStr.append('A');
                    break;
                case 1:
                    answerStr.append('C');
                    break;
                case 2:
                    answerStr.append('G');
                    break; 
                case 3:
                    answerStr.append('T');
                    break;
            }
            answer += N - maxVal;
        }
        System.out.println(answerStr);
        System.out.print(answer);
    }
}

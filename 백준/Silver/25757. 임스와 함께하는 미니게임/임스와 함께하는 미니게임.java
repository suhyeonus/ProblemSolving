import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        char game = st.nextToken().charAt(0);

        int answer = 0;
        int count = 1;
        int gameType = 2;
            switch (game) {
                case 'F': 
                    gameType = 3;
                    break;
                case 'O':
                    gameType = 4;
                    break;
            }

        HashMap<String, Integer> nameDic = new HashMap<>();
        for (int tc = 0; tc < N; tc++) {
            String name = br.readLine();
            if (nameDic.containsKey(name) == false) {
                nameDic.put(name, 1);
                count++;
                
                if (count == gameType) {
                    answer++;
                    count = 1;
                }
            }
        }

        System.out.print(answer);
    }
}

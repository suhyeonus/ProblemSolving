import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String l = br.readLine();
        String enKey = br.readLine();

        for(int i = 0 ; i < l.length(); i++) {
            if(l.charAt(i) == ' ') System.out.print(' ');
            else {
                int key = (int)enKey.charAt(i % enKey.length()) - 96;
                int encryp = l.charAt(i) - key;
                System.out.print(encryp >= 97 ? (char)encryp : (char)(encryp + 26));
            }
        }
    }

}

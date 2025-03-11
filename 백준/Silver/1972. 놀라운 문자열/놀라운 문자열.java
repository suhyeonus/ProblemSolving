import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = br.readLine();
            if (str.charAt(0) == '*') break;

            boolean isPerfect = true;
            int len = str.length() - 1;

            Loop1: for(int i = 0; i < len; i++) {
                HashMap<String, Integer> isExist = new HashMap<>();
                for(int j = 0; j < len - i; j++) {
                    String pair = str.charAt(j) + "" + str.charAt(i+j+1);
                    if (isExist.containsKey(pair)) {
                        isPerfect = false;
                        break Loop1;
                    } else isExist.put(pair, 1);
                }               
            }

            if (isPerfect) System.out.print(str + " is surprising.\n");
            else System.out.print(str + " is NOT surprising.\n");
        }
    }
}

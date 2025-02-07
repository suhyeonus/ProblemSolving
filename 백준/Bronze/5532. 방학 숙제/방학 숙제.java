import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(bf.readLine());
        int A = Integer.parseInt(bf.readLine());
        int B = Integer.parseInt(bf.readLine());
        int C = Integer.parseInt(bf.readLine());
        int D = Integer.parseInt(bf.readLine());

        double maxLength = 0;
        maxLength = Math.max((double)A/(double)C, (double)B/(double)D);
        maxLength = Math.ceil(maxLength);

        System.out.print(L - (int)maxLength);
    }
}
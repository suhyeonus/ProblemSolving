import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());
            
            if (day == 0 && month == 0 && year == 0) break;
            
            // leaf year
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
                dayOfMonth[1] = 29;
            else dayOfMonth[1] = 28;
            
            for(int i = 0; i < month - 1; i++)
                day += dayOfMonth[i];

            System.out.println(day);
            
        }
    }
}
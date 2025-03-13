import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int topping = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        HashMap<String, Integer> listOfTopping = new HashMap<>();

        for (int i = 0; i < topping; i++) {
            String kindOfTopping = st.nextToken();
            if (kindOfTopping.endsWith("Cheese"))
                listOfTopping.put(kindOfTopping, 1);
            
            if (listOfTopping.size() == 4) {
                System.out.print("yummy");
                break;
            } 
        } 

        if (listOfTopping.size() < 4)
            System.out.print("sad");
    }
}

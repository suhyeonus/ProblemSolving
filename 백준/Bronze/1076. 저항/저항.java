import java.io.*;
import java.util.*;

class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<String, int[]> h = new HashMap<>();
		h.put("black" , new int[]{0, 1});
		h.put("brown" , new int[]{1, 10});
		h.put("red"   , new int[]{2, 100});
		h.put("orange", new int[]{3, 1000});
		h.put("yellow", new int[]{4, 10000});
		h.put("green" , new int[]{5, 100000});
		h.put("blue"  , new int[]{6, 1000000});
		h.put("violet", new int[]{7, 10000000});
		h.put("grey"  , new int[]{8, 100000000});
		h.put("white" , new int[]{9, 1000000000});
		
		long answer = 0;
		answer += h.get(br.readLine())[0] * 10;
		answer += h.get(br.readLine())[0];
		System.out.print(answer * h.get(br.readLine())[1]);
	}
}

 
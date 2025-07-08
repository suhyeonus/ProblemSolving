import java.io.*;
import java.util.*;

class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] color = {"black", "brown", "red", "orange", "yellow", 
						  "green", "blue", "violet", "grey", "white"};
		
		long answer = Arrays.asList(color).indexOf(br.readLine()) * 10
					+ Arrays.asList(color).indexOf(br.readLine());
		System.out.print(answer * (int)Math.pow(10, Arrays.asList(color).indexOf(br.readLine())));
	}
}

 
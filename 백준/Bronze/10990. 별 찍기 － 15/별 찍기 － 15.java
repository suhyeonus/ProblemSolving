import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < n - i; j++)
                System.out.print(" ");
            
            if (i == 1) System.out.println("*");
            else {
                System.out.print("*");
                for(int j = 0; j < (i-1)*2 - 1; j++)
                    System.out.print(" ");
                System.out.println("*");
            }
        }
    }
}

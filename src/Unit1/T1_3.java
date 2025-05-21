package Unit1;

import java.util.Scanner;
public class T1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            int sum = 0;
            for(int j = 1; j < i; j++) {
                if(i % j == 0) {
                    sum += j;
                }
            }
            if(sum == i) {
                System.out.print(i);
                for(int j = 1; j < i; j++) {
                    if(i % j == 0) {
                        System.out.print(" " + j);
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
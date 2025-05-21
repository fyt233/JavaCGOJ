package Unit1;

import java.util.Scanner;

public class T1_2 {
    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=a;i<100;i++){
            if(isPrime(i) && isPrime(i + 2) &&i+2<100){
                System.out.println(i + " " + (i+2));
            }
        }
        sc.close();
    }
}

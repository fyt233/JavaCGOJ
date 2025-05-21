package Unit1;

import java.util.Scanner;

public class T1_5 {
    public static void main(String[] args) {
        System.out.println("please input 1-99999 integer number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = n;
        //位数
        int x = (int) Math.log10(n) + 1;

        boolean flag = true;
        int[] arr = new int[5];
        sc.close();
        System.out.println(n + " is " + x + " bit");
        for (int i = 0; i < x; i++) {
            arr[i] = n % 10;
            n = n / 10;
        }
        for (int i = 0; i < x / 2; i++) {
            if (arr[i] != arr[x - i - 1]) {
                flag = false;
                break;
            }
        }
//
        if (flag) {
            System.out.println(s + " is a palindrome number");
        } else {
            System.out.println(s + " is not a palindrome number");
        }
    }
}

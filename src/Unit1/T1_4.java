package Unit1;

import java.util.Scanner;

public class T1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String[] temp1 = line1.split(" ");
        int[] num1 = new int[temp1.length];
        for (int i = 0; i < temp1.length; i++) {
            num1[i] = Integer.parseInt(temp1[i]);
        }
        String line2 = sc.nextLine();
        String[] temp2 = line2.split(" ");
        int[] num2 = new int[temp2.length];
        for (int i = 0; i < temp2.length; i++) {
            num2[i] = Integer.parseInt(temp2[i]);
        }
        int[] ans1 = new int[20];
        int[] ans2 = new int[20];

        int p = 0;//计数器
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num2.length; j++) {
                if (num1[i] == num2[j]) {
                    ans1[p] = num1[i];
                    p++;

                }
            }
        }
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < p; j++) {
                if (num1[i] == ans1[j]) {
                    num1[i] = -99999;
                    break;
                }
            }
        }
        for (int i = 0; i < num2.length; i++) {
            for (int j = 0; j < p; j++) {
                if (num2[i] == ans1[j]) {
                    num2[i] = -99999;
                    break;
                }
            }
        }
        int p1 = 0;//counter
        for (int i = 0; i < num1.length; i++) {
            if (num1[i] != -99999) {
                ans2[p1] = num1[i];
                p1++;
            }
        }

        for (int i = 0; i < num2.length; i++) {
            if (num2[i] != -99999) {
                ans2[p1] = num2[i];
                p1++;
            }
        }
        for (int i = 0; i < p; i++) {
            for (int j = i; j < p; j++) {
                if (ans1[i] < ans1[j]) {
                    int temp = ans1[i];
                    ans1[i] = ans1[j];
                    ans1[j] = temp;
                }
            }
        }
        for (int i = 0; i < p1; i++) {
            for (int j = i; j < p1; j++) {
                if (ans2[i] < ans2[j]) {
                    int temp = ans2[i];
                    ans2[i] = ans2[j];
                    ans2[j] = temp;
                }
            }
        }
        for (int i = 0; i < p1; i++) {
            System.out.print(ans2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < p; i++) {
            System.out.print(ans1[i] + " ");
        }
        sc.close();
    }
}

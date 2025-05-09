import java.util.Scanner;

public class T1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        for (int i = a; i <= b; i++) {
            if (i % 4 == 0) {
                if (i % 100 != 0) {
                    System.out.print(i + " ");
                }
                if (i % 400 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}


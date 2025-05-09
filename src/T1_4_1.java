
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class T1_4_1 {

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
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        int counter = 0;
        for (int i = 0; i < num1.length; i++)
            for (int j = 0; j < num2.length; j++) {
                if (num1[i] == num2[j]) {
                    list1.add(num1[i]);
                    counter++;
                }
            }
        for (int i = 0; i < num1.length; i++) {
            list2.add(num1[i]);
        }
        for (int i = 0; i < num2.length; i++) {
            list2.add(num2[i]);
        }
        for (int i = 0; i < list2.size(); i++) {
            for (int j = 0; j < list1.size(); j++) {
                if (list2.get(i) == list1.get(j)) {
                    list2.remove(i);
                }
            }
        }
        Collections.sort(list2, Collections.reverseOrder());
        Collections.sort(list1, Collections.reverseOrder());


        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
    }

}

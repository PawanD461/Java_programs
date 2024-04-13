// Pair sum approach 1 (Brute force) O(n^2)

import java.util.ArrayList;
import java.util.Scanner;

public class no75 {
    public static void checkPair(ArrayList<Integer> intList, int target) {
        int count = 0;
        for (int i = 0; i < intList.size(); i++) {
            for (int j = i + 1; j < intList.size(); j++) {
                if (intList.get(i) + intList.get(j) == target) {
                    System.out.println("Founded Pair is (" + intList.get(i) + "," + intList.get(j) + ")");
                    count++;
                }
            }
        }
        if (count > 0) {
            System.out.println("Total Pairs are: " + count);
            return;
        } else {
            System.out.println("Such Pair Doesn't Exist");
            return;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(7);
        intList.add(5);
        intList.add(2);
        intList.add(8);
        intList.add(3);
        intList.add(1);
        intList.add(4);
        intList.add(9);

        System.out.println("Enter The target");
        int target = sc.nextInt();
        checkPair(intList, target);
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> items = new ArrayList<Integer>();
        System.out.println("Enter a few integers to see their sum, and press 0 when done entering.");
        while (true) {
            Integer data = Integer.parseInt(in.nextLine());
            if (data == 0) {
                break;
            } else {
                items.add(data);
            }
        }
        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i) + ", ");
        }
        System.out.println("were the integers in the list. " + "The sum of that list is " + "\n" + sum(items));
        in.close();
    }

    public static int sum(ArrayList<Integer> item) {
        int sums = 0;
        for (int num : item) {
            sums += num;
        }
        return sums;
    }
}
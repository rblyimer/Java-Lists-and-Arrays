import java.util.Scanner;
import java.util.ArrayList;

public class IndexOfInteger {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            ArrayList<Integer> items = new ArrayList<Integer>();
            System.out.println("Enter a few integers, and press 0 when done entering.");
            for (int i = 0; i < items.size() + 1; i++) {
                int data = in.nextInt();
                if (data == 0) {
                System.out.println("Done entering integers into the list");
                System.out.println("Enter the number you want to see the index of");
                int num = in.nextInt();
                for (int x = 0; x < items.size(); x++) {
                    if (items.get(x) == num) {
                    System.out.println(num + " is at index " + x);
                        }
                    }
                } else {
                    items.add(data);
                }
            }
        }
    }
}
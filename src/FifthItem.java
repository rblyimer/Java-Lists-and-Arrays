import java.util.Scanner;
import java.util.ArrayList;

public class FifthItem {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            ArrayList <String> items = new ArrayList <String> ();
            System.out.println("Enter 5 items or more.");
            System.out.println("then Enter an empty string to see the fifth item.");
            for (int i = 0; i < items.size() + 1; i++) {
                String data = in.nextLine();
                if (data.isBlank()) {
                    System.out.println("The fifth item in the list is: " + items.get(4));
                } else {
                    items.add(data);
                }
            }
        }
    }
}
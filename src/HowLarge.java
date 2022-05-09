import java.util.Scanner;
import java.util.ArrayList;

public class HowLarge {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            ArrayList <String> items = new ArrayList<String>();
            System.out.println("Enter a few items,"); 
            System.out.println("then enter an empty string to see the total number of itemss.");
            for (int i = 0; i < items.size() + 1; i++) {
                String data = in.nextLine();
                if (data.isBlank()) {
                    System.out.println("The total amount of items in the list was: " + items.size());
                } else {
                    items.add(data);
                }
            }
        }
    }
}
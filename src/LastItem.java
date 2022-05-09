import java.util.Scanner;
import java.util.ArrayList;

public class LastItem {
    public static void main(String[] args) throws Exception {
        try (Scanner in = new Scanner(System.in)) {
            ArrayList<String> items = new ArrayList<String>();
            System.out.println("Enter a few items,");
            System.out.println("Then enter an empty string to see the last item.");
            for (int i = 0; i < items.size() + 1; i++) {
                String data = in.nextLine();
            if (data.isBlank()) {
                int x = items.size() - 1;
                System.out.println("The last item in the list is: " + items.get(x));
            } else {
                    items.add(data);
                }
            }
        }
    }
}
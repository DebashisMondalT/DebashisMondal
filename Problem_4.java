import java.util.*;
public class Problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numbers separated by spaces: ");
        String inputLine = sc.nextLine();
        String[] inputStrings = inputLine.trim().split(" ");
        List<Integer> numbers = new ArrayList<>();

        for (String str : inputStrings) {
            try {
                numbers.add(Integer.parseInt(str));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + str + " is not a number. Skipping.");
            }
        }

        Map<Integer, Integer> multiplesCount = new LinkedHashMap<>();

        for (int i = 1; i <= 9; i++) {
            multiplesCount.put(i, 0);
        }

        for (int i = 1; i <= 9; i++) {
            for (int num : numbers) {
                if (num % i == 0) {
                    multiplesCount.put(i, multiplesCount.get(i) + 1);
                }
            }
        }

        System.out.println("Output: ");
        System.out.println(multiplesCount);

        sc.close();
    }
}

import java.util.*;
class StringRepeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print string: ");
        String input = scanner.nextLine();
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : input.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        List<Character> chars = new ArrayList<>();
        for (char c : input.toCharArray()) {
            if (counts.get(c) == 1) {
                chars.add(c);
            }
        }
        if (chars.size() == 0) {
            System.out.print("null");
        } else {System.out.print(chars.get(0));}
    }
}

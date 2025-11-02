public class Main {

    public static void main(String[] args) {
        // Test cases
        String[] test1a = {"Red", "Green", "Blue"};
        String[] test1b = {"Red", "Green", "Blue"};
        System.out.println(ColorArrayComparer.compareColorArrays(test1a, test1b)); // true

        String[] test2a = {"red", "green"};
        String[] test2b = {"Red", "Green"};
        System.out.println(ColorArrayComparer.compareColorArrays(test2a, test2b)); // true

        String[] test3a = {"Blue", "Yellow"};
        String[] test3b = {"Yellow", "Blue"};
        System.out.println(ColorArrayComparer.compareColorArrays(test3a, test3b)); // false
    }

}

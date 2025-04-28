public class BalancedBracketsTester {
    public static void main(String[] args) {
        BalancedBrackets checker = new BalancedBrackets();

        // Test cases
        System.out.println("( ) is " + (checker.isBalanced("()") ? "Balanced" : "Unbalanced")); // Balanced
        System.out.println("( ( ) ) is " + (checker.isBalanced("(())") ? "Balanced" : "Unbalanced")); // Balanced
        System.out.println("( ( ( ) ) ) is " + (checker.isBalanced("((()))") ? "Balanced" : "Unbalanced")); // Balanced
        System.out.println("( ( ) ( ) ) is " + (checker.isBalanced("(()())") ? "Balanced" : "Unbalanced")); // Balanced

        System.out.println("( ( ) is " + (checker.isBalanced("(()") ? "Balanced" : "Unbalanced")); // Unbalanced
        System.out.println(") ( ) is " + (checker.isBalanced(")(") ? "Balanced" : "Unbalanced")); // Unbalanced
    }
}

import java.util.Scanner;

public class ScannerInputExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = scanner.nextLine();   // will capture all input including text after a space "hello world"

        System.out.print("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine()); // gets input as string and converts to int
        //int age = scanner.nextInt();  // will cause error going to next piece of code

        System.out.print("Enter response: ");
        //String response = scanner.next();   // will NOT capture all input; input = "hello world", output will be "hello"
        String response = scanner.nextLine();

        System.out.println();
        System.out.printf("Input text value:\n\"%s\"\n", text);
        System.out.printf("Input age value:\n\"%d\"\n", age);
        System.out.printf("Input response value:\n\"%s\"\n", response);
    }
}

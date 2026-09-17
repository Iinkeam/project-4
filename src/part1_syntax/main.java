package part1_syntax;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. while loop:
        System.out.println("Let's count from 1 to 5!");
        int count = 1;
        while (count < 6) {
            System.out.println(count);
            count++;
        }

        // 2. do while loop:
        int number;
        do {
            System.out.print("Now, please enter a positive number: ");
            number = scanner.nextInt();
        } while (number <= 0);

        System.out.println("Thank you! You entered: " + number);

        // 3. for loop:
        for (int a = 1; a <= 10; a++) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int b = 10; b >= 1; b--) {
            System.out.print(b + " ");
        }
        System.out.println("");

        // 4. String loop:
        String word = "HELLO WORLD";
        for (int c = 0; c < word.length(); c++) {
            char letter = word.charAt(c);
            System.out.println(letter);
        }
        System.out.println();

        // 5. nested loop:
                for (int row = 1; row <= 3; row++) {
                    for (int line = 1; line <= 3; line++) {
                        System.out.print("(" + row + ", " + line + ") ");
                    }
                    System.out.println();
                }
            }
        }

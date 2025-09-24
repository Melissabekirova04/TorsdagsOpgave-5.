import java.util.Scanner;  // 2.c - vi importerer Scanner klassen

public class Main2 {
    public static void main(String[] args) {
        // 2.b - print en besked til brugeren
        System.out.println("Please type your name");

        // 2.c - opret en Scanner til at læse input fra tastaturet
        Scanner scanner = new Scanner(System.in);

        // 2.d - læs navnet som en String
        String name = scanner.nextLine();

        // 2.e - print en hilsen og bed om alder
        System.out.println("Hello " + name);
        System.out.println("Please type your age");

        // 2.f - læs alder som et helt tal (int)
        int age = scanner.nextInt();

        // 2.g - print alderen
        System.out.println("You are " + age + " years old");

        // 2.h - beregn hvor mange år til pension (vi antager 67 år)
        int retirementAge = 67;
        int yearsToRetirement = retirementAge - age;

        System.out.println("You have " + yearsToRetirement + " years until retirement");
    }
}

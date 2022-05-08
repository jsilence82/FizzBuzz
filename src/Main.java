import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");

        int userNumber = scanner.nextInt();
        if(userNumber % 5 == 0 && userNumber % 3 == 0)
            System.out.println("FizzBuzz");
        else if (userNumber % 5 == 0)
            System.out.println("Fizz");
        else if (userNumber % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(userNumber);

    }
}
import java.util.Scanner;

public class Exercise {
    Scanner in = new Scanner(System.in);

    String greet() {
        System.out.println("What's you name?");
        String nameInput = in.nextLine();
        return nameInput;
    }

    int AgeAsking() {
        System.out.println("What's your age?: ");
        int age = in.nextInt();
        return age;
    }

    public static void main(String[] args) {
        Exercise prog = new Exercise();

        String name = prog.greet();

        System.out.println("It Works!");
        System.out.println("Hej " + name);
        System.out.println("Hej " + name);
        System.out.println("Hej " + name);


        int age = prog.AgeAsking();
        System.out.println("Your age is " + age);
    }
}

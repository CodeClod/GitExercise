import java.util.Scanner;

public class Exercise {
    Scanner in = new Scanner(System.in);

    String greet() {
        String nameInput = in.nextLine();
        return nameInput;
    }

    public static void main(String[] args) {
        Exercise prog = new Exercise();

        String name = prog.greet();

        System.out.println("It Works!");
    }
}

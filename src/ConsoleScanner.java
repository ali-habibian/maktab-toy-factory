import java.util.Scanner;

public class ConsoleScanner {
    Scanner input = new Scanner(System.in);
    public int resultInt() {

        return input.nextInt();
    }

    public double resultDouble() {
        return input.nextDouble();
    }

    public String resultString(){
        return input.next();
    }
}

import java.util.*;

public class Menu {
    Scanner input = new Scanner(System.in);

    public void menu() {
        System.out.println("             ---------------------Menu----------------------");
        System.out.println("             Add Toy                               : 1      |");
        System.out.println("             Add Discount for Toy[id]              : 2      |");
        System.out.println("             Register Customer                     : 3      |");
        System.out.println("             Buy Toy                               : 4      |");
        System.out.println("             List Toys In Store                    : 5      |");
        System.out.println("             Which toys did the customer[id] buy?  : 6      |");
        System.out.println("             customer[id] budget                   : 7      |");
        System.out.println("             Exit                                  : 8      |");
        System.out.println("             Which option do you choose? :                   ");
    }
}

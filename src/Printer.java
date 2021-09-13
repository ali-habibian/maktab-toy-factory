import java.util.Random;

public class Printer {
    private ConsoleScanner scan = new ConsoleScanner();
    private Store store = new Store();

    public void print() {
        Menu menu = new Menu();
        while (true) {
            menu.menu();
            int input = scan.resultInt();
            if (input == 1) {
                addToyToStore();
            } else if (input == 2) {
                addDiscountForToy();
            } else if (input == 3) {
                registerCustomer();
            } else if (input == 4) {
                buyToy();
            } else if (input == 5) {
                listToysInStore();
            } else if (input == 6) {
                WhichToysCustomerBuyed();
            } else if (input == 7) {
                customerBudget();
            } else if (input == 8) {
                break;
            }
        }
    }

    private void addToyToStore() {
        Toy toy = null;
        Random rnd = new Random();
        int id = rnd.nextInt(100) + 1;

        System.out.println("Enter type of toy: ");
        System.out.println("1.Car");
        System.out.println("2.Doll");
        System.out.println("3.Helicopter");
        int type = scan.resultInt();

        System.out.println("Enter size of toy: ");
        System.out.println("1.Small");
        System.out.println("2.Medium");
        System.out.println("3.Large");
        int size = scan.resultInt();

        System.out.println("Enter base price of toy: ");
        double basePrice = scan.resultDouble();

        ToySize toySize = null;
        switch (size) {
            case 1:
                toySize = ToySize.SMALL;
                break;
            case 2:
                toySize = ToySize.MEDIUM;
                break;
            case 3:
                toySize = ToySize.LARGE;
                break;
            default:
        }

        String name;
        switch (type) {
            case 1:
                name = "Car";
                toy = new Car(id, toySize, name, basePrice);
                break;
            case 2:
                name = "Doll";
                toy = new Doll(id, toySize, name, basePrice);
                break;
            case 3:
                name = "Helicopter";
                toy = new Helicopter(id, toySize, name, basePrice);
                break;
            default:
        }
        store.addToyToStore(toy);
    }

    private void addDiscountForToy() {
        System.out.println("Enter toy id that you want to add discount for it: ");
        store.listToys();
        int id = scan.resultInt();

        System.out.println("Enter discount percentage: ");
        double discount = scan.resultDouble();

        store.addDiscount(discount, id);
    }

    private void registerCustomer() {
        Customer customer;
        Cart cart = new Cart();

        Random rnd = new Random();
        int id = rnd.nextInt(100) + 1;

        System.out.println("Enter your first name: ");
        String firstName = scan.resultString();

        System.out.println("Enter your last name: ");
        String lastName = scan.resultString();

        System.out.println("Enter your age: ");
        int age = scan.resultInt();

        System.out.println("Enter your city: ");
        String city = scan.resultString();

        System.out.println("Enter your budget: ");
        double budget = scan.resultDouble();

        customer = new Customer(id, firstName, lastName, age, city, budget, cart);

        store.registerCustomer(customer);

        System.out.println(firstName + " you are registered and your id is: " + id + " don't forgot it");
    }

    private void buyToy() {
        System.out.println("Enter your customer id: ");
        int customerID = scan.resultInt();
        Customer customer = store.getCustomers().search(customerID);

        System.out.println("Enter toy id that you want to buy: ");
        store.listToys();
        int toyID = scan.resultInt();

        Toy toy = store.getToysInStore().search(toyID);

        customer.buyToy(store, toy);
        store.removeToyFromStore(toy);
    }

    private void listToysInStore() {
        store.listToys();
    }

    private void WhichToysCustomerBuyed() {
        System.out.println("Enter your customer id: ");
        int customerID = scan.resultInt();
        Customer customer = store.getCustomers().search(customerID);
        customer.getCart().printBuyedToys();
    }

    private void customerBudget() {
        System.out.println("Enter your customer id: ");
        int customerID = scan.resultInt();
        Customer customer = store.getCustomers().search(customerID);
        double budget = customer.getBudget();
        System.out.println("Your budget is: " + budget);
    }

}

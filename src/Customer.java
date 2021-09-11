public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String city;
    private double budget;
    private Cart cart;

    public Customer(int id, String firstName, String lastName, int age, String city, double budget, Cart cart) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
        this.budget = budget;
        this.cart = cart;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public void buyToy(Toy toy) {
        if (budget >= toy.getPrice()) {
            cart.addToyToCart(toy);
            budget -= toy.getPrice();
        } else {
            System.out.println("Your budget is not enough");
        }
    }
}

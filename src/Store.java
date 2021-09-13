
public class Store {
    private ToyArray toysInStore = new ToyArray();

    private CustomerArray customers = new CustomerArray();

    public void addToyToStore(Toy toy) {
        toysInStore.addToy(toy);
    }

    public void removeToyFromStore(Toy toy) {
        toysInStore.removeToy(toy);
    }

    public void addDiscount(double discount, int id) {
        Toy toy = toysInStore.search(id);

        if (toy != null){
            toy.setDiscount(discount);
        }
    }

    public void listToys (){
        toysInStore.print();
    }

    public void registerCustomer(Customer customer){
        customers.addCustomer(customer);
    }

    public ToyArray getToysInStore() {
        return toysInStore;
    }

    public CustomerArray getCustomers() {
        return customers;
    }
}

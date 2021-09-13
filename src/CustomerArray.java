public class CustomerArray {
    private Customer[] customers;

    private int size;
    private int capacity;

    public CustomerArray() {
        customers = new Customer[2];

        for (Customer customer : customers) {
            customer = new Customer();
        }

        size = 0;
        capacity = 2;
    }

    public void addCustomer(Customer customer) {
        if (size == capacity) {
            Customer[] temp = new Customer[capacity * 2];

            if (capacity >= 0) System.arraycopy(customers, 0, temp, 0, capacity);
            customers = temp;
            capacity = capacity * 2;
        }

        customers[size] = customer;
        size++;
        trim();
    }

    public Customer search(int id) {
        trim();

        for (Customer customer : customers) {
            if (id == customer.getId()) {
                return customer;
            }
        }

        return null;
    }

    public void trim() {
        Customer[] temp = new Customer[size];
        System.arraycopy(customers, 0, temp, 0, size);
        customers = temp;
        capacity = customers.length;
    }
}

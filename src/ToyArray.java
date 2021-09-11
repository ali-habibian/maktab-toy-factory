public class ToyArray {
    private Toy[] toys;

    private int size;
    private int capacity;

    public ToyArray() {
        toys = new Toy[2];

        for (Toy toy : toys) {
            toy = new Toy();
        }

        size = 0;
        capacity = 2;
    }

    public void addToy(Toy toy) {
        if (size == capacity) {
            Toy[] temp = new Toy[capacity * 2];

            for (int i = 0; i < capacity; i++) {
                temp[i] = toys[i];
            }
            toys = temp;
            capacity = capacity * 2;
        }

        toys[size] = toy;
        size++;
        trim();
    }

    // Remove an element with its id
    public void removeToy(Toy toy) {
        int toyIndex = 0;
        for (int i = 0; i < toys.length; i++) {
            if (toy.getId() == toys[i].getId()) {
                toyIndex = i;
            }
        }
        for (int i = toyIndex; i < size - 1; i++) { // Shift all elements after given id to left
            toys[i] = toys[i + 1];
        }
        // Set last id 0
        toys[size - 1] = null;
        size--;
        trim();
    }

    public Toy search(int id) {
        trim();

        for (Toy toy : toys) {
            if (id == toy.getId()) {
                return toy;
            }
        }

        return null;
    }

    //  Trim the capacity of array to the current size and remove unused space
    public void trim() {
        // System.out.println("Trimming the array");
        // Create temp array with length of our elements
        Toy[] temp = new Toy[size];

        for (int i = 0; i < size; i++) { // Copy old array elements to temp
            temp[i] = toys[i];
        }
        toys = temp;
        capacity = toys.length;
    }

    public Toy[] getToys() {
        return this.toys;
    }
}

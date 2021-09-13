public class ToyArray {
    private Toy[] toys;

    private int size;
    private int capacity;

    public ToyArray() {
        this.toys = new Toy[2];

        for (Toy toy : this.toys) {
            toy = new Toy();
        }

        this.size = 0;
        this.capacity = 2;
    }

    public void addToy(Toy toy) {
        if (this.size == this.capacity) {
            Toy[] temp = new Toy[this.capacity * 2];

            for (int i = 0; i < this.capacity; i++) {
                temp[i] = this.toys[i];
            }
            this.toys = temp;
            this.capacity = this.capacity * 2;
        }

        this.toys[size] = toy;
        this.size++;
        //trim();
    }

    // Remove an element with its id
    public void removeToy(Toy toy) {
        int toyIndex = -1;
        for (int i = 0; i < size; i++) {
            if (toy.getId() == this.toys[i].getId()) {
                toyIndex = i;
            }
        }
        for (int i = toyIndex; i < size - 1; i++) { // Shift all elements after given id to left
            this.toys[i] = this.toys[i + 1];
        }
        // Set last id 0
        this.toys[size - 1] = null;
        this.size--;
        //trim();
    }

    public Toy search(int id) {
        //trim();

        for (Toy toy : this.toys) {
            if (id == toy.getId()) {
                return toy;
            }
        }

        return null;
    }

    //  Trim the capacity of array to the current size and remove unused space
    public void trim() {
        Toy[] temp = new Toy[this.size];
        // Copy old array elements to temp
        System.arraycopy(this.toys, 0, temp, 0, this.size);
        this.toys = temp;
        this.capacity = this.toys.length;
    }

    public Toy[] getToys() {
        return this.toys;
    }

    public void print() {
        for (int i = 0; i < this.size; i++) { // Search in array elements
            System.out.println(this.toys[i]);
        }
        System.out.println();
    }
}

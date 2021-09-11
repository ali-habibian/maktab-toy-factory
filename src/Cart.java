public class Cart {
    private Store store = new Store();
    private ToyArray toys = new ToyArray();

    public void addToyToCart(Toy toy) {
        toys.addToy(toy);

        // TODO
        store.removeToyFromStore(toy);
    }

    public Toy[] getBuyedToys() {
        return toys.getToys();
    }
}
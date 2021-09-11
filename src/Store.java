
public class Store {
    private ToyArray toys = new ToyArray();

    public void addToyToStore(Toy toy) {
        toys.addToy(toy);
    }

    public void removeToyFromStore(Toy toy) {
        toys.removeToy(toy);
    }

    public void addDiscount(double discount, int id) {
        Toy toy = toys.search(id);

        toy.setDiscount(discount);
    }


}

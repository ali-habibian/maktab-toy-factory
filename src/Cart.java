public class Cart {
    private final ToyArray toysInCart = new ToyArray();

    public void addToyToCart(Store store, Toy toy) {
        toysInCart.addToy(toy);
//        store.removeToyFromStore(toy);
    }

    public Toy[] getBuyedToys() {
        return toysInCart.getToys();
    }

    public void printBuyedToys(){
        Toy[] tempToys = getBuyedToys();
        for (Toy toy : tempToys) {
            System.out.println(toy);
        }
    }
}
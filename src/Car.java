public class Car extends Toy {

    public Car(int id, ToySize size, String name, double basePrice) {
        super(id, size, name, basePrice);

    }

    @Override
    public double getPrice() {
        if (this.getSize().equals(ToySize.SMALL)) {
            return this.getBasePrice() * 2;
        } else if (this.getSize().equals(ToySize.MEDIUM)) {
            return this.getBasePrice() * 2.5;
        } else if (this.getSize().equals(ToySize.LARGE)) {
            return this.getBasePrice() * 3;
        }
        return 0;
    }

    @Override
    public double getPrice(double discount) {
        double a = discount / 100;
        if (this.getSize().equals(ToySize.SMALL)) {
            return (this.getBasePrice() - this.getBasePrice() * a) * 2;
        } else if (this.getSize().equals(ToySize.MEDIUM)) {
            return (this.getBasePrice() - this.getBasePrice() * a) * 2.5;
        } else if (this.getSize().equals(ToySize.LARGE)) {
            return (this.getBasePrice() - this.getBasePrice() * a) * 3;
        }
        return 0;
    }


}

public class Toy {
    private int id;
    private ToySize size;
    private String name;
    private double basePrice;
    private double discount = 0;

    public Toy() {
    }

    public Toy(int id, ToySize size, String name, double basePrice) {
        this.id = id;
        this.size = size;
        this.name = name;
        this.basePrice = basePrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public ToySize getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setSize(ToySize size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getPrice(double discount) {
        double a = discount / 100;
        if (size.equals(ToySize.SMALL)) {
            return (basePrice - basePrice * a);
        } else if (size.equals(ToySize.MEDIUM)) {
            return 1.5 * (basePrice - basePrice * a);
        } else if (size.equals(ToySize.LARGE)) {
            return 2 * (basePrice - basePrice * a);
        }
        return 0;
    }

    public double getPrice() {
        if (discount > 0) {
            return getPrice(discount);
        } else {
            if (size.equals(ToySize.SMALL)) {
                return basePrice;
            } else if (size.equals(ToySize.MEDIUM)) {
                return 1.5 * basePrice;
            } else if (size.equals(ToySize.LARGE)) {
                return 2 * basePrice;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", size=" + size +
                ", name='" + name + '\'' +
                ", basePrice=" + basePrice +
                ", discount=" + discount +
                '}';
    }
}

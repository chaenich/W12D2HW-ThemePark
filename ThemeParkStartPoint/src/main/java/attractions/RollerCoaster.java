package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public double defaultPrice() {
        return 8.40;
    }

    public double priceFor(Visitor visitor) {
        double price = defaultPrice();
        if (visitor.getHeight() > 2.0) {
            price = defaultPrice() * 2;
        }
        return price;
    }

}

package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ITicketed, ISecurity {

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

    public boolean isAllowedTo(Visitor visitor) {
        return (visitor.getHeight() > 1.45 && visitor.getAge() >= 12);
    }
}

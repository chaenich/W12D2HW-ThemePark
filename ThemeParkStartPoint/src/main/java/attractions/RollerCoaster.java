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
//        double price = defaultPrice();
//        if (visitor.getAge() < 12) {
//            price = defaultPrice() * 0.5;
//        }
        return 0.0;
    }

}

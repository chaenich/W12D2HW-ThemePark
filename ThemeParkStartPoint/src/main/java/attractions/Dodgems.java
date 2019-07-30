package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed, IReviewed {
    private double defaultPrice;

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public double defaultPrice() {
        return 4.50;
    }

    public double priceFor(Visitor visitor) {
        double price = defaultPrice();
        if (visitor.getAge() < 12) {
            price = defaultPrice() * 0.5;
        }
        return price;
    }

}

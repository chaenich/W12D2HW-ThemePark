package stalls;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity, IReviewed {
    int rating;

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, ownerName, parkingSpot);
        this.rating = rating;
    }

    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() >= 18;
    }

    public int getRating() {
        return rating;
    }
}

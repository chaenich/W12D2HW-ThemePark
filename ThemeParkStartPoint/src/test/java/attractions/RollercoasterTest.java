package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.01);
    }

    @Test
    public void chargesDoubleIfPersonOver200() {
        Visitor visitor;
        visitor = new Visitor(116, 2.1, 40.0);
        assertEquals(16.80, rollerCoaster.priceFor(visitor), 0.01);
    }

    @Test
    public void chargesNormalIfPersonLessThanEqualTo200() {
        Visitor visitor;
        visitor = new Visitor(116, 1.9, 40.0);
        assertEquals(8.40, rollerCoaster.priceFor(visitor), 0.01);
    }

    @Test
    public void notAllowedOnLessThan145TallAndYoungerThan12() {
        Visitor visitor;
        visitor = new Visitor(11, 1.4, 40.0);
        assertEquals(false,  rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void notAllowedOnLess145TallButOlderThan12() {
        Visitor visitor;
        visitor = new Visitor(13, 1.4, 40.0);
        assertEquals(false,  rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void notAllowedOnMoreThan145TallButYoungerThan12() {
        Visitor visitor;
        visitor = new Visitor(11, 1.6, 40.0);
        assertEquals(false,  rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void allowedOnMoreThan145TallAndOlderThan12() {
        Visitor visitor;
        visitor = new Visitor(13, 1.5, 40.0);
        assertEquals(true,  rollerCoaster.isAllowedTo(visitor));
    }
}

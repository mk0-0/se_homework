import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderTest {

    @Test
    void init(Order order) {
        order.initHotpot("A0504001", Region.Chengdu, Spiciness.Slightly, Size.Medium, new ArrayList<>(), 0);
    }

    @Test
    void place() {
        Order order = new Order();
        init(order);

        order.addFood(order.getHotpotByID("A0504001"), "Mutton");
        order.addFood(order.getHotpotByID("A0504001"), "Yam");
        order.addFood(order.getHotpotByID("A0504001"), "Quail Egg");
        order.addFood(order.getHotpotByID("A0504001"), "Shrimp");

        assertEquals(order.payByID(order.getHotpotByID("A0504001")), 84);
    }
}

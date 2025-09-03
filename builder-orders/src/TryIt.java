import com.example.orders.*;

import java.util.List;

public class TryIt {
    public static void main(String[] args) {
        OrderLine l1 = new OrderLine("A", 1, 200);
        OrderLine l2 = new OrderLine("B", 3, 100);

        // Using Builder directly
        Order order1 = new Order.Builder("o1", "a@b.com")
                .addLine(l1)
                .addLine(l2)
                .discountPercent(10)
                .expedited(true)
                .notes("Deliver ASAP")
                .build();

        System.out.println("Order1 total after discount: " + order1.totalAfterDiscount());

        // Using OrderService
        OrderService service = new OrderService();
        Order order2 = service.createOrder("o2", "x@y.com", List.of(l1, l2), 5, false, "No rush");

        System.out.println("Order2 total after discount: " + order2.totalAfterDiscount());

       
    }
}

public class Demo09 {
    public static void main(String[] args) {
        // choose SQL or in-memory implementation at runtime
        OrderRepository repo = new SqlOrderRepository();
        OrderController controller = new OrderController(repo);

        controller.create("ORD-1");
    }
}

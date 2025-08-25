public class OrderController {
    private final OrderRepository repo;

    // Dependency injected via constructor
    public OrderController(OrderRepository repo) {
        this.repo = repo;
    }

    public void create(String id) {
        repo.save(id);
        System.out.println("Created order: " + id);
    }
}

public class Demo01 {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator(0.18);
        Notifier emailNotifier = new EmailClient();
        OrderRepository repository = new OrderRepository();

        OrderService service = new OrderService(taxCalculator, emailNotifier, repository);
        service.checkout("a@shop.com", 100.0);
    }
}
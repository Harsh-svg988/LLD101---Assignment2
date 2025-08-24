public class Demo04 {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        System.out.println(service.pay(new Payment("UPI", 499)));
        System.out.println(service.pay(new Payment("CARD", 1200)));
        System.out.println(service.pay(new Payment("WALLET", 250)));
    }
}
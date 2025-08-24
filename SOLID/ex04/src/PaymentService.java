class PaymentService {
    String pay(Payment p) {
        PaymentProvider provider = PaymentProviderFactory.getProvider(p.provider);
        return provider.pay(p.amount);
    }
}
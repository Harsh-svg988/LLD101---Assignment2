class PaymentProviderFactory {
    static PaymentProvider getProvider(String provider) {
        switch (provider) {
            case "CARD": return new CardPayment();
            case "UPI": return new UpiPayment();
            case "WALLET": return new WalletPayment();
            default: throw new IllegalArgumentException("Unknown provider: " + provider);
        }
    }
}

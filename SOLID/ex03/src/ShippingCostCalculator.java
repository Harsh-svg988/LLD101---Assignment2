class ShippingCalculator {
    private final ShippingStrategy strategy;

    ShippingCalculator(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    double cost(Shipment s) {
        return strategy.cost(s);
    }
}
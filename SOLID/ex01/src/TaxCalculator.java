class TaxCalculator {
    private final double taxRate;

    TaxCalculator(double taxRate) {
        this.taxRate = taxRate;
    }

    double totalWithTax(double subtotal) {
        return subtotal + subtotal * taxRate;
    }
}
public class Demo03 {
    public static void main(String[] args) {
        Shipment shipment = new Shipment(2.0);

        ShippingCalculator standardCalc =
            new ShippingCalculator(new StandardShipping());
        ShippingCalculator expressCalc =
            new ShippingCalculator(new ExpressShipping());
        ShippingCalculator overnightCalc =
            new ShippingCalculator(new OvernightShipping());

        System.out.println("Standard: " + standardCalc.cost(shipment));
        System.out.println("Express: " + expressCalc.cost(shipment));
        System.out.println("Overnight: " + overnightCalc.cost(shipment));
    }
}
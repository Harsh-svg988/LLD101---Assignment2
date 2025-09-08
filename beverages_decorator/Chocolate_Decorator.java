package beverages_decorator;
public class Chocolate_Decorator extends Beverage {
    Beverage beverage;
    public Chocolate_Decorator(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public int cost() {
        return 100 + this.beverage.cost();
    }
}

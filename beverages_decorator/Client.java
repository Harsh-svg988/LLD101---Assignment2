package beverages_decorator;
import beverages_decorator.Beverage;
import beverages_decorator.Cappuccino;
public class Client {

	public static void main(String[] args) {
		
		Beverage coffee = new Cappuccino();
		System.out.println("Coffee");
		System.out.println(coffee.cost());
		coffee = new Chocolate_Decorator(coffee);
		System.out.println("Coffee with chocolate");
		System.out.println(coffee.cost());
		
		

	}

}
package package1;

import java.util.HashMap;
import java.util.Map;

public class Shop {

	Map<Food, Integer> shop = new HashMap<>();

	public void addProduct(Food food, int value) {

		if (food.hashCode() == shop.keySet().hashCode()) {
			int otherValue = shop.get(food);
			shop.put(food, otherValue + value);
		} else {
			shop.put(food, value);
		}

	}

	public int quantityByName(Food food) {
		if (shop.containsKey(food)) {
			return shop.get(food);
		} else {
			return 0;
		}
	}
}

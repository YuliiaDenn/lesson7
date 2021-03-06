package package1;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Food banana = new Food("Fruits", "banana");
		Food kiwi = new Food("Fruits", "kiwi");
		Food potato = new Food("Vegetables", "potato");
		Map<Food, Integer> food = new HashMap<>();

		food.put(banana, 3);
		food.put(kiwi, 7);
		food.put(banana, 8);
		food.put(potato, 12);
		food.put(potato, 22);
		banana.nameFood.replace("banana", "kiwi");

		for (Map.Entry<Food, Integer> entry : food.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue() + " kilo");
		}

		System.out.println("How many kilo of potatoes are there? - " + food.get(potato));
		System.out.println();

		Shop shop = new Shop();
		shop.addProduct(new Food("fruit", "limon"), 3);
		shop.addProduct(new Food("fruit", "limon"), 5);
		shop.addProduct(new Food("fruit", "kiwi"), 5);

		System.out.println(shop.quantityByName(new Food("fruit", "limon")));
		System.out.println(shop.quantityByName(new Food("fruit", "kiwi")));

	}

}

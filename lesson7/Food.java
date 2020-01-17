package package1;

public class Food {

	String kindOfFood;
	String nameFood;

	Food(String kindOfFood, String nameFood) {
		this.kindOfFood = kindOfFood;
		this.nameFood = nameFood;
	}

	public String getName() {
		return kindOfFood;
	}

	public String getAmount() {
		return nameFood;
	}

	@Override
	public String toString() {
		return "Food: " + kindOfFood + " " + nameFood;
	}
}

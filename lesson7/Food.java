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

	public String getkindOfFood() {
		return nameFood;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kindOfFood == null) ? 0 : kindOfFood.hashCode());
		result = prime * result + ((nameFood == null) ? 0 : nameFood.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		if (kindOfFood == null) {
			if (other.kindOfFood != null)
				return false;
		} else if (!kindOfFood.equals(other.kindOfFood))
			return false;
		if (nameFood == null) {
			if (other.nameFood != null)
				return false;
		} else if (!nameFood.equals(other.nameFood))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Food: " + kindOfFood + " " + nameFood;
	}
}

import java.util.*;

public class DogFishCat {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();

		animals.add("dog");
		animals.add("cat");
		animals.add("snake");
		animals.set(2, "lizard");
		animals.add(1, "fish");
		animals.remove(3);
		System.out.println(animals);
	}
}
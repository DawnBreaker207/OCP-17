package CollectionsAndGenerics.SortingData;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortRabbits {
    static record Rabbit(int id) {

    }

    public static void main(String[] args) {
	List<Rabbit> rabbits = new ArrayList<>();
	rabbits.add(new Rabbit(3));
	rabbits.add(new Rabbit(1));
	Comparator<Rabbit> c1 = (r1, r2) -> r1.id - r2.id;
	Collections.sort(rabbits, c1);
	Collections.reverse(rabbits);
	System.out.println(rabbits);

	var names = Arrays.asList("Fluffy", "Hoppy");
	Comparator<String> c2 = Comparator.reverseOrder();
	var index = Collections.binarySearch(names, "Hoppy", c2);
	System.out.println(index);

    }

}

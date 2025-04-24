package CollectionsAndGenerics.SortingData;

import java.util.ArrayList;
import java.util.List;

public class TestSort {
    public static void main(String[] args) {
	List<String> bunnies = new ArrayList<>();
	bunnies.add("long ear");
	bunnies.add("floppy");
	bunnies.add("hoppy");
	System.out.println(bunnies); // [long ear, floppy, hoppy]
	bunnies.sort((b1, b2) -> b1.compareTo(b2));
	System.out.println(bunnies);
    }
}

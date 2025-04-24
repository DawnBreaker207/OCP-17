package CollectionsAndGenerics.ListInterface;

import java.util.*;

public class ListInterface {

    public static void main(String[] args) {
	String[] array = new String[] { "a", "b", "c" };

	List<String> asList = Arrays.asList(array);
	List<String> of = List.of(array);
	List<String> copy = List.copyOf(asList);

	array[0] = "Z";

	System.out.println(asList);
	System.out.println(of);
	System.out.println(copy);

	asList.set(0, "x");
	System.out.println(Arrays.toString(array));

	copy.add("y"); // UnsupportedOperationException

//	Creating List with a constructor
	var linked1 = new LinkedList<String>();
	var linked2 = new LinkedList<String>(linked1);
//	var linked3 = new LinkedList<String>(10);

	List<String> list1 = new ArrayList<>();
	list1.add("SD");
	list1.add(0, "NY");
	list1.set(1, "FL");
	System.out.println(list1.get(0));
	list1.remove("NY");
	list1.remove(0);
	list1.set(0, "?"); // IndexOutOfBoundsException

	var numbers = Arrays.asList(1, 2, 3);
	numbers.replaceAll(x -> x * 2);
	System.out.println(numbers);

	List<String> list2 = new ArrayList<>();
	list2.add("hawk");
	list2.add("robin");
	Object[] objectArray = list2.toArray();
	String[] stringArray = list2.toArray(new String[0]);
	list2.clear();
	System.out.println(objectArray.length);
	System.out.println(stringArray.length);
	
    }

}
